

// Juan Pedro Alvarez y Francisco Latorre


package interfaz;

import dominio.*;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RegistroObra extends javax.swing.JFrame implements Observer {

    private Sistema sis;
    private int presupuestoTotal = 0;
    private HashMap<Rubro, Integer> rubrosSeleccionados = new HashMap<>();

    private class RubroListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JButton cual = ((JButton) e.getSource());

            try {
                int presupuesto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto:"));
                Rubro rubro = sis.getListaRubros().get(panelGrid.getComponentZOrder(cual));
                if (presupuesto <= 0) {
                    // Deseleccionar rubro
                    cual.setBackground(Color.BLACK);
                    cual.setText("<html>" + rubro.getNombreRubro() + "<br/></html>");
                    if (rubrosSeleccionados.containsKey(rubro)) {
                        presupuestoTotal -= rubrosSeleccionados.get(rubro);
                        rubrosSeleccionados.remove(rubro);
                        actualizarPresupuestoTotal();
                    }
                } else {
                    // Seleccionar rubro
                    if (rubrosSeleccionados.containsKey(rubro)) {
                        presupuestoTotal -= rubrosSeleccionados.get(rubro);
                    }
                    rubrosSeleccionados.put(rubro, presupuesto);
                    presupuestoTotal += presupuesto;
                    cual.setBackground(Color.BLUE);
                    cual.setText("<html>" + rubro.getNombreRubro() + "<br/>" + presupuesto + "</html>");
                    actualizarPresupuestoTotal();
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese un monto válido");
            }

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

    private void actualizarPresupuestoTotal() {
        jLabel5.setText(String.valueOf(presupuestoTotal));
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Permiso Nro:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 80, 120, 20);

        txtFldNroPerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldNroPermActionPerformed(evt);
            }
        });
        getContentPane().add(txtFldNroPerm);
        txtFldNroPerm.setBounds(460, 110, 60, 22);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Dirección:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 150, 90, 14);

        txtFldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtFldDireccion);
        txtFldDireccion.setBounds(460, 170, 180, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Comienzo Mes / Año");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 210, 130, 14);

        spinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(spinnerMes);
        spinnerMes.setBounds(460, 230, 50, 22);
        getContentPane().add(spinnerAno);
        spinnerAno.setBounds(520, 230, 50, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Total Presupuesto:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 300, 110, 14);

        jLabel5.setText("0");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(590, 300, 31, 16);

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
        String numPermStr = txtFldNroPerm.getText();
        String dir = txtFldDireccion.getText();
        int mes = (int) spinnerMes.getValue();
        int ano = (int) spinnerAno.getValue();

        if (prop == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un propietario de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
            return;

        }

        if (cap == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un capataz de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
            return;

        }

        if (numPermStr == null || !numPermStr.matches("\\d+") || numPermStr.trim().isEmpty() || sis.existeNumeroObra(Integer.valueOf(numPermStr))) {
            JOptionPane.showMessageDialog(this, "El número de permiso debe ser único, no vacío y solo contener números.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (dir == null || dir.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "La dirección de la obra debe ser un string no vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (mes < 1 || mes > 12) {
            JOptionPane.showMessageDialog(this, "El mes de comienzo debe ser un número válido entre 1 y 12.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (ano < 1000 || ano > 9999) {
            JOptionPane.showMessageDialog(this, "El año de comienzo debe ser un número válido de 4 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int numPerm = Integer.valueOf(numPermStr);
        Obra obraNueva = new Obra(prop, cap, numPerm, dir, mes, ano, presupuestoTotal);

        for (Rubro rubro : rubrosSeleccionados.keySet()) {
            int presupuesto = rubrosSeleccionados.get(rubro);
            obraNueva.addRubroAObra(new CostoRubro(rubro, presupuesto));
        }

        sis.addObra(obraNueva);
        txtFldDireccion.setText("");
        txtFldNroPerm.setText("");
        spinnerAno.setValue(2020);
        spinnerMes.setValue(1);
        rubrosSeleccionados.clear();
        presupuestoTotal = 0;
        actualizarPresupuestoTotal();
        JOptionPane.showMessageDialog(this, "Obra registrada con exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
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
