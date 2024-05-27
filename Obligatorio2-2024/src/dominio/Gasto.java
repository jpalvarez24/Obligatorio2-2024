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
public class Gasto implements Serializable{
    private Rubro rubro;
    private int monto;
    private int mes;
    private int ano;
    private String descripcion;
        
    
    public Gasto(Rubro rubro, int monto, int mes, int ano, String descripcion){
        this.rubro = rubro;
        this.monto = monto;
        this.mes = mes;
        this.ano = ano;
        this.descripcion = descripcion;
    }
    
    //public void setMonto
    
}
