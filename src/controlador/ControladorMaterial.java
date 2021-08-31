
package controlador;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import modelo.Materiales;



public class ControladorMaterial {
    public void controlarAccion(ActionEvent evento, Materiales unMaterial){
        
        String accion=evento.getActionCommand();
        JOptionPane.showMessageDialog(null, accion);
        switch(accion){
            case "GUARDAR"    -> unMaterial.insertar();
            case "MODIFICAR"  -> unMaterial.modificar();
            case "ELIMINAR  " -> unMaterial.eliminar();
        }
    }
}
