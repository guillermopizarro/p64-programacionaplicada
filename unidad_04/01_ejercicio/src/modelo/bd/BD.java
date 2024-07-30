package modelo.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {

    private Conexion conexion;
    private Connection con;
    private Archivo archivo;

    public BD() {
        this.archivo = new Archivo();
        this.archivo.leerArchivo();
    }

    public void conectar() {
        try {
            Class.forName(this.archivo.getConexion().getDriverClass());
            this.con = DriverManager.getConnection( this.archivo.getConexion().urlConexion(), 
                this.archivo.getConexion().getUsuario(), 
                this.archivo.getConexion().getClave() );
            System.out.println( "[db] - Conexion exitosa. -- " + this.archivo.getConexion().getDriver() );
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println( "[error] - " + e.getMessage() );
        }
    }

    public static void main(String[] args) {
        BD bd = new BD();
        bd.conectar();
    }
}
