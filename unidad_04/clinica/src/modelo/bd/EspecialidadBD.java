/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.bd;

import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Object> buscar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
            }
            this.bd.cerrar();
            
            return especialidades;
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return especialidades;
    }
}
