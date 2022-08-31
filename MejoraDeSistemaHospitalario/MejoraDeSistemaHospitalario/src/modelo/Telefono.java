/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author windos
 */
public class Telefono {
    private String numero;
    private String descripcion;
    
    public Telefono(){
        
    }

    public Telefono(String numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public String getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
