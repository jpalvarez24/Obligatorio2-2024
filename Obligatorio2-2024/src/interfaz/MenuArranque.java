/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.Rubro;
import dominio.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Juan Pedro Alvarez-281369
 */
public class MenuArranque extends javax.swing.JFrame {

    private Sistema sis;

    public MenuArranque(Sistema unSistema) {
        sis = unSistema;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSisVacio = new javax.swing.JButton();
        btnSisAnterior = new javax.swing.JButton();
        btnSoloRubros = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnSisVacio.setText("Sistema Vacio");
        btnSisVacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSisVacioActionPerformed(evt);
            }
        });

        btnSisAnterior.setText("Sistema anterior");
        btnSisAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSisAnteriorActionPerformed(evt);
            }
        });

        btnSoloRubros.setText("Solo rubros");
        btnSoloRubros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoloRubrosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Seleccione una opcion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSisVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSisAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 21, Short.MAX_VALUE)
                        .addComponent(btnSoloRubros, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(87, 87, 87)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSoloRubros)
                    .addComponent(btnSisAnterior)
                    .addComponent(btnSisVacio))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 140);

        setBounds(0, 0, 419, 158);
    }// </editor-fold>//GEN-END:initComponents

    //Sistema anterior (Deserializacion)

    private void btnSisAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSisAnteriorActionPerformed
        String mipath = "archivo.ser";
        Sistema sisAnt = null;
        try {
            FileInputStream ff = new FileInputStream(mipath);
            BufferedInputStream bb = new BufferedInputStream(ff);
            ObjectInputStream ss = new ObjectInputStream(bb);
            sisAnt = (Sistema) ss.readObject();
            ss.close();
        } catch (IOException | ClassNotFoundException e) {
            // Muestra mensaje al usuario y registra el error
            JOptionPane.showMessageDialog(this, "Archivo no encontrado: archivo.ser", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (sisAnt != null) {
            new MenuPrincipal(sisAnt).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Deserialización fallida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSisAnteriorActionPerformed

    //Sistema vacio

    private void btnSisVacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSisVacioActionPerformed
        new MenuPrincipal(sis).setVisible(true);
    }//GEN-LAST:event_btnSisVacioActionPerformed

    //Sistema con solo rubros

    private void btnSoloRubrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoloRubrosActionPerformed

        Rubro r1 = new Rubro("Pintura", "Renovación de Pintura");
        Rubro r2 = new Rubro("Sanitaria", "Reparación de Sanitaria");
        Rubro r3 = new Rubro("Eléctrica", "Instalación Eléctrica");
        Rubro r4 = new Rubro("Carpintería", "Trabajo en Madera");
        Rubro r5 = new Rubro("Albañilería", "Reparación de Paredes");
        Rubro r6 = new Rubro("Pisos", "Instalación de pisos");
        Rubro r7 = new Rubro("Cambio de Ventanas", "Reemplazo de Ventanas");
        Rubro r8 = new Rubro("Baño", "Remodelación de baño");
        Rubro r9 = new Rubro("Cocina", "Renovación de Cocina");
        Rubro r10 = new Rubro("Aislamiento térmico", "Mejora Térmica");
        sis.addRubro(r1);
        sis.addRubro(r2);
        sis.addRubro(r3);
        sis.addRubro(r4);
        sis.addRubro(r5);
        sis.addRubro(r6);
        sis.addRubro(r7);
        sis.addRubro(r8);
        sis.addRubro(r9);
        sis.addRubro(r10);

        new MenuPrincipal(sis).setVisible(true);

    }//GEN-LAST:event_btnSoloRubrosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSisAnterior;
    private javax.swing.JButton btnSisVacio;
    private javax.swing.JButton btnSoloRubros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
