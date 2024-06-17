

// Juan Pedro Alvarez y Francisco Latorre


package dominio;

import java.io.Serializable;



public class Propietario implements Serializable{
    private String nombre;
    private String cedula;
    private String direccion;
    private int numContacto;

    public Propietario(String nombre, String cedula, String direccion, int numContacto) {
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
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
    
    
    public String toString2(){
        return nombre + cedula + direccion + numContacto;
    }
    
    
}
