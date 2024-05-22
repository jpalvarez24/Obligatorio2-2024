/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author Juan Pedro Alvarez-281369
 */
public class Sistema extends Observable{
    
    
    private ArrayList listaRubros = new ArrayList();
    private ArrayList listaPropietarios = new ArrayList();
    private ArrayList listaCapataces = new ArrayList();
    private ArrayList listaObras = new ArrayList();

    public void addRubro(Rubro unRubro){
        listaRubros.add(unRubro);
        setChanged();
        notifyObservers();
    }
    
    public void addPropietario(Propietario unPropietario){
        listaPropietarios.add(unPropietario);
    }
    
    public void addCapataz(Capataz unCapataz){
        listaCapataces.add(unCapataz);
    }
    
    public void addObra(Obra unaObra){
        listaObras.add(unaObra);
    }
    
    public ArrayList<Rubro> getListaRubros(){
        return this.listaRubros;
    }
    
    public ArrayList<Propietario> getListaPropietarios(){
        return this.listaPropietarios;
    }
    
    public ArrayList<Capataz> getListaCapataces() {
        return this.listaCapataces;
    }
    
    public ArrayList<Obra> getListaObras() {
        return this.listaObras;
    }
    
    
}
