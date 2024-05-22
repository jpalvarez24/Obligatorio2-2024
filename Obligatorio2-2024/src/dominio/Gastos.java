/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Juan Pedro Alvarez-281369
 */
public class Gastos {
    private Obra obra;
    private Rubro rubro;
    private int monto;
    private int mes;
    private int ano;
    private String descripcion;
    private int numeroGasto;
    
    
    public Gastos(Obra obra, Rubro rubro, int monto, int mes, int ano, String descripcion){
        this.obra = obra;
        this.rubro = rubro;
        this.monto = monto;
        this.mes = mes;
        this.ano = ano;
        this.descripcion = descripcion;
        this.numeroGasto = 1;
    }
    
    
}
