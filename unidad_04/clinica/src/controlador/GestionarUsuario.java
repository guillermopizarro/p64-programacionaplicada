/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelo.bd.UsuarioBD;
import modelo.dominio.Usuario;
import vista.MenuPrincipal;

/**
 *
 * @author guill
 */
public class GestionarUsuario implements GestionarObjeto {
    
    private UsuarioBD usuario;
    
    public GestionarUsuario() {
    }
    
    public Usuario autenticarUsuario(JFrame ventana, JTextField usuarioTxt, JPasswordField passwordTxt) {
        if (!usuarioTxt.getText().trim().equals("") && !passwordTxt.getText().trim().equals("")) {            
            UsuarioBD usuario = new UsuarioBD();
            usuario.setUsuario( usuarioTxt.getText() );
            usuario.setClave( new String(passwordTxt.getPassword()) );
            Usuario usuario_admin = usuario.autenticar();
            
            if (usuario_admin != null) {
                MenuPrincipal menu = new MenuPrincipal(usuario_admin);
                menu.setVisible(true);
                
                ventana.setVisible(false);
            } else {
                Object[] options = {"Cerrar"};
                JOptionPane.showOptionDialog(null,
                                             "El usuario o la clave son incorrectas.",
                                             "Advertencia",
                                             JOptionPane.DEFAULT_OPTION,
                                             JOptionPane.WARNING_MESSAGE,
                                             null,
                                             options,
                                             options[0]);
            }
        } else {
                Object[] options = {"Cerrar"};
                JOptionPane.showOptionDialog(null,
                                             "El usuario o la clave no han sido ingresadas.",
                                             "Advertencia",
                                             JOptionPane.DEFAULT_OPTION,
                                             JOptionPane.WARNING_MESSAGE,
                                             null,
                                             options,
                                             options[0]);            
        }
        return null;
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
