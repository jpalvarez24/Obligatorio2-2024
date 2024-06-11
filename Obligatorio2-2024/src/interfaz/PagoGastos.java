/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.Gasto;
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
        btnReintegrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListaGastosReintegrados = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();

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
        jLabel4.setBounds(180, 30, 130, 17);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Obras:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 60, 38, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Gastos pagos:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 250, 81, 20);

        btnReintegrar.setText("Reintegrar");
        btnReintegrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReintegrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReintegrar);
        btnReintegrar.setBounds(380, 420, 100, 25);

        jScrollPane3.setViewportView(jListaGastosReintegrados);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(150, 270, 170, 150);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Gastos Impagos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 60, 95, 20);

        setBounds(0, 0, 510, 497);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReintegrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReintegrarActionPerformed
        Obra o1 = (Obra) jListaObras.getSelectedValue();
        Gasto g1 = (Gasto)jListaGastos.getSelectedValue();
        o1.reintegraGasto(g1);
        jListaGastosReintegrados.setListData(o1.getListaGastosReintegrados().toArray());
        jListaGastos.setListData(o1.getListaGastosNoIntegrados().toArray());
    }//GEN-LAST:event_btnReintegrarActionPerformed

    private void jListaObrasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListaObrasValueChanged
        Obra o1 = (Obra) jListaObras.getSelectedValue();
        jListaGastosReintegrados.setListData(o1.getListaGastosReintegrados().toArray());
        jListaGastos.setListData(o1.getListaGastosNoIntegrados().toArray());
    }//GEN-LAST:event_jListaObrasValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReintegrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jListaGastos;
    private javax.swing.JList jListaGastosReintegrados;
    private javax.swing.JList jListaObras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
