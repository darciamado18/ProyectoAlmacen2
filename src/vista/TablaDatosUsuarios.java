
package vista;

import controlador.ControladorUsuario;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import modelo.Usuarios;
import java.sql.*;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionBD;
import static modelo.ConexionBD.conexion;

public class TablaDatosUsuarios extends javax.swing.JInternalFrame {
   
    ConexionBD CB = new ConexionBD();
    
    
 
   
    ControladorUsuario usuarioController = new ControladorUsuario();
   
    public TablaDatosUsuarios() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TBLusuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnLlenarTabla = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("USUARIOS REGISTRADOS");

        TBLusuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        TBLusuarios.setName("TBLusuarios"); // NOI18N
        TBLusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLusuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLusuarios);
        if (TBLusuarios.getColumnModel().getColumnCount() > 0) {
            TBLusuarios.getColumnModel().getColumn(0).setResizable(false);
            TBLusuarios.getColumnModel().getColumn(1).setResizable(false);
            TBLusuarios.getColumnModel().getColumn(2).setResizable(false);
            TBLusuarios.getColumnModel().getColumn(3).setResizable(false);
            TBLusuarios.getColumnModel().getColumn(4).setResizable(false);
            TBLusuarios.getColumnModel().getColumn(5).setResizable(false);
            TBLusuarios.getColumnModel().getColumn(6).setResizable(false);
            TBLusuarios.getColumnModel().getColumn(7).setResizable(false);
            TBLusuarios.getColumnModel().getColumn(8).setResizable(false);
            TBLusuarios.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel1.setText("TABLA USUARIOS ");

        btnLlenarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16Llenar.png"))); // NOI18N
        btnLlenarTabla.setText("LLENAR TABLA");
        btnLlenarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarTablaActionPerformed(evt);
            }
        });

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
                        .addGap(412, 412, 412)
                        .addComponent(btnLlenarTabla)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLlenarTabla)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLlenarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenarTablaActionPerformed
       llenarTabla();        
    }//GEN-LAST:event_btnLlenarTablaActionPerformed

    private void TBLusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLusuariosMouseClicked
        int row = TBLusuarios.getSelectedRow();
        Usuarios unUsuario           = new Usuarios();
        DefaultTableModel tabla     = (DefaultTableModel)TBLusuarios.getModel();
        Iterator<Usuarios> itUsuario = unUsuario.listar();
        
        
    }//GEN-LAST:event_TBLusuariosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBLusuarios;
    private javax.swing.JButton btnLlenarTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void llenarTabla() {
        Usuarios unUsuario           = new Usuarios();
        DefaultTableModel tabla     = (DefaultTableModel)TBLusuarios.getModel();
        Iterator<Usuarios> itUsuario = unUsuario.listar();
        Object[] filaUsuario        = new Object[TBLusuarios.getColumnCount()];
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
        DefaultTableModel tabla     = (DefaultTableModel)TBLusuarios.getModel();
         
//        unUsuario.modificar();
//        Object[] filaUsuario        = new Object[TBLusuarios.getColumnCount()];
        tabla.setRowCount(0);
        return unUsuario;
        
    }
}
