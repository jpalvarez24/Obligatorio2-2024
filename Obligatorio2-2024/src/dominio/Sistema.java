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
public class Sistema extends Observable implements Serializable{
    
    
    private ArrayList<Rubro> listaRubros = new ArrayList();
    private ArrayList<Propietario> listaPropietarios = new ArrayList();
    private ArrayList<Capataz> listaCapataces = new ArrayList();
    private ArrayList<Obra> listaObras = new ArrayList();
    
    public void addRubro(Rubro unRubro){
        listaRubros.add(unRubro);
        setChanged();
        notifyObservers();
    }
    
    public void addPropietario(Propietario unPropietario){
        listaPropietarios.add(unPropietario);
        setChanged();
        notifyObservers();
    }
    
    public void addCapataz(Capataz unCapataz){
        listaCapataces.add(unCapataz);
        setChanged();
        notifyObservers();
    }
    
    public void addObra(Obra unaObra){
        listaObras.add(unaObra);
        setChanged();
        notifyObservers();
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
    
    //metodos para verificaciones
    
    public boolean existeCedulaCapataz(String cedula){
        boolean ans = false;
        for(Capataz c : listaCapataces){
            if(c.getCedula().equals(cedula)){
                ans = true;
            }
        }
        return ans;
    }
    
    public boolean existeCedulaPropietario(String cedula){
        boolean ans = false;
        for(Propietario prop : listaPropietarios){
            if(prop.getCedula().equals(cedula)){
                ans = true;
            }
        }
        return ans;
    }
    
    public boolean existeNumeroObra(int numRecibido){
        boolean ans = false;
        for(Obra obra : listaObras){
            if(obra.getNumPermisoObra()==(numRecibido)){
                ans = true;
            }
        }
        return ans;
                
    }
    
    public boolean existeRubro(String nombre){
        boolean ans = false;
        for(Rubro rub : listaRubros){
            if(rub.getNombreRubro().toLowerCase().equals(nombre.toLowerCase())){
                ans = true;
            }
        }
        return ans;
    }
    
    
    
}
