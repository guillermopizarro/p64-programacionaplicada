import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecuteQueryExample {
    String jdbcUrl = "jdbc:mariadb://localhost:3306/biblioteca";
    String username = "root";
    String password = "inexcelsisdeo";

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public ExecuteQueryExample() {
        try {
            this.connection = DriverManager.getConnection(this.jdbcUrl, this.username, this.password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        
    }

    public void ejecutar() {
        String sql = "SELECT id, name, email FROM user WHERE id = ?";
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 2);
            
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cerrar() {
        try {
            if (this.resultSet != null)
                this.resultSet.close();
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
        ExecuteQueryExample objeto = new ExecuteQueryExample();
        objeto.ejecutar();
        objeto.cerrar();
    }
}