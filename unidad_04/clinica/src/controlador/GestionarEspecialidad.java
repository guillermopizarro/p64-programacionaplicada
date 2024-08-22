/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.bd.EspecialidadBD;

/**
 *
 * @author guill
 */
public class GestionarEspecialidad implements GestionarObjeto {

    private EspecialidadBD especialidad;
    
    public GestionarEspecialidad() {
        this.especialidad = new EspecialidadBD();
    }
    
    @Override
    public void registrar(Object objeto) {
        this.especialidad.registrar(objeto);
    }

    @Override
    public void modificar(Object objeto) {
        this.especialidad.modificar(objeto);
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
        return this.especialidad.listar();
    }
}
