/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.especialidad;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vista.Render;

/**
 *
 * @author guill
 */
public class EspecialidadTbl {
    
    public EspecialidadTbl() {
        
    }
    
    public void verTabla(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new Render());
        
        DefaultTableModel modelo = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"ID", "Especialidad", "Modificar", "Eliminar"}
        );
        
        tabla.setModel(modelo);
        tabla.setRowHeight(30);
    }
}
