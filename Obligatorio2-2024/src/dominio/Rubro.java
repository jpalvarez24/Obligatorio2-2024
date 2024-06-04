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
public class Rubro implements Serializable{
    private String nombreRubro;
    private String descripcion;

    public Rubro(String nombreRubro, String descripcion) {
        this.nombreRubro = nombreRubro;
        this.descripcion = descripcion;
    }

    
    public String getNombreRubro() {
        return nombreRubro;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombreRubro;
    }
    
    
}
