/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Juan Pedro Alvarez-281369
 */
public class Obra {
    private Propietario propietario;
    private Capataz capataz;
    private int numPermisoObra;
    private String direccion;
    private int mesComienzo;
    private int anoComienzo;
    private int presupuesto;

    public Obra(Propietario propietario, Capataz capataz, int numPermisoObra, String direccion, int mesComienzo, int anoComienzo, int presupuesto) {
        this.propietario = propietario;
        this.capataz = capataz;
        this.numPermisoObra = numPermisoObra;
        this.direccion = direccion;
        this.mesComienzo = mesComienzo;
        this.anoComienzo = anoComienzo;
        this.presupuesto = presupuesto;
    }
    
    

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Capataz getCapataz() {
        return capataz;
    }

    public void setCapataz(Capataz capataz) {
        this.capataz = capataz;
    }

    public int getNumPermisoObra() {
        return numPermisoObra;
    }

    public void setNumPermisoObra(int numPermisoObra) {
        this.numPermisoObra = numPermisoObra;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMesComienzo() {
        return mesComienzo;
    }

    public void setMesComienzo(int mesComienzo) {
        this.mesComienzo = mesComienzo;
    }

    public int getAnoComienzo() {
        return anoComienzo;
    }

    public void setAnoComienzo(int anoComienzo) {
        this.anoComienzo = anoComienzo;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    
}
