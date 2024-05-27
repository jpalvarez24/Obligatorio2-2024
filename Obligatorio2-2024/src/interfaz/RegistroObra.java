
package interfaz;

import dominio.*;
import java.awt.Color;
import java.awt.Insets;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;

public class RegistroObra extends javax.swing.JFrame implements Observer {

    private Sistema sis;

    public RegistroObra(Sistema unSistema) {
        sis = unSistema;
        initComponents();
        this.sis.addObserver(this);
        for (int i = 0; i <= 3; i++) {
            JButton nuevo = new JButton();
            nuevo.setMargin(new Insets(-5, -5, -5, -5));
            nuevo.setBackground(Color.BLACK);
            nuevo.setForeground(Color.WHITE);
            nuevo.setText(sis.getListaRubros().get(i).toString()); // texto ejemplo, a completar
            nuevo.addActionListener(new RubroListener());
            panelGrid.add(nuevo);
        }
        modeloAPantalla();
    }
    // es el que esta abajo en la 
    
    
    @Override
    public void update(Observable o, Object ob) {
        modeloAPantalla();
    }
    public void modeloAPantalla(){
        jListProp.setListData(sis.getListaPropietarios().toArray());
        jListCap.setListData(sis.getListaCapataces().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListProp = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCap = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        txtFldNroPerm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFldDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spinnerMes = new javax.swing.JSpinner();
        spinnerAno = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelGrid = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(jListProp);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 20, 200, 180);

        jScrollPane2.setViewportView(jListCap);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 20, 200, 180);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel1.setText("Permiso Nro:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 10, 120, 20);

        txtFldNroPerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldNroPermActionPerformed(evt);
            }
        });
        getContentPane().add(txtFldNroPerm);
        txtFldNroPerm.setBounds(450, 40, 60, 19);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel2.setText("Dirección");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 80, 90, 13);

        txtFldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtFldDireccion);
        txtFldDireccion.setBounds(450, 100, 180, 19);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel3.setText("Comienzo Mes / Año");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 140, 130, 13);

        spinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(spinnerMes);
        spinnerMes.setBounds(450, 160, 50, 20);
        getContentPane().add(spinnerAno);
        spinnerAno.setBounds(510, 160, 50, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel4.setText("Total Presupuesto:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 230, 110, 13);

        jLabel5.setText("0");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(580, 230, 31, 13);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(440, 370, 160, 23);

        panelGrid.setLayout(new java.awt.GridLayout(0, 2));
        getContentPane().add(panelGrid);
        panelGrid.setBounds(20, 210, 330, 200);

        setBounds(0, 0, 669, 457);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFldNroPermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldNroPermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldNroPermActionPerformed

    private void txtFldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldDireccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jListCap;
    private javax.swing.JList jListProp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelGrid;
    private javax.swing.JSpinner spinnerAno;
    private javax.swing.JSpinner spinnerMes;
    private javax.swing.JTextField txtFldDireccion;
    private javax.swing.JTextField txtFldNroPerm;
    // End of variables declaration//GEN-END:variables
}
