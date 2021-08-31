
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
    public static Connection conexion; 
    public Statement sentencia;
    public ResultSet resultado;
    
    public void  Conexion() {
        try {
            String driverBD  = "com.mysql.cj.jdbc.Driver";            
            String urlBD     = "jdbc:mysql://localhost:3306/sistemaalmacen";
            String usuarioBD = "root";
            String claveBD   = "";
            Class.forName(driverBD);           
            conexion = DriverManager.getConnection(urlBD, usuarioBD, claveBD);
            sentencia = conexion.createStatement();            
            System.out.println("CONEXION CORRECTA");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("No encuentro el driver "+ex.getMessage());
            System.err.println("Error al conectarme "+ex.getMessage());
        }
    }
    
    public void desconectarBD(){
        try {
            if(conexion != null){
                if(sentencia != null){
                   sentencia.close();
                }
                conexion.close();
            }
        } catch (SQLException ex) {
            System.err.println("Error al desconectarme:"+ex.getMessage());
            System.exit(1);
        }        
    }    
    public static ConexionBD getInstance(){
        return ConexionBDHolder.INSTANCE;
    }    
    private static class ConexionBDHolder{
        private static final ConexionBD INSTANCE = new ConexionBD();
    }  
}
