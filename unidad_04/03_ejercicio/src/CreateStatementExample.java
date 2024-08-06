import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatementExample {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mariadb://localhost:3306/biblioteca";
        String username = "root";
        String password = "inexcelsisdeo";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Establecer la conexión
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Crear un objeto Statement
            statement = connection.createStatement();

            // Ejecutar una consulta SELECT
            String sql = "SELECT id, name, email FROM user";
            resultSet = statement.executeQuery(sql);

            // Procesar los resultados
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");

                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

            // Ejecutar una consulta UPDATE
            String updateSql = "UPDATE user SET email = 'new.email@example.com' WHERE id = 1";
            int rowsAffected = statement.executeUpdate(updateSql);
            System.out.println("Rows affected by UPDATE: " + rowsAffected);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar los recursos
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
