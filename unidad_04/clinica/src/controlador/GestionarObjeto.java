/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;

/**
 *
 * @author guill
 */
public interface GestionarObjeto {
    
    public void registrar(Object objeto);
    public void modificar(Object objeto);
    public void eliminar(Object objeto);
    public ArrayList<Object> buscar(Object objeto);
    public ArrayList<Object> listar();
    
}
