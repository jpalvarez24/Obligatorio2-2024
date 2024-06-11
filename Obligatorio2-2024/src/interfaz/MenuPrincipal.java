
package interfaz;

import dominio.Sistema;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MenuPrincipal extends javax.swing.JFrame {

    private Sistema sis;
    
    //Serializacion cuando se cierra la ventana
    public MenuPrincipal(Sistema unSistema) {
        sis = unSistema;
        initComponents();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    serializacion();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void serializacion() throws FileNotFoundException, IOException {
        FileOutputStream f = new FileOutputStream("archivo.ser");
        BufferedOutputStream b = new BufferedOutputStream(f);
        ObjectOutputStream s = new ObjectOutputStream(b);
        s.writeObject(sis);
        s.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        btnRegistrarRubro = new javax.swing.JMenuItem();
        btnRegistrarCapataz = new javax.swing.JMenuItem();
        btnRegistrarPropietario = new javax.swing.JMenuItem();
        btnRegistroObra = new javax.swing.JMenuItem();
        btnRegistroGastoObra = new javax.swing.JMenu();
        btnRegistroGasto = new javax.swing.JMenuItem();
        btnPagoGasto = new javax.swing.JMenuItem();
        btnEstadoObra = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        btnImportacionDatos = new javax.swing.JMenuItem();
        btnExportacionDatos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Registros");

        btnRegistrarRubro.setMnemonic('o');
        btnRegistrarRubro.setText("Registrar / Modificar rubro");
        btnRegistrarRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRubroActionPerformed(evt);
            }
        });
        fileMenu.add(btnRegistrarRubro);

        btnRegistrarCapataz.setMnemonic('s');
        btnRegistrarCapataz.setText("Registrar capataz");
        btnRegistrarCapataz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCapatazActionPerformed(evt);
            }
        });
        fileMenu.add(btnRegistrarCapataz);

        btnRegistrarPropietario.setMnemonic('a');
        btnRegistrarPropietario.setText("Registro de propietario");
        btnRegistrarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPropietarioActionPerformed(evt);
            }
        });
        fileMenu.add(btnRegistrarPropietario);

        btnRegistroObra.setMnemonic('x');
        btnRegistroObra.setText("Registro de obra");
        btnRegistroObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroObraActionPerformed(evt);
            }
        });
        fileMenu.add(btnRegistroObra);

        menuBar.add(fileMenu);

        btnRegistroGastoObra.setMnemonic('e');
        btnRegistroGastoObra.setText("Gastos");

        btnRegistroGasto.setMnemonic('t');
        btnRegistroGasto.setText("Registro de gasto para obra");
        btnRegistroGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroGastoActionPerformed(evt);
            }
        });
        btnRegistroGastoObra.add(btnRegistroGasto);

        btnPagoGasto.setMnemonic('y');
        btnPagoGasto.setText("Pago de gasto");
        btnPagoGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoGastoActionPerformed(evt);
            }
        });
        btnRegistroGastoObra.add(btnPagoGasto);

        btnEstadoObra.setMnemonic('p');
        btnEstadoObra.setText("Estado de obra");
        btnEstadoObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoObraActionPerformed(evt);
            }
        });
        btnRegistroGastoObra.add(btnEstadoObra);

        menuBar.add(btnRegistroGastoObra);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Importacion y Exportacion");

        btnImportacionDatos.setMnemonic('c');
        btnImportacionDatos.setText("Importacion de datos para obra nueva");
        helpMenu.add(btnImportacionDatos);

        btnExportacionDatos.setMnemonic('a');
        btnExportacionDatos.setText("Exportacion de datos de Propietarios y Capataces");
        btnExportacionDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportacionDatosActionPerformed(evt);
            }
        });
        helpMenu.add(btnExportacionDatos);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        setBounds(0, 0, 671, 423);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnRegistroObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroObraActionPerformed
        new RegistroObra(sis).setVisible(true);
    }//GEN-LAST:event_btnRegistroObraActionPerformed

    private void btnExportacionDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportacionDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportacionDatosActionPerformed

    private void btnRegistrarCapatazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCapatazActionPerformed
        new RegistroCapataz(sis).setVisible(true);
    }//GEN-LAST:event_btnRegistrarCapatazActionPerformed

    private void btnRegistrarRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRubroActionPerformed
        new RegistroRubro(sis).setVisible(true);
    }//GEN-LAST:event_btnRegistrarRubroActionPerformed

    private void btnRegistrarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPropietarioActionPerformed
        new RegistroPropietario(sis).setVisible(true);
    }//GEN-LAST:event_btnRegistrarPropietarioActionPerformed

    private void btnRegistroGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroGastoActionPerformed
        new RegistroGastoObra(sis).setVisible(true);
    }//GEN-LAST:event_btnRegistroGastoActionPerformed

    private void btnPagoGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoGastoActionPerformed
        new PagoGastos(sis).setVisible(true);
    }//GEN-LAST:event_btnPagoGastoActionPerformed

    private void btnEstadoObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoObraActionPerformed
        new EstadoObra(sis).setVisible(true);
    }//GEN-LAST:event_btnEstadoObraActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnEstadoObra;
    private javax.swing.JMenuItem btnExportacionDatos;
    private javax.swing.JMenuItem btnImportacionDatos;
    private javax.swing.JMenuItem btnPagoGasto;
    private javax.swing.JMenuItem btnRegistrarCapataz;
    private javax.swing.JMenuItem btnRegistrarPropietario;
    private javax.swing.JMenuItem btnRegistrarRubro;
    private javax.swing.JMenuItem btnRegistroGasto;
    private javax.swing.JMenu btnRegistroGastoObra;
    private javax.swing.JMenuItem btnRegistroObra;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
