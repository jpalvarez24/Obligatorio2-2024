/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.Sistema;
import dominio.Obra;
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
        modeloAPantalla();
    }

    @Override
    public void update(Observable o, Object ob) {
        modeloAPantalla();
    }

    public void modeloAPantalla() {
        jListaObras.setListData(sis.getListaObras().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListaObras = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListaGastos = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jListaObras.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListaObrasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListaObras);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 80, 160, 160);

        jScrollPane2.setViewportView(jListaGastos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(260, 80, 170, 160);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Pago de gastos");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 20, 186, 17);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Obras:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 60, 38, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Gastos Impagos:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 60, 94, 20);

        jButton1.setText("Button");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 460, 61, 21);

        setBounds(0, 0, 653, 531);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jListaObrasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListaObrasValueChanged
        Obra obraSeleccionada = (Obra) jListaObras.getSelectedValue();
        jListaGastos.setListData(obraSeleccionada.getListaGastos().toArray());
    }//GEN-LAST:event_jListaObrasValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jListaGastos;
    private javax.swing.JList jListaObras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
