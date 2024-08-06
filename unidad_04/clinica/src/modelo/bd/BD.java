package modelo.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BD {

    private Conexion conexion;
    private Archivo archivo;
    
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

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
    
    public ResultSet ejecutar(String sql) {
        try {
            this.ps = this.con.prepareStatement(sql);
            this.rs = this.ps.executeQuery();
            
            return this.rs;
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void cerrar() {
        try {
            if (this.con != null) {
                this.con.close();
            }
            if (this.ps != null) {
                this.ps.close();
            }            
            if (this.rs != null) {
                this.rs.close();
            }            
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
    
    public static void main(String[] args) {
        BD bd = new BD();
        bd.conectar();
    }
}
