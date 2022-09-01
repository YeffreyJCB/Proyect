/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 * 
 * @author Jair Javier Fernandez Almeida 
 *         Yeffrey Jair Carbajal Barcia 
 */
public abstract class Persona  {
    
    protected String nombre;  
    protected String apellidos;
    protected int telefono;
    protected int cedula;
    protected int carnet;
    protected Direccion direccion;
    protected ArrayList <Telefono> listTelefono;
    

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int telefono, int cedula, int carnet, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.cedula = cedula;
        this.carnet = carnet;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Telefono> getListTelefono() {
        return listTelefono;
    }

    public void setListTelefono(ArrayList<Telefono> listTelefono) {
        this.listTelefono = listTelefono;
    }
    
    public void addTelefono(Telefono telefono) {
        listTelefono.add(telefono);
    } 
    
}
