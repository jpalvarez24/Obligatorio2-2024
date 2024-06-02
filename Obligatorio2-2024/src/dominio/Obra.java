/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author Juan Pedro Alvarez-281369
 */
public class Obra extends Observable implements Serializable{
    private Propietario propietario;
    private Capataz capataz;
    private Rubro rubro;
    private int numPermisoObra;
    private String direccion;
    private int mesComienzo;
    private int anoComienzo;
    private int presupuesto;
    private int gastosPend;
    private ArrayList<Gasto> listaGastos;

    public Obra(Propietario propietario,Rubro rubro, Capataz capataz, int numPermisoObra, String direccion, int mesComienzo, int anoComienzo, int presupuesto) {
        this.propietario = propietario;
        this.rubro = rubro;
        this.capataz = capataz;
        this.numPermisoObra = numPermisoObra;
        this.direccion = direccion;
        this.mesComienzo = mesComienzo;
        this.anoComienzo = anoComienzo;
        this.presupuesto = presupuesto;
        this.gastosPend = 0;
        this.listaGastos = new ArrayList<>();
    }
    
    public Rubro getRubro(){
        return rubro;
    }
    
    
    public Propietario getPropietario() {
        return propietario;
    }

    

    public Capataz getCapataz() {
        return capataz;
    }

    

    public int getNumPermisoObra() {
        return numPermisoObra;
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
    
    public ArrayList<Gasto> getListaGastos(){
        return this.listaGastos;
    }
    
    public void addGasto(Gasto unGasto){
        listaGastos.add(unGasto);
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Obra de: "+ propietario;
    }
    
}
