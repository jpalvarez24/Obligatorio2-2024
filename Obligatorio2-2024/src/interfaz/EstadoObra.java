/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.Sistema;
/**
 *
 * @author Juan Pedro Alvarez-281369
 */
public class EstadoObra extends javax.swing.JFrame {

    private Sistema sis;
    
    public EstadoObra(Sistema unSistema) {
        sis = unSistema;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 150, 60);

        jLabel1.setText("Propietario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 20, 60, 13);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 20, 33, 13);

        jLabel3.setText("Capataz: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(530, 20, 50, 13);

        jLabel4.setText("Total presupuestado:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 60, 100, 13);

        jLabel5.setText("Total Gastado");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 60, 70, 13);

        jLabel6.setText("Total Gastado Ya Integrado:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 90, 130, 13);

        jLabel7.setText("Total gastado no integrado:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(430, 90, 130, 13);

        jLabel8.setText("Saldo:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(590, 90, 30, 13);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 150, 160, 140);

        jLabel9.setText("Presupuesto (Rubros y montos):");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 130, 150, 13);

        jLabel10.setText("Lista obras");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 10, 50, 13);

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(590, 20, 38, 13);

        jLabel12.setText("Comienzo obra:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(220, 40, 80, 13);

        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(320, 40, 38, 13);

        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(350, 60, 38, 13);

        jLabel15.setText("label");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(350, 90, 22, 13);

        jLabel16.setText("lbl");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(560, 90, 10, 13);

        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(630, 90, 38, 13);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(210, 150, 150, 140);

        jLabel18.setText("Rubros con gastos en la obra:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(210, 130, 140, 13);

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(390, 150, 260, 140);

        jLabel19.setText("Gastos del rubro seleccionado:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(390, 120, 270, 30);

        jLabel20.setText("Codigo de colores:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(140, 310, 90, 13);

        jLabel21.setText("Presupuesto y Reintegrado");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(250, 310, 122, 13);

        jLabel22.setText("Presupuestado y no Reintegrado");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(250, 330, 150, 13);

        jLabel23.setText("No Presupuestado y Reintegrado");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(430, 310, 150, 13);

        jLabel24.setText("No Presupuestado y No Reintegrado");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(430, 330, 170, 13);

        setBounds(0, 0, 713, 412);
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
