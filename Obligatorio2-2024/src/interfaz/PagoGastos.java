/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.Sistema;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Juan Pedro Alvarez-281369
 */
public class PagoGastos extends javax.swing.JFrame implements Observer {

    private Sistema sis;

    public PagoGastos(Sistema unSistema) {
        sis = unSistema;
        initComponents();
        this.sis.addObserver(this);
    }

    @Override
    public void update(Observable o, Object ob) {
        modeloAPantalla();
    }

    public void modeloAPantalla() {

        jListaObras.setListData(sis.getListaObras().toArray());
        jListaGastos.setListData(sis.getListaObras().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListaObras = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListaGastos = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(jListaObras);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 30, 160, 160);

        jScrollPane2.setViewportView(jListaGastos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(310, 30, 170, 160);

        setBounds(0, 0, 653, 531);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jListaGastos;
    private javax.swing.JList jListaObras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
