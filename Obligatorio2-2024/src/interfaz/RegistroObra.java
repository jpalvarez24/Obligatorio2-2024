/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.*;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.JButton;

public class RegistroObra extends javax.swing.JFrame {

    private Sistema sis;

    public RegistroObra(Sistema unSistema) {
        sis = unSistema;
        initComponents();
        for (int i = 1; i <= 4; i++) {
            JButton nuevo = new JButton();
            nuevo.setMargin(new Insets(-5, -5, -5, -5));
            nuevo.setBackground(Color.BLACK);
            nuevo.setForeground(Color.WHITE);
            nuevo.setText("texto"); // texto ejemplo, a completar
            nuevo.addActionListener(new RubroListener());
            panelGrid.add(nuevo);
        }
        cargarListaPropietarios();
        cargarListaCapataces();
    }

    public void cargarListaPropietarios() {
        String[] listaProp = new String[sis.getListaPropietarios().size()];
        for (int i = 0; i < sis.getListaPropietarios().size(); i++) {
            listaProp[i] = sis.getListaPropietarios().get(i).toString();
        }
        jListProp.setListData(listaProp);

    }

    public void cargarListaCapataces() {
        String[] listaCap = new String[sis.getListaCapataces().size()];
        for (int i = 0; i < sis.getListaCapataces().size(); i++) {
            listaCap[i] = sis.getListaCapataces().get(i).toString();
        }
        jListCap.setListData(listaCap);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListProp = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCap = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelGrid = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(jListProp);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 150, 130);

        jScrollPane2.setViewportView(jListCap);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(200, 40, 150, 130);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 20, 33, 13);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(380, 40, 57, 19);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 80, 33, 13);

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(380, 100, 57, 19);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 140, 33, 13);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(380, 170, 50, 20);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(440, 170, 50, 20);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 220, 33, 13);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 220, 33, 13);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(480, 380, 71, 21);

        panelGrid.setLayout(new java.awt.GridLayout(0, 2));
        getContentPane().add(panelGrid);
        panelGrid.setBounds(20, 190, 330, 200);

        setBounds(0, 0, 591, 457);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListCap;
    private javax.swing.JList<String> jListProp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panelGrid;
    // End of variables declaration//GEN-END:variables
}
