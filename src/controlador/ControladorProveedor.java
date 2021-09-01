
package controlador;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import modelo.Proveedores;


public class ControladorProveedor {
    
    public void controlarAccion(ActionEvent evento, Proveedores unProveedor){
        
        String accion=evento.getActionCommand();
        JOptionPane.showMessageDialog(null, accion + " PROVEEDOR ");
        System.out.println(accion);
        switch(accion){
            case "GUARDAR"    -> unProveedor.insertar();
            case "MODIFICAR"  -> unProveedor.modificar();
            case "ELIMINAR  " -> unProveedor.eliminar();
        }
    }
}

