/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorUsuario;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Usuarios;

/**
 *
 * @author darci
 */
public class TablaDatosUsuarios extends javax.swing.JInternalFrame {
  ControladorUsuario usuarioController = new ControladorUsuario();
    /**
     * Creates new form TablaDatosUsuarios
     */
    public TablaDatosUsuarios() {
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
        TBLUsuariosR = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnLlenarTabla = new javax.swing.JButton();
        BTNModTabla = new javax.swing.JButton();
        BTNElimTabla = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("USUARIOS REGISTRADOS");

        TBLUsuariosR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID USUARIO", "TIPO IDENTIFICACION", "N° IDENTIFICACION", "NOMBRES ", "APELLIDOS", "CELULAR", "CORREO ELECTRONICO", "DIRECCION", "ROL", "USUARIO", "CONTRASEÑA"
            }
        ));
        TBLUsuariosR.setName("TBLUsuariosR"); // NOI18N
        TBLUsuariosR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLUsuariosRMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLUsuariosR);
        if (TBLUsuariosR.getColumnModel().getColumnCount() > 0) {
            TBLUsuariosR.getColumnModel().getColumn(0).setResizable(false);
            TBLUsuariosR.getColumnModel().getColumn(1).setResizable(false);
            TBLUsuariosR.getColumnModel().getColumn(2).setResizable(false);
            TBLUsuariosR.getColumnModel().getColumn(3).setResizable(false);
            TBLUsuariosR.getColumnModel().getColumn(4).setResizable(false);
            TBLUsuariosR.getColumnModel().getColumn(5).setResizable(false);
            TBLUsuariosR.getColumnModel().getColumn(6).setResizable(false);
            TBLUsuariosR.getColumnModel().getColumn(7).setResizable(false);
            TBLUsuariosR.getColumnModel().getColumn(8).setResizable(false);
            TBLUsuariosR.getColumnModel().getColumn(9).setResizable(false);
            TBLUsuariosR.getColumnModel().getColumn(10).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel1.setText("TABLA USUARIOS ");

        btnLlenarTabla.setText("LLENAR TABLA");
        btnLlenarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarTablaActionPerformed(evt);
            }
        });

        BTNModTabla.setText("MODIFICAR");
        BTNModTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModTablaActionPerformed(evt);
            }
        });

        BTNElimTabla.setText("ELIMINAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnLlenarTabla)
                        .addGap(120, 120, 120)
                        .addComponent(BTNModTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(BTNElimTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLlenarTabla)
                    .addComponent(BTNModTabla)
                    .addComponent(BTNElimTabla))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLlenarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenarTablaActionPerformed
       llenarTabla();        
    }//GEN-LAST:event_btnLlenarTablaActionPerformed

    private void TBLUsuariosRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLUsuariosRMouseClicked
        if (evt.getClickCount()==2) {
            int fila = TBLUsuariosR.rowAtPoint(evt.getPoint());
            if (fila>-1) {
               
            
                
            }
            
        }
    }//GEN-LAST:event_TBLUsuariosRMouseClicked

    private void BTNModTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModTablaActionPerformed
      
        usuarioController.controlarAccion(evt, obtenerUsuario());
        
      
    }//GEN-LAST:event_BTNModTablaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNElimTabla;
    private javax.swing.JButton BTNModTabla;
    private javax.swing.JTable TBLUsuariosR;
    private javax.swing.JButton btnLlenarTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void llenarTabla() {
        Usuarios unUsuario           = new Usuarios();
        DefaultTableModel tabla     = (DefaultTableModel)TBLUsuariosR.getModel();
        Iterator<Usuarios> itUsuario = unUsuario.listar();
        Object[] filaUsuario        = new Object[TBLUsuariosR.getColumnCount()];
        tabla.setRowCount(0);
        
        while (itUsuario.hasNext()) {
            unUsuario       = itUsuario.next();
            filaUsuario[0]  = unUsuario.getIdusuarios();
            filaUsuario[1]  = unUsuario.getTipoidentUsu();
            filaUsuario[2]  = unUsuario.getNoidentifUsu();
            filaUsuario[3]  = unUsuario.getNombresUsu();
            filaUsuario[4]  = unUsuario.getApellidosUsu();
            filaUsuario[5]  = unUsuario.getCelularUsu();
            filaUsuario[6]  = unUsuario.getCorreoUsu();
            filaUsuario[7]  = unUsuario.getDireccionUsu();
            filaUsuario[8]  = unUsuario.getRolUsu();
            filaUsuario[9]  = unUsuario.getNickUsu();
            filaUsuario[10] = unUsuario.getPassword();
            tabla.addRow(filaUsuario);  //AGREGAMOS LA FILA A LA TABLA
                                 
        }
              
    }
    
    private Usuarios obtenerUsuario(){
    
        Usuarios unUsuario           = new Usuarios();
        DefaultTableModel tabla     = (DefaultTableModel)TBLUsuariosR.getModel();
        unUsuario.modificar();
        Object[] filaUsuario        = new Object[TBLUsuariosR.getColumnCount()];
        tabla.setRowCount(0);
      return unUsuario;
        
    }
}
