/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dominio;

import java.util.Date;

/**
 *
 * @author guill
 */
public class Consulta {
    private Integer consulta_id;
    private Date fecha;
    private Float valor;
    
    public Paciente refPaciente;
    public Doctor refDoctor;
    public Usuario refUsuario;
    
    public Consulta() {
        
    }

    public Integer getConsulta_id() {
        return consulta_id;
    }

    public void setConsulta_id(Integer consulta_id) {
        this.consulta_id = consulta_id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Paciente getRefPaciente() {
        return refPaciente;
    }

    public void setRefPaciente(Paciente refPaciente) {
        this.refPaciente = refPaciente;
    }

    public Doctor getRefDoctor() {
        return refDoctor;
    }

    public void setRefDoctor(Doctor refDoctor) {
        this.refDoctor = refDoctor;
    }

    public Usuario getRefUsuario() {
        return refUsuario;
    }

    public void setRefUsuario(Usuario refUsuario) {
        this.refUsuario = refUsuario;
    }
    
    
}
