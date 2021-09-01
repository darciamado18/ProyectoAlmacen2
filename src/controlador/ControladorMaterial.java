
package controlador;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import modelo.Materiales;



public class ControladorMaterial {
    public void controlarAccion(ActionEvent evento, Materiales unMaterial){
        
        String accion=evento.getActionCommand();
        JOptionPane.showMessageDialog(null, accion + " MATERIAL ");
        System.out.println(accion);
        switch(accion){
            case "GUARDAR"    -> unMaterial.insertar2();
            case "MODIFICAR"  -> unMaterial.modificar2();
            case "ELIMINAR  " -> unMaterial.eliminar2();
        }
    }
}
