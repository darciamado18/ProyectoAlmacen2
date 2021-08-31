package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Usuarios {
    
    private int    idusuarios;
    private String tipoidentUsu;
    private int    noidentifUsu; 
    private String nombresUsu;
    private String apellidosUsu;
    private String celularUsu;
    private String correoUsu;
    private String direccionUsu;
    private String rolUsu;
    private String nickUsu;
    private String password; 

    public int getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(int idusuarios) {
        this.idusuarios = idusuarios;
    }

    public String getTipoidentUsu() {
        return tipoidentUsu;
    }

    public void setTipoidentUsu(String tipoidentUsu) {
        this.tipoidentUsu = tipoidentUsu;
    }

    public int getNoidentifUsu() {
        return noidentifUsu;
    }

    public void setNoidentifUsu(int noidentifUsu) {
        this.noidentifUsu = noidentifUsu;
    }

    public String getNombresUsu() {
        return nombresUsu;
    }

    public void setNombresUsu(String nombresUsu) {
        this.nombresUsu = nombresUsu;
    }

    public String getApellidosUsu() {
        return apellidosUsu;
    }

    public void setApellidosUsu(String apellidosUsu) {
        this.apellidosUsu = apellidosUsu;
    }

    public String getCelularUsu() {
        return celularUsu;
    }

    public void setCelularUsu(String celularUsu) {
        this.celularUsu = celularUsu;
    }

    public String getCorreoUsu() {
        return correoUsu;
    }

    public void setCorreoUsu(String correoUsu) {
        this.correoUsu = correoUsu;
    }

    public String getDireccionUsu() {
        return direccionUsu;
    }

    public void setDireccionUsu(String direccionUsu) {
        this.direccionUsu = direccionUsu;
    }

    public String getRolUsu() {
        return rolUsu;
    }

    public void setRolUsu(String rolUsu) {
        this.rolUsu = rolUsu;
    }

    public String getNickUsu() {
        return nickUsu;
    }

    public void setNickUsu(String nickUsu) {
        this.nickUsu = nickUsu;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    @Override
    public String toString() {
        return "Usuario{" + "nombresUsu=" + nombresUsu + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    //NOS PERMITE REALIZAR COMPARACIONES BASADO EN EL ID CLIENTE 

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuarios other = (Usuarios) obj;
        if (this.idusuarios != other.idusuarios) {
            return false;
        }
        return true;
    }
    
    
    public Iterator<Usuarios> listar(){
        ArrayList<Usuarios> losUsuarios = new ArrayList<>();
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "+this.getClass().getSimpleName());
            ResultSet rs = sql.executeQuery();
            Usuarios unUsuario;
            while (rs.next()) {
                unUsuario = new Usuarios();
                unUsuario.setIdusuarios(   rs.getInt   ("idusuarios"));
                unUsuario.setTipoidentUsu( rs.getString("tipoidentUsu"));
                unUsuario.setNoidentifUsu( rs.getInt   ("noidentifUsu"));
                unUsuario.setNombresUsu(   rs.getString("nombresUsu"));
                unUsuario.setApellidosUsu( rs.getString("apellidosUsu"));
                unUsuario.setCelularUsu(   rs.getString("celularUsu"));
                unUsuario.setCorreoUsu(    rs.getString("correoUsu"));
                unUsuario.setDireccionUsu( rs.getString("direccionUsu"));
                unUsuario.setRolUsu(       rs.getString("rolUsu"));
                unUsuario.setNickUsu(      rs.getString("nick"));
                losUsuarios.add(unUsuario);                
            }          
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR EL USUARIO:"+ex.getMessage());
        }
        if (losUsuarios.isEmpty()){
            Usuarios miUsuario = new Usuarios();
            miUsuario.setNombresUsu("NO HAY USUARIOS");
            losUsuarios.add(miUsuario);
        }
        return losUsuarios.iterator();
    }
        
    public void insertar(){
        try { 
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("INSERT INTO usuarios VALUES (NULL,?,?,?,?,?,?,?,?,?,?)");           
            sql.setString(1,  this.getTipoidentUsu());
            sql.setInt(   2,  this.getNoidentifUsu());
            sql.setString(3,  this.getNombresUsu());
            sql.setString(4,  this.getApellidosUsu());
            sql.setString(5,  this.getCelularUsu());
            sql.setString(6,  this.getCorreoUsu());
            sql.setString(7,  this.getDireccionUsu());
            sql.setString(8,  this.getRolUsu());
            sql.setString(9,  this.getNickUsu());
            sql.setString(10, this.getPassword());
            sql.executeUpdate();                       
            System.out.println(this.getClass().getSimpleName()+ "INSERTADO CORRECTAMENTE");               
        } catch (SQLException ex) {
            System.err.println("ERROR AL INSERTAR "+this.getClass().getSimpleName()+":"+ex.getMessage());
        }    
    }
        
    public void modificar(){
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("UPDATE "+this.getClass().getSimpleName()
            + " SET tipoidentUsu = ?, noidentifUsu = ?, nombresUsu = ?, apellidosUsu = ?, celularUsu = ?, correoUsu = ?, "
            + "direccionUsu = ?, rolUsu = ?, nick = ?, password = ?  WHERE idusuarios = ?");

            sql.setString(1,  this.getTipoidentUsu());
            sql.setInt(   2,  this.getNoidentifUsu());
            sql.setString(3,  this.getNombresUsu());
            sql.setString(4,  this.getApellidosUsu());
            sql.setString(5,  this.getCelularUsu());
            sql.setString(6,  this.getCorreoUsu());
            sql.setString(7,  this.getDireccionUsu());
            sql.setString(8,  this.getRolUsu());
            sql.setString(9, this.getNickUsu());
            sql.setString(10, this.getPassword());
            sql.setInt(   11, this.getIdusuarios());            
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " MODIFICADO CORRECTAMENTE");
            JOptionPane.showMessageDialog(null, "OBTUVO EL MODIFICAR");
        } catch (SQLException ex) {
            System.err.println("ERROR AL MODIFICAR"+this.getClass().getSimpleName()+": "+ex.getMessage());
        }
    }
    
    public void eliminar(){
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("DELETE FROM "
                    +this.getClass().getSimpleName()+" WHERE idusuarios = ?)");
            sql.setInt(1, this.getIdusuarios());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " ELIMINADO CORRECTAMENTE");
        } catch (SQLException ex) {
            System.err.println("ERROR AL ELIMINAR "+this.getClass().getSimpleName()+": "+ex.getMessage());
        }
    }
          
    public Iterator<Usuarios> buscar(String busqueda){
        ArrayList<Usuarios> losUsuarios = new ArrayList<>();
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "+this.getClass().getSimpleName()
            +" WHERE idusuarios LIKE ? OR tipoidentUsu LIKE ? OR noidentifUsu LIKE ? OR nombresUsu LIKE ? OR apellidosUsu LIKE ? OR celularUsu LIKE ? OR "
            + "correoUsu LIKE ? OR direccionUsu LIKE ? OR rolUsu LIKE ? OR nick LIKE ?");
            sql.setString(1,"%"+busqueda+"%" );
            sql.setString(2,"%"+busqueda+"%" ); 
            sql.setString(3,"%"+busqueda+"%" );
            sql.setString(4,"%"+busqueda+"%" );
            sql.setString(5,"%"+busqueda+"%" );
            sql.setString(6,"%"+busqueda+"%" );
            sql.setString(7,"%"+busqueda+"%" );
            sql.setString(8,"%"+busqueda+"%" );
            sql.setString(9,"%"+busqueda+"%" );
            ResultSet rs = sql.executeQuery();
            Usuarios unUsuario;
            while (rs.next()) {
               unUsuario = new Usuarios();
               unUsuario.setIdusuarios(   rs.getInt   ("idusuarios"));
               unUsuario.setTipoidentUsu( rs.getString("tipoidentUsu"));
               unUsuario.setNoidentifUsu( rs.getInt   ("noidentifUsu"));
               unUsuario.setNombresUsu(   rs.getString("apellidosUsu"));
               unUsuario.setApellidosUsu( rs.getString("apellidosUsu"));
               unUsuario.setCelularUsu(   rs.getString("correoUsu"));
               unUsuario.setCorreoUsu(    rs.getString("correoUsu"));
               unUsuario.setDireccionUsu( rs.getString("direccionUsu"));
               unUsuario.setRolUsu(       rs.getString("rolUsu"));
               unUsuario.setNickUsu(      rs.getString("nick"));
               losUsuarios.add(unUsuario);
            }
        } catch (SQLException ex) {
            System.err.println("ERROR AL BUSCAR "+this.getClass().getSimpleName()+": "+ex.getMessage());
        }
        return losUsuarios.iterator();
    }    
}
