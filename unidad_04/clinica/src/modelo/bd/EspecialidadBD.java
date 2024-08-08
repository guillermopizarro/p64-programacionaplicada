/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.bd;

import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.BD;
import modelo.dominio.Especialidad;

/**
 *
 * @author guill
 */
public class EspecialidadBD extends Especialidad implements ObjetoBD {

    private BD bd;
    
    public EspecialidadBD() {
        this.bd = new BD();
    }
    
    @Override
    public void registrar(Object objeto) {
        try {
            Especialidad especialidad = (Especialidad) objeto;
            
            this.bd.conectar();
            String sql = "INSERT INTO especialidad (nombre) VALUES (?)";
            this.bd.setPs( this.bd.getCon().prepareStatement(sql) );
            this.bd.getPs().setString(1, especialidad.getNombre());
            this.bd.getPs().execute();
            
            this.bd.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(Object objeto) {
        try {
            Especialidad especialidad = (Especialidad) objeto;
            
            this.bd.conectar();
            String sql = "UPDATE especialidad SET nombre = ? WHERE especialidad_id = ?";
            this.bd.setPs( this.bd.getCon().prepareStatement(sql) );
            this.bd.getPs().setString(1, especialidad.getNombre());
            this.bd.getPs().setInt(2, especialidad.getEspecialidad_id());
            this.bd.getPs().execute();
            
            this.bd.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(Object objeto) {
        try {
            Especialidad especialidad = (Especialidad) objeto;
            
            this.bd.conectar();
            String sql = "DELETE FROM especialidad WHERE especialidad_id = ?";
            this.bd.setPs( this.bd.getCon().prepareStatement(sql) );
            this.bd.getPs().setInt(1, especialidad.getEspecialidad_id());
            this.bd.getPs().execute();
            
            this.bd.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Object> buscar(Object objeto) {
        ArrayList<Object> especialidades = new ArrayList<Object>();
        
        try {
            Especialidad especialidad = (Especialidad) objeto;
            
            this.bd.conectar();
            String sql = "SELECT * FROM especialidad WHERE nombre LIKE ?";
            this.bd.setPs( this.bd.getCon().prepareStatement(sql) );
            this.bd.getPs().setString(1, "%" + especialidad.getNombre() + "%");
            
            ResultSet rs = this.bd.getPs().executeQuery();
            while(rs.next()) {
                Especialidad obj = new Especialidad();
                obj.setEspecialidad_id( rs.getInt("especialidad_id") );
                obj.setNombre( rs.getString( "nombre" ) );
                
                especialidades.add(obj);
            }
            this.bd.cerrar();
            
            return especialidades;
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return especialidades;        
    }

    @Override
    public ArrayList<Object> listar() {
        ArrayList<Object> especialidades = new ArrayList<Object>();
        
        try {
            this.bd.conectar();
            String sql = "SELECT * FROM especialidad";
            ResultSet rs = this.bd.ejecutar(sql);
            while(rs.next()) {
                Especialidad objeto = new Especialidad();
                objeto.setEspecialidad_id( rs.getInt("especialidad_id") );
                objeto.setNombre( rs.getString( "nombre" ) );
                
                especialidades.add(objeto);
            }
            this.bd.cerrar();
            
            return especialidades;
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return especialidades;
    }
    
    public static void main(String[] args) {
        Especialidad objeto = new Especialidad();
        objeto.setEspecialidad_id(2);
        objeto.setNombre("Cardiología Pediatrica");
        
        EspecialidadBD obj = new EspecialidadBD();
        obj.eliminar(objeto);
        
        ArrayList<Object> especialidades = obj.listar();
        for (Object esp : especialidades) {
            System.out.println( ((Especialidad) esp).getNombre() );
        }
    }
}
