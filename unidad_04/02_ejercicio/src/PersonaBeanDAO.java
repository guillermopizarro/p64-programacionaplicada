import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaBeanDAO {
    private static final String URL = "jdbc:mariadb://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PASSWORD = "inexcelsisdeo";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void insertarPersona(PersonaBean persona) {
        String sql = "INSERT INTO Persona (cedula, nombre, apellido) VALUES (?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, persona.getCedula());
            pstmt.setString(2, persona.getNombre());
            pstmt.setString(3, persona.getApellido());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<PersonaBean> obtenerPersonas() {
        List<PersonaBean> personas = new ArrayList<>();
        String sql = "SELECT cedula, nombre, apellido FROM Persona";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String cedula = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                personas.add(new PersonaBean(cedula, nombre, apellido));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return personas;
    }
}