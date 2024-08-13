/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.bd;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.BD;
import modelo.dominio.Usuario;

/**
 *
 * @author guill
 */
public class UsuarioBD extends Usuario implements ObjetoBD {

    private BD bd;

    public UsuarioBD() {
        this.bd = new BD();
    }
    
    @Override
    public void registrar(Object objeto) {
    }

    @Override
    public void modificar(Object objeto) {
    }

    @Override
    public void eliminar(Object objeto) {
    }

    @Override
    public ArrayList<Object> buscar(Object objeto) {
        return null;
    }

    @Override
    public ArrayList<Object> listar() {
        return null;
    }

    public Usuario autenticar() {
        try {
            this.bd.conectar();
            String sql = "SELECT * FROM usuario WHERE usuario = ? AND clave = ?";
            this.bd.setPs( this.bd.getCon().prepareStatement(sql) );
            this.bd.getPs().setString(1, this.getUsuario());
            this.bd.getPs().setString(2, this.getClave());
            
            ResultSet rs = this.bd.getPs().executeQuery();
            while(rs.next()) {
                Usuario objeto = new Usuario();
                objeto.setUsuario_id(rs.getInt("usuario_id") );
                objeto.setNombre(rs.getString( "nombre" ) );
                objeto.setApellido(rs.getString( "apellido" ) );
                objeto.setUsuario(rs.getString( "usuario" ) );
                
                return objeto;
            }
            this.bd.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
