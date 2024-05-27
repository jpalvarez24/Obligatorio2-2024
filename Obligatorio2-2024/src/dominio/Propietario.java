/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author Juan Pedro Alvarez-281369
 */
public class Propietario implements Serializable{
    private String nombre;
    private int cedula;
    private String direccion;
    private int numContacto;

    public Propietario(String nombre, int cedula, String direccion, int numContacto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.numContacto = numContacto;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(int numContacto) {
        this.numContacto = numContacto;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
