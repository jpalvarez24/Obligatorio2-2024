/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.Sistema;

public class RegistroObra extends javax.swing.JFrame {

    private Sistema sis;

    public RegistroObra(Sistema unSistema) {
        sis = unSistema;
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPresupuesto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Propietarios:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 120, 20);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 180, 146);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(220, 60, 180, 146);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Capataces:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 40, 70, 14);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Permiso Nro:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 30, 70, 14);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(440, 60, 63, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Direccion");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 100, 70, 14);

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(440, 130, 210, 22);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(440, 200, 70, 22);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(520, 200, 60, 22);

        jLabel5.setText("Comienzo Mes/Año");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 180, 110, 16);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Total Presupuesto:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 250, 110, 14);

        lblPresupuesto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        getContentPane().add(lblPresupuesto);
        lblPresupuesto.setBounds(560, 240, 80, 40);

        jLabel7.setText("Aca arriba hay una label");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(540, 290, 130, 16);

        setBounds(0, 0, 698, 515);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblPresupuesto;
    // End of variables declaration//GEN-END:variables
}
