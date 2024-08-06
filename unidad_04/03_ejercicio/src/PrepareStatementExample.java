import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepareStatementExample {
    String jdbcUrl = "jdbc:mariadb://localhost:3306/biblioteca";
    String username = "root";
    String password = "inexcelsisdeo";

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;

    public PrepareStatementExample() {
        try {
            this.connection = DriverManager.getConnection(this.jdbcUrl, this.username, this.password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        
    }

    public void ejecutar() {
        String sql = "INSERT INTO user (name, email) VALUES (?, ?)";
        
        try {
            this.preparedStatement = this.connection.prepareStatement(sql);
            this.preparedStatement.setString(1, "Guillermo Pizarro");
            this.preparedStatement.setString(2, "gpizarro@ups.edu.ec");
            
            int rowsAffected = this.preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cerrar() {
        try {
            if (this.preparedStatement != null) 
                this.preparedStatement.close();
            if (this.connection != null) 
                this.connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PrepareStatementExample objeto = new PrepareStatementExample();
        objeto.ejecutar();
        objeto.cerrar();
    }
}