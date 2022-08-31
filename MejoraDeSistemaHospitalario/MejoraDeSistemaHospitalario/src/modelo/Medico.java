/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



/**
 *
 * @author Jair Javier Fernandez Almeida 
 *         Yeffrey Jair Carbajal Barcia 
 */
public class Medico extends Persona{
    protected int licencia;
    protected Especialidad especialidad;
    protected int año;
    protected int meses;
    protected int horaInicio;
    protected int horaFin;

    public Medico() {
    }

    public Medico(int licencia, Especialidad especialidad, int año, int meses, int horaInicio, int horaFin) {
        this.licencia = licencia;
        this.especialidad = especialidad;
        this.año = año;
        this.meses = meses;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public int getLicencia() {
        return licencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public int getAño() {
        return año;
    }

    public int getMeses() {
        return meses;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
