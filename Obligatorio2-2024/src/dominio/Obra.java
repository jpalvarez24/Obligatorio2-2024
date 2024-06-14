

// Juan Pedro Alvarez y Francisco Latorre


package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;


public class Obra extends Observable implements Serializable{
    private Propietario propietario;
    private Capataz capataz;
    private int numPermisoObra;
    private String direccion;
    private int mesComienzo;
    private int anoComienzo;
    private int presupuesto;
    private int gastosPend;
    private int totalGastado;
    private int totalGastadoNoReintegrado;
    private int totalGastadoReintegrado;
    private ArrayList<Gasto> listaGastosSinReintegrar;
    private ArrayList<Gasto> listaGastosReintegrados;
    private ArrayList<CostoRubro> listaRubros;

    public Obra(Propietario propietario, Capataz capataz, int numPermisoObra, String direccion, int mesComienzo, int anoComienzo, int presupuesto) {
        this.propietario = propietario;
        this.capataz = capataz;
        this.numPermisoObra = numPermisoObra;
        this.direccion = direccion;
        this.mesComienzo = mesComienzo;
        this.anoComienzo = anoComienzo;
        this.presupuesto = presupuesto;
        this.gastosPend = 0;
        this.totalGastado = 0;
        this.totalGastadoReintegrado = 0;
        this.totalGastadoNoReintegrado = 0;
        this.listaGastosSinReintegrar = new ArrayList<>();
        this.listaGastosReintegrados = new ArrayList<>();
        this.listaRubros = new ArrayList<>();
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

    public int getMesComienzo() {
        return mesComienzo;
    }

    public int getAnoComienzo() {
        return anoComienzo;
    }

    public int getPresupuesto() {
        return presupuesto;
    }
    //Arraylist CostoRubro
    public ArrayList<CostoRubro> getListaRubrosObra(){
        return this.listaRubros;
    }
    
    public void addRubroAObra(CostoRubro costoRubro){
        listaRubros.add(costoRubro);
        setChanged();
        notifyObservers();
    }

    //ArrayLists gastos
    public ArrayList<Gasto> getListaGastosReintegrados(){
        return this.listaGastosReintegrados;
    }
    
    public ArrayList<Gasto> getListaGastosNoIntegrados(){
        return this.listaGastosSinReintegrar;
    }
    
    
    public void addGasto(Gasto unGasto){
        listaGastosSinReintegrar.add(unGasto);
        this.totalGastado += unGasto.getMontoGasto();
        this.totalGastadoNoReintegrado += unGasto.getMontoGasto();
        setChanged();
        notifyObservers();
        gastosPend++;
    }
    
    public void reintegraGasto(Gasto unGasto){
        this.listaGastosReintegrados.add(unGasto);
        this.listaGastosSinReintegrar.remove(unGasto);
        this.totalGastadoNoReintegrado = this.totalGastadoNoReintegrado - unGasto.getMontoGasto();
        this.totalGastadoReintegrado += unGasto.getMontoGasto();
        setChanged();
        notifyObservers();
        gastosPend--;
        
    }
    
    public int getTotalGastado(){
        return this.totalGastado;
    }
    
    public int getTotalGastadoNoReintegrado(){
        return this.totalGastadoNoReintegrado;
    }
    
    public int getTotalGastadoReintegrado(){
        return this.totalGastadoReintegrado;
    }
    
    public int informarNumeroGasto(){
        return this.gastosPend;
    }

    @Override
    public String toString() {
        return "Obra de: "+ propietario;
    }
    
}
