/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;
import dominio.Sistema;
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
        jListaObras.setListData(sis.getListaObras().toArray());
        jListaRubros.setListData(sis.getListaRubros().toArray());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListaObras = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListaRubros = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        lblNroPermiso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtFldMonto = new javax.swing.JTextField();
        spinnerMes = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        spinnerAno = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDesc = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jListaObras.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListaObras);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 30, 140, 122);

        jListaRubros.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListaRubros);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(380, 30, 140, 122);

        jLabel1.setText("Permiso Nro:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 70, 70, 13);

        lblNroPermiso.setText("jLabel2");
        getContentPane().add(lblNroPermiso);
        lblNroPermiso.setBounds(290, 70, 50, 13);

        jLabel3.setText("Direccion:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 100, 50, 13);

        lblDireccion.setText("jLabel4");
        getContentPane().add(lblDireccion);
        lblDireccion.setBounds(290, 100, 31, 13);

        btnRegistrar.setText("Registrar");
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(490, 370, 75, 21);

        jLabel5.setText("Monro:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 170, 50, 13);

        txtFldMonto.setText("jTextField1");
        getContentPane().add(txtFldMonto);
        txtFldMonto.setBounds(30, 190, 55, 19);

        spinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(spinnerMes);
        spinnerMes.setBounds(30, 240, 50, 20);

        jLabel6.setText("Mes/ Ano");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 220, 50, 13);
        getContentPane().add(spinnerAno);
        spinnerAno.setBounds(90, 240, 50, 20);

        jLabel7.setText("Descripcion:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 280, 60, 13);

        txtAreaDesc.setColumns(20);
        txtAreaDesc.setRows(5);
        jScrollPane3.setViewportView(txtAreaDesc);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 300, 166, 71);

        setBounds(0, 0, 595, 441);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
