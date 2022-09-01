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
public class Paciente extends Persona{
    protected boolean esAlergico;
    protected int totalVacunasCovid;

    public Paciente() {
    }

    public Paciente(boolean esAlergico, int totalVacunasCovid) {
        this.esAlergico = esAlergico;
        this.totalVacunasCovid = totalVacunasCovid;
    }
    
    public boolean esEsAlergico() {
        return esAlergico;
    }

    public int getTotalVacunasCovid() {
        return totalVacunasCovid;
    }

    public void setEsAlergico(boolean esAlergico) {
        this.esAlergico = esAlergico;
    }

    public void setTotalVacunasCovid(int totalVacunasCovid) {
        this.totalVacunasCovid = totalVacunasCovid;
    }
    
    
    
    
    
    
    
    
    
}
