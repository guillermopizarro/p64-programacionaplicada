/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.bd.UsuarioBD;
import modelo.dominio.Usuario;

/**
 *
 * @author guill
 */
public class GestionarUsuario implements GestionarObjeto {
    
    private UsuarioBD usuario;
    
    public GestionarUsuario(Usuario usuario) {
        this.usuario = new UsuarioBD();
        this.usuario.setUsuario(usuario.getUsuario());
        this.usuario.setClave(usuario.getClave());
    }
    
    public GestionarUsuario() {
        
    }

    public Usuario autenticarUsuario() {
        return this.usuario.autenticar();
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
}
