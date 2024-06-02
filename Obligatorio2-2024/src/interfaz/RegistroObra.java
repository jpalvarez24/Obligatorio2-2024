package interfaz;

import dominio.*;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegistroObra extends javax.swing.JFrame implements Observer {

    private Sistema sis;
    int presupuesto;
    private class RubroListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
// este código se ejecutará al presionar el botón, obtengo cuál botón
            JButton cual = ((JButton) e.getSource());
            cual.setBackground(Color.BLUE);
            JDialog ventanaMonto = new JDialog();
            ventanaMonto.setTitle("Ingrese el presupuesto estimado");
            ventanaMonto.setSize(300,150);
            ventanaMonto.setLayout(null);
            
            JLabel label = new JLabel("Ingrese el monto del presupuesto:");
            JTextField textFieldMonto = new JTextField();
            JButton btnAceptar = new JButton("Aceptar");
ventanaMonto.add(label);
            ventanaMonto.add(textFieldMonto);
            ventanaMonto.add(btnAceptar);
            ventanaMonto.setVisible(true);
            btnAceptar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        presupuesto = Integer.parseInt(textFieldMonto.getText());
                        if (presupuesto == 0) {
                            cual.setBackground(Color.BLACK);
                        }
                        ventanaMonto.dispose();
                    } catch (NumberFormatException ex) {
                        textFieldMonto.setText("Ingrese un número válido");
                    }
                }
            });

        }
    }

    public RegistroObra(Sistema unSistema) {
        sis = unSistema;
        initComponents();
        this.sis.addObserver(this);
        for (int i = 0; i < sis.getListaRubros().size(); i++) {
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

    public void modeloAPantalla() {
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
        btnRegistrarObra = new javax.swing.JButton();
        panelGrid = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(jListProp);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 200, 180);

        jScrollPane2.setViewportView(jListCap);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(220, 80, 200, 180);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel1.setText("Permiso Nro:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 80, 120, 20);

        txtFldNroPerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldNroPermActionPerformed(evt);
            }
        });
        getContentPane().add(txtFldNroPerm);
        txtFldNroPerm.setBounds(460, 110, 60, 19);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel2.setText("Dirección");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 150, 90, 13);

        txtFldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtFldDireccion);
        txtFldDireccion.setBounds(460, 170, 180, 19);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel3.setText("Comienzo Mes / Año");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 210, 130, 13);

        spinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(spinnerMes);
        spinnerMes.setBounds(460, 230, 50, 20);
        getContentPane().add(spinnerAno);
        spinnerAno.setBounds(520, 230, 50, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel4.setText("Total Presupuesto:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 300, 110, 13);

        jLabel5.setText("0");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(590, 300, 31, 13);

        btnRegistrarObra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistrarObra.setText("Registrar");
        btnRegistrarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarObraActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarObra);
        btnRegistrarObra.setBounds(590, 430, 90, 23);

        panelGrid.setLayout(new java.awt.GridLayout(2, 2));
        getContentPane().add(panelGrid);
        panelGrid.setBounds(10, 280, 420, 170);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Registrar obra");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 20, 186, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Propietarios:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 60, 80, 14);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Capataces:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 60, 70, 14);

        setBounds(0, 0, 708, 503);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarObraActionPerformed
        Propietario prop = (Propietario) jListProp.getSelectedValue();
        Capataz cap = (Capataz) jListCap.getSelectedValue();
        int numPerm = Integer.valueOf(txtFldNroPerm.getText());
        String dir = txtFldDireccion.getText();
        int mes = (int) spinnerMes.getValue();
        int ano = (int) spinnerAno.getValue();
        Rubro unRubro = null;
        for (java.awt.Component comp : panelGrid.getComponents()) {
            if (comp instanceof JButton) {
                JButton boton = (JButton) comp;
                if (boton.getBackground() == Color.BLUE) { // Verificar si el botón está seleccionado
                    unRubro = (Rubro) boton.getClientProperty("rubro");
                    break;
                }
            }
        }
        int presupuesto = 1;
        Obra obraNueva = new Obra(prop,unRubro, cap, numPerm, dir, mes, ano, presupuesto);
        sis.addObra(obraNueva);
        txtFldDireccion.setText("");
        txtFldNroPerm.setText("");
        spinnerAno.setValue(2020);
        spinnerMes.setValue(1);
    }//GEN-LAST:event_btnRegistrarObraActionPerformed

    private void txtFldNroPermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldNroPermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldNroPermActionPerformed

    private void txtFldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldDireccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarObra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
