
package vista;

import controlador.ControladorUsuario;
import modelo.Usuarios;




public class FRMregistroUsuarios extends javax.swing.JInternalFrame {

    ControladorUsuario usuarioController = new ControladorUsuario();

    public FRMregistroUsuarios() {
        initComponents();
        txtIdusuarios.setValue(0);
        txtIdusuarios.setVisible(true);
        limpiarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtRolUsu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCelularUsu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombreUsu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbTipoIdent = new javax.swing.JComboBox<>();
        txtDireccionUsu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPasswordUsu = new javax.swing.JPasswordField();
        txtNickUsu = new javax.swing.JTextField();
        txtApellidosUsu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCorreoElect = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BTNinsertarUsu = new javax.swing.JButton();
        BTNmodificarUsu = new javax.swing.JButton();
        BTNeliminarUsu = new javax.swing.JButton();
        txtnumId = new javax.swing.JFormattedTextField();
        txtIdusuarios = new javax.swing.JFormattedTextField();
        BTNLlenartabla = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("REGISTRO DE USUARIO");

        jLabel7.setText("CIUDAD Y DIRECCION: ");

        txtRolUsu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRolUsuFocusGained(evt);
            }
        });

        jLabel3.setText("NOMBRE(S): ");

        jLabel9.setText("USUARIO: ");

        jLabel2.setText("NUMERO IDENTIFICACION: ");

        jLabel10.setText("CONTRASE??A: ");

        txtCelularUsu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCelularUsuFocusGained(evt);
            }
        });

        jLabel5.setText("CELULAR: ");

        txtNombreUsu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreUsuFocusGained(evt);
            }
        });

        jLabel4.setText("APELLIDOS: ");

        jLabel1.setText("TIPO IDENTIFICACION: ");

        cbTipoIdent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "TI", "CE" }));
        cbTipoIdent.setName("SELECCIONE"); // NOI18N

        txtDireccionUsu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionUsuFocusGained(evt);
            }
        });
        txtDireccionUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionUsuActionPerformed(evt);
            }
        });

        jLabel6.setText("CORREO ELECTRONICO: ");

        txtPasswordUsu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordUsuFocusGained(evt);
            }
        });

        txtNickUsu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNickUsuFocusGained(evt);
            }
        });
        txtNickUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNickUsuActionPerformed(evt);
            }
        });

        txtApellidosUsu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidosUsuFocusGained(evt);
            }
        });
        txtApellidosUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosUsuActionPerformed(evt);
            }
        });

        jLabel8.setText("ROL: ");

        txtCorreoElect.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoElectFocusGained(evt);
            }
        });
        txtCorreoElect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\darci\\Documents\\NetBeansProjects\\ProyectoAlmacen\\src\\imagenes\\128UsuForm.png")); // NOI18N

        BTNinsertarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16BtPre.png"))); // NOI18N
        BTNinsertarUsu.setText("GUARDAR");
        BTNinsertarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNinsertarUsuActionPerformed(evt);
            }
        });

        BTNmodificarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16btGuar.png"))); // NOI18N
        BTNmodificarUsu.setText("MODIFICAR");
        BTNmodificarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNmodificarUsuActionPerformed(evt);
            }
        });

        BTNeliminarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16Eliminar.png"))); // NOI18N
        BTNeliminarUsu.setText("ELIMINAR");
        BTNeliminarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNeliminarUsuActionPerformed(evt);
            }
        });

        txtnumId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnumIdFocusGained(evt);
            }
        });
        txtnumId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTNinsertarUsu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(BTNmodificarUsu)
                        .addGap(36, 36, 36)
                        .addComponent(BTNeliminarUsu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPasswordUsu)
                            .addComponent(cbTipoIdent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreUsu)
                            .addComponent(txtApellidosUsu)
                            .addComponent(txtCelularUsu)
                            .addComponent(txtCorreoElect)
                            .addComponent(txtDireccionUsu)
                            .addComponent(txtRolUsu)
                            .addComponent(txtNickUsu, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(txtnumId)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIdusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoIdent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnumId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidosUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelularUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoElect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRolUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNickUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNinsertarUsu)
                    .addComponent(BTNmodificarUsu)
                    .addComponent(BTNeliminarUsu))
                .addContainerGap())
        );

        BTNLlenartabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16tabla.png"))); // NOI18N
        BTNLlenartabla.setText("TABLA USUARIOS");
        BTNLlenartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLlenartablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTNLlenartabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNLlenartabla)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNickUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNickUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNickUsuActionPerformed

    private void BTNinsertarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNinsertarUsuActionPerformed

        usuarioController.controlarAccion(evt, obtenerUsuario());
        limpiarFormulario();

    }//GEN-LAST:event_BTNinsertarUsuActionPerformed

    private void BTNmodificarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNmodificarUsuActionPerformed
        
        usuarioController.controlarAccion(evt, obtenerUsuario());
        limpiarFormulario();
        
    }//GEN-LAST:event_BTNmodificarUsuActionPerformed

    private void BTNeliminarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNeliminarUsuActionPerformed

        usuarioController.controlarAccion(evt, obtenerUsuario());
        limpiarFormulario();

    }//GEN-LAST:event_BTNeliminarUsuActionPerformed

    private void txtnumIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumIdActionPerformed

    private void txtnumIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnumIdFocusGained
       txtnumId.setText("");
    }//GEN-LAST:event_txtnumIdFocusGained

    private void txtNombreUsuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreUsuFocusGained
       txtNombreUsu.setText("");
    }//GEN-LAST:event_txtNombreUsuFocusGained

    private void txtApellidosUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosUsuActionPerformed

    }//GEN-LAST:event_txtApellidosUsuActionPerformed

    private void txtApellidosUsuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosUsuFocusGained
       txtApellidosUsu.setText("");
    }//GEN-LAST:event_txtApellidosUsuFocusGained

    private void txtCelularUsuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularUsuFocusGained
       txtCelularUsu.setText("");
    }//GEN-LAST:event_txtCelularUsuFocusGained

    private void txtCorreoElectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectActionPerformed
       txtCorreoElect.setText("");
    }//GEN-LAST:event_txtCorreoElectActionPerformed

    private void txtDireccionUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionUsuActionPerformed
       txtDireccionUsu.setText("");
    }//GEN-LAST:event_txtDireccionUsuActionPerformed

    private void txtRolUsuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRolUsuFocusGained
       txtRolUsu.setText("");
    }//GEN-LAST:event_txtRolUsuFocusGained

    private void txtNickUsuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNickUsuFocusGained
       txtNickUsu.setText("");
    }//GEN-LAST:event_txtNickUsuFocusGained

    private void txtPasswordUsuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordUsuFocusGained
       txtPasswordUsu.setText("");
    }//GEN-LAST:event_txtPasswordUsuFocusGained

    private void txtCorreoElectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoElectFocusGained
       txtCorreoElect.setText("");
    }//GEN-LAST:event_txtCorreoElectFocusGained

    private void txtDireccionUsuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionUsuFocusGained
        txtDireccionUsu.setText("");//AL MOMENTO DE HACER CLICK SOBRE EL CAMPO SE PONE VACIO 
    }//GEN-LAST:event_txtDireccionUsuFocusGained

    private void BTNLlenartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLlenartablaActionPerformed
        TablaDatosUsuarios tabla = new TablaDatosUsuarios();
        FRMregistroUsuarios frmusuario = new FRMregistroUsuarios();
        MDInicio.escritorio.add(tabla);
       
        tabla.toFront();
        tabla.setVisible(true);
        usuarioController.controlarAccion(evt, obtenerUsuario());
        limpiarFormulario();
    }//GEN-LAST:event_BTNLlenartablaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNLlenartabla;
    private javax.swing.JButton BTNeliminarUsu;
    private javax.swing.JButton BTNinsertarUsu;
    private javax.swing.JButton BTNmodificarUsu;
    private javax.swing.JComboBox<String> cbTipoIdent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidosUsu;
    private javax.swing.JTextField txtCelularUsu;
    private javax.swing.JTextField txtCorreoElect;
    private javax.swing.JTextField txtDireccionUsu;
    private javax.swing.JFormattedTextField txtIdusuarios;
    private javax.swing.JTextField txtNickUsu;
    private javax.swing.JTextField txtNombreUsu;
    private javax.swing.JPasswordField txtPasswordUsu;
    private javax.swing.JTextField txtRolUsu;
    private javax.swing.JFormattedTextField txtnumId;
    // End of variables declaration//GEN-END:variables

    private void limpiarFormulario() {
        txtIdusuarios.setValue(0);
        cbTipoIdent.setToolTipText("SELECCIONE");
        txtnumId.setValue(0);
        txtNombreUsu.setText("ESCRIBE TU NOMBRE");
        txtApellidosUsu.setText("ESCRIBE TU APELLIDO");
        txtCelularUsu.setText("ESCRIBE TU CELULAR");
        txtCorreoElect.setText("ESCRIBE TU CORREO ELECTRONICO");
        txtDireccionUsu.setText("ESCRIBE TU DIRECCION");
        txtRolUsu.setText("ESCRIBE TU ROL");
        txtNickUsu.setText("ESCRIBE TU USUARIO");
        txtPasswordUsu.setText("ESCRIBE TU CONTRASE??A");

    }

    private Usuarios obtenerUsuario() {
        
        Usuarios elUsuario = new Usuarios();
        elUsuario.setIdusuarios((Integer) txtIdusuarios.getValue());
        elUsuario.setTipoidentUsu(cbTipoIdent.getSelectedItem() + "");
        elUsuario.setNoidentifUsu((int) txtnumId.getValue());
        elUsuario.setNombresUsu(txtNombreUsu.getText());
        elUsuario.setApellidosUsu(txtApellidosUsu.getText());
        elUsuario.setCelularUsu(txtCelularUsu.getText());
        elUsuario.setCorreoUsu(txtCorreoElect.getText());
        elUsuario.setDireccionUsu(txtDireccionUsu.getText());
        elUsuario.setRolUsu(txtRolUsu.getText());
        elUsuario.setNickUsu(txtNickUsu.getText());
        elUsuario.setPassword(txtPasswordUsu.getText());
        return elUsuario;
    }
}
