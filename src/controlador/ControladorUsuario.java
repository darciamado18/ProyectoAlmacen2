
package controlador;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import modelo.Usuarios;


public class ControladorUsuario {
    
    public void controlarAccion(ActionEvent evento, Usuarios unUsuario){
               

        String accion=evento.getActionCommand();
        JOptionPane.showMessageDialog(null, accion);
        switch(accion){
            case "GUARDAR"   -> unUsuario.insertar();
            case "MODIFICAR" -> unUsuario.modificar();
            case "ELIMINAR"  -> unUsuario.eliminar();
        }
    }
    
}
