
package vista;


import controlador.ControladorMaterial;
import modelo.Materiales;


public class FRMregistrObjeto extends javax.swing.JInternalFrame {

    ControladorMaterial materialController = new ControladorMaterial();

    public FRMregistrObjeto() {
        initComponents();
        txtIdMateriales.setValue(0);
        txtIdMateriales.setVisible(true);
        limpiarFormulario();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtNomArticulo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtSerial = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtEstado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BTNGuardarMat = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtIdMateriales = new javax.swing.JFormattedTextField();
        BTNModificarMat = new javax.swing.JButton();
        BTNEliminarMat = new javax.swing.JButton();
        BTNTablaMat = new javax.swing.JButton();
        JDFechaCompra = new javax.swing.JTextField();
        JDFechaSalida = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("REGISTRO DE MATERIALES ");

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        txtNomArticulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomArticuloFocusGained(evt);
            }
        });

        txtMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMarcaFocusGained(evt);
            }
        });

        txtModelo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtModeloFocusGained(evt);
            }
        });

        txtSerial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSerialFocusGained(evt);
            }
        });

        txtPrecioCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioCompraFocusGained(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);

        txtEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEstadoFocusGained(evt);
            }
        });
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });

        jLabel1.setText("NOMBRE ARTICULO: ");

        jLabel2.setText("MARCA:");

        jLabel3.setText("MODELO:");

        jLabel4.setText("SERIAL:");

        jLabel5.setText("FECHA COMPRA:");

        jLabel6.setText("FECHA SALIDA:");

        jLabel7.setText("PRECIO COMPRA:");

        jLabel8.setText("DESCRIPCI??N:");

        jLabel9.setText("ESTADO:");

        BTNGuardarMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16btGuar.png"))); // NOI18N
        BTNGuardarMat.setText("GUARDAR");
        BTNGuardarMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGuardarMatActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/67formularioObjetos.png"))); // NOI18N

        BTNModificarMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16BtPre.png"))); // NOI18N
        BTNModificarMat.setText("MODIFICAR");
        BTNModificarMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarMatActionPerformed(evt);
            }
        });

        BTNEliminarMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16elimbasura.png"))); // NOI18N
        BTNEliminarMat.setText("ELIMINAR");
        BTNEliminarMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarMatActionPerformed(evt);
            }
        });

        BTNTablaMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16tabla.png"))); // NOI18N
        BTNTablaMat.setText("TABLA MATERIALES");
        BTNTablaMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNTablaMatActionPerformed(evt);
            }
        });

        JDFechaCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JDFechaCompraFocusGained(evt);
            }
        });

        JDFechaSalida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JDFechaSalidaFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNTablaMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(BTNGuardarMat))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(BTNModificarMat, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(BTNEliminarMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEstado)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(txtSerial, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNomArticulo, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(JDFechaCompra))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioCompra)
                            .addComponent(JDFechaSalida))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txtIdMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JDFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addComponent(JDFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNGuardarMat)
                    .addComponent(BTNModificarMat)
                    .addComponent(BTNEliminarMat))
                .addGap(18, 18, 18)
                .addComponent(BTNTablaMat)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MATERIAL", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNGuardarMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGuardarMatActionPerformed
        materialController.controlarAccion(evt, obtenerMaterial());
        limpiarFormulario();                
    }//GEN-LAST:event_BTNGuardarMatActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void BTNModificarMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarMatActionPerformed
       materialController.controlarAccion(evt, obtenerMaterial());
       limpiarFormulario();
    }//GEN-LAST:event_BTNModificarMatActionPerformed

    private void BTNEliminarMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarMatActionPerformed
        materialController.controlarAccion(evt, obtenerMaterial());
        System.out.println("PASO AL LIMPIAR");
        limpiarFormulario();
    }//GEN-LAST:event_BTNEliminarMatActionPerformed

    private void txtNomArticuloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomArticuloFocusGained
        txtNomArticulo.setText("");
    }//GEN-LAST:event_txtNomArticuloFocusGained

    private void txtMarcaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMarcaFocusGained
        txtMarca.setText("");
    }//GEN-LAST:event_txtMarcaFocusGained

    private void txtModeloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtModeloFocusGained
         txtModelo.setText("");
    }//GEN-LAST:event_txtModeloFocusGained

    private void txtSerialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSerialFocusGained
        txtSerial.setText("");
    }//GEN-LAST:event_txtSerialFocusGained

    private void txtPrecioCompraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioCompraFocusGained
        txtPrecioCompra.setText("");
    }//GEN-LAST:event_txtPrecioCompraFocusGained

    private void txtDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusGained
        txtDescripcion.setText("");
    }//GEN-LAST:event_txtDescripcionFocusGained

    private void txtEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstadoFocusGained
        txtEstado.setText("");
    }//GEN-LAST:event_txtEstadoFocusGained

    private void BTNTablaMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNTablaMatActionPerformed
        TablaDatosMateriales tabla = new TablaDatosMateriales();
        FRMregistrObjeto frmmaterial = new FRMregistrObjeto();
        MDInicio.escritorio.add(tabla);
       
        tabla.toFront();
        tabla.setVisible(true);
       
        limpiarFormulario();
    }//GEN-LAST:event_BTNTablaMatActionPerformed

    private void JDFechaCompraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JDFechaCompraFocusGained
        JDFechaCompra.setText("");
    }//GEN-LAST:event_JDFechaCompraFocusGained

    private void JDFechaSalidaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JDFechaSalidaFocusGained
      JDFechaSalida.setText("");
    }//GEN-LAST:event_JDFechaSalidaFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEliminarMat;
    private javax.swing.JButton BTNGuardarMat;
    private javax.swing.JButton BTNModificarMat;
    private javax.swing.JButton BTNTablaMat;
    private javax.swing.JTextField JDFechaCompra;
    private javax.swing.JTextField JDFechaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JFormattedTextField txtIdMateriales;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNomArticulo;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtSerial;
    // End of variables declaration//GEN-END:variables

    private void limpiarFormulario() {
       
        txtIdMateriales.setValue(0);
        txtNomArticulo.setText("Escribe Nombre");
        txtMarca.setText("Escribe Marca");
        txtModelo.setText("Escribe Modelo");
        txtSerial.setText("Escribe Serial");
        JDFechaCompra.setText("FECHA COMPRA CON GUION(-) ");
        txtPrecioCompra.setText("Escribe Precio De Compra");
        JDFechaSalida.setText("FECHA SALIDA CON GUION(-)");
        txtDescripcion.setText("Escribe Descripcion Del Producto");
        txtEstado.setText("Escribe Estado del Producto");
    }

    private Materiales obtenerMaterial() {
       
        Materiales elMaterial = new Materiales();
        elMaterial.setIdMateriales((Integer) txtIdMateriales.getValue());
        elMaterial.setNombreArticulo(        txtNomArticulo.getText());
        elMaterial.setMarca(                 txtMarca.getText());
        elMaterial.setModelo(                txtModelo.getText());
        elMaterial.setSerial(                txtSerial.getText());
        elMaterial.setFechaCompra(           JDFechaCompra.getText());
        elMaterial.setPrecioCompra(          txtPrecioCompra.getText());
        elMaterial.setFechaSalida(JDFechaSalida.getText());
        elMaterial.setDescripcionMat(        txtDescripcion.getText());
        elMaterial.setEstado(                txtEstado.getText());
        System.out.println("LLENA TODO OBTENER");
        return elMaterial;
    }
}
