
package vista;

import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import modelo.Materiales;
import modelo.Usuarios;


public class TablaDatosMateriales extends javax.swing.JInternalFrame {

  
    public TablaDatosMateriales() {
        initComponents();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TBLMateriales = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("MATERIALES REGISTRADOS");

        TBLMateriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "MARCA", "MODELO", "SERIAL", "FECHA COMPRA", "PRECIO COMPRA", "FECHA SALIDA", "DESCRIPCION", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TBLMateriales);
        if (TBLMateriales.getColumnModel().getColumnCount() > 0) {
            TBLMateriales.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("TABLA MATERIALES");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/16Llenar.png"))); // NOI18N
        jButton1.setText("LLENAR TABLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        llenarTabla();  
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBLMateriales;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        Materiales unMaterial           = new Materiales();
        DefaultTableModel tabla         = (DefaultTableModel)TBLMateriales.getModel();
        Iterator<Materiales> itMaterial = unMaterial.listar();
        Object[] filaMaterial           = new Object[TBLMateriales.getColumnCount()];
        tabla.setRowCount(0);
        
        while (itMaterial.hasNext()) {
            unMaterial       = itMaterial.next();
            filaMaterial[0]  = unMaterial.getIdMateriales();
            filaMaterial[1]  = unMaterial.getNombreArticulo();
            filaMaterial[2]  = unMaterial.getMarca();
            filaMaterial[3]  = unMaterial.getModelo();
            filaMaterial[4]  = unMaterial.getSerial();
            filaMaterial[5]  = unMaterial.getFechaCompra();
            filaMaterial[6]  = unMaterial.getPrecioCompra();
            filaMaterial[7]  = unMaterial.getFechaSalida();
            filaMaterial[8]  = unMaterial.getDescripcionMat();
            filaMaterial[9]  = unMaterial.getEstado();
            tabla.addRow(filaMaterial);  //AGREGAMOS LA FILA A LA TABLA                                 
        }              
    }    
}

