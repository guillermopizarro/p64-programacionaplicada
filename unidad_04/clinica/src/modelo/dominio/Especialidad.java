/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dominio;

import java.util.Vector;
import javax.swing.JButton;

/**
 *
 * @author guill
 */
public class Especialidad {
    private Integer especialidad_id;
    private String nombre;
    
    public Especialidad() {
        
    }

    public Integer getEspecialidad_id() {
        return especialidad_id;
    }

    public void setEspecialidad_id(Integer especialidad_id) {
        this.especialidad_id = especialidad_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object[] getDatos() {
        JButton modificarBtn = new JButton("Modificar");
        modificarBtn.setName("M");
        JButton eliminarBtn = new JButton("Eliminar");
        eliminarBtn.setName("E");
        
        Object[] valores = { this.especialidad_id, this.nombre, modificarBtn, eliminarBtn };
        return valores;
    }
    
    
}
