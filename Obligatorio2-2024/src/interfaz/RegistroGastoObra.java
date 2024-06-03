/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;
import dominio.*;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author Juan Pedro Alvarez-281369
 */
public class RegistroGastoObra extends javax.swing.JFrame implements Observer{

    private Sistema sis;
    
    public RegistroGastoObra(Sistema unSistema) {
        sis = unSistema;
        initComponents();
        this.sis.addObserver(this);
        modeloAPantalla();
    }
    @Override
    public void update(Observable o, Object ob){
        modeloAPantalla();
    }
    public void modeloAPantalla(){
        jListaRubros.setListData(sis.getListaRubros().toArray());
        jListaObras.setListData(sis.getListaObras().toArray());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListaRubros = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListaObras = new javax.swing.JList();
        lblNroPermiso = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtFldMonto = new javax.swing.JTextField();
        spinnerMes = new javax.swing.JSpinner();
        spinnerAno = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDesc = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(jListaRubros);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(270, 70, 200, 120);

        jListaObras.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListaObrasValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListaObras);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 70, 200, 120);

        lblNroPermiso.setText("0");
        getContentPane().add(lblNroPermiso);
        lblNroPermiso.setBounds(130, 220, 50, 20);
        getContentPane().add(lblDireccion);
        lblDireccion.setBounds(130, 250, 90, 30);

        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(400, 390, 90, 20);
        getContentPane().add(txtFldMonto);
        txtFldMonto.setBounds(270, 210, 70, 19);

        spinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(spinnerMes);
        spinnerMes.setBounds(270, 260, 50, 20);
        getContentPane().add(spinnerAno);
        spinnerAno.setBounds(330, 260, 50, 20);

        txtAreaDesc.setColumns(20);
        txtAreaDesc.setRows(5);
        jScrollPane3.setViewportView(txtAreaDesc);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(270, 310, 166, 70);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Monto:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(270, 190, 50, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Direccion:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 250, 120, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("       Mes      /    Año");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 240, 120, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Descripcion:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(270, 290, 80, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Permiso Numero:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 220, 120, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Registro de gasto de obra");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 10, 186, 17);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Rubros:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(270, 50, 100, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Obras:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 50, 120, 20);

        setBounds(0, 0, 517, 457);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Obra obra = (Obra) jListaObras.getSelectedValue();
        Rubro rubro = (Rubro) jListaRubros.getSelectedValue();
        int monto = Integer.parseInt(txtFldMonto.getText());
        int mes = (int) spinnerMes.getValue();
        int ano = (int) spinnerAno.getValue();
        String descp = txtAreaDesc.getText();
        
        Gasto g1 = new Gasto(rubro,monto,mes,ano,descp);
        obra.addGasto(g1);
        
        txtFldMonto.setText("");
        txtAreaDesc.setText("");
        spinnerMes.setValue(1);
        spinnerAno.setValue(2020);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jListaObrasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListaObrasValueChanged
        Obra obra = (Obra) jListaObras.getSelectedValue();
        lblDireccion.setText(obra.getDireccion());
        lblNroPermiso.setText(String.valueOf(obra.getNumPermisoObra()));
        
    }//GEN-LAST:event_jListaObrasValueChanged

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListaObras;
    private javax.swing.JList jListaRubros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNroPermiso;
    private javax.swing.JSpinner spinnerAno;
    private javax.swing.JSpinner spinnerMes;
    private javax.swing.JTextArea txtAreaDesc;
    private javax.swing.JTextField txtFldMonto;
    // End of variables declaration//GEN-END:variables
}
