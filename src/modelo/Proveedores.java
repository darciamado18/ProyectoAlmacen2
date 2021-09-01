
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;


public class Proveedores {
    
    private int idproveedores;
    private String nombresPro;
    private String apellidosPro;
    private String celularPro;
    private String numIdPro;
    private String nombreEmpresa;
    private String telefonoEmpresa;
    private String direccionEmpresa;
    private String nitEmpresa;
    private String lineaProduccion;

    public int getIdproveedores() {
        return idproveedores;
    }

    public void setIdproveedores(int idproveedores) {
        this.idproveedores = idproveedores;
    }

    public String getNombresPro() {
        return nombresPro;
    }

    public void setNombresPro(String nombresPro) {
        this.nombresPro = nombresPro;
    }

    public String getApellidosPro() {
        return apellidosPro;
    }

    public void setApellidosPro(String apellidosPro) {
        this.apellidosPro = apellidosPro;
    }

    public String getCelularPro() {
        return celularPro;
    }

    public void setCelularPro(String celularPro) {
        this.celularPro = celularPro;
    }

    public String getNumIdPro() {
        return numIdPro;
    }

    public void setNumIdPro(String numIdPro) {
        this.numIdPro = numIdPro;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getLineaProduccion() {
        return lineaProduccion;
    }

    public void setLineaProduccion(String lineaProduccion) {
        this.lineaProduccion = lineaProduccion;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "nombresPro=" + nombresPro + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

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
        final Proveedores other = (Proveedores) obj;
        if (this.idproveedores != other.idproveedores) {
            return false;
        }
        return true;
    }
    /**
     *
     * @return
     */
    public Iterator<Proveedores> listar(){
        ArrayList<Proveedores> losProveedores = new ArrayList<>();
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "+this.getClass().getSimpleName());
            ResultSet rs = sql.executeQuery();
            Proveedores unProveedor;
            while (rs.next()) {
                unProveedor = new Proveedores();
                unProveedor.setIdproveedores(   rs.getInt   ("idproveedores"));
                unProveedor.setNombresPro(      rs.getString("nombrePro"));
                unProveedor.setApellidosPro(    rs.getString("apellidosPro"));
                unProveedor.setCelularPro(      rs.getString("celularPro"));
                unProveedor.setNumIdPro(        rs.getString("numIdPro"));
                unProveedor.setNombreEmpresa(   rs.getString("nombreEmpresa"));
                unProveedor.setTelefonoEmpresa( rs.getString("telefonoEmpresa"));
                unProveedor.setDireccionEmpresa(rs.getString("direccionEmpresa"));
                unProveedor.setNitEmpresa(      rs.getString("nitEmpresa"));
                unProveedor.setLineaProduccion( rs.getString("lineaProduccion"));
                losProveedores.add(unProveedor);                
            }          
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR LOS PROVEEDORES:"+ex.getMessage());
        }
        if (losProveedores.isEmpty()){
            Proveedores miProveedor = new Proveedores();
            miProveedor.setNombresPro("NO HAY PROVEEDORES");
            losProveedores.add(miProveedor);
        }
        return losProveedores.iterator();
    }
    
    public void insertar(){
        try { 
            System.out.println("AQUI MATER TRY");
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("INSERT INTO proveedores VALUES (NULL,?,?,?,?,?,?,?,?,?)");
            
            sql.setString(1, this.getNombresPro());
            sql.setString(2, this.getApellidosPro());
            sql.setString(3, this.getCelularPro());
            sql.setString(4, this.getNumIdPro());
            sql.setString(5, this.getNombreEmpresa());
            sql.setString(6, this.getTelefonoEmpresa());
            sql.setString(7,  this.getDireccionEmpresa());
            sql.setString(8, this.getNitEmpresa());
            sql.setString(9, this.getLineaProduccion());
            sql.executeUpdate();   
            System.out.println("PASO DATOS MAT");
            System.out.println(this.getClass().getSimpleName()+ "INSERTADO CORRECTAMENTE");               
        } catch (SQLException ex) {
            System.err.println("ERROR AL INSERTAR "+this.getClass().getSimpleName()+":"+ex.getMessage());
        }    
    }
    
     public void modificar(){
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("UPDATE "+this.getClass().getSimpleName()
            + " SET nombrePro = ?, apellidosPro = ?, celularPro = ?, numIdPro = ?, nombreEmpresa = ?, telefonoEmpresa = ?, "
            + " direccionEmpresa = ?, nitEmpresa = ?, lineaProduccion = ? WHERE idproveedores = ?");

            sql.setString(1,  this.getNombresPro());
            sql.setString(2,  this.getApellidosPro());
            sql.setString(3,  this.getCelularPro());
            sql.setString(4,  this.getNumIdPro());
            sql.setString(5,  this.getNombreEmpresa());
            sql.setString(6,  this.getTelefonoEmpresa());
            sql.setString(7,  this.getDireccionEmpresa());
            sql.setString(8,  this.getNitEmpresa());
            sql.setString(9,  this.getLineaProduccion());   
            sql.setInt(  10,  this.getIdproveedores());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " MODIFICADO CORRECTAMENTE");
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL MODIFICAR"+this.getClass().getSimpleName()+": "+ex.getMessage());
        }
    }
     
     public void eliminar(){
        System.out.println("ENTRAR AL ELIMINAR FUNCION");
        try {
            System.out.println("ENTRA AL TRY MAT");
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("DELETE FROM proveedores WHERE idProveedores = ? ");
            System.out.println("PASA LA CONEXION");
            sql.setInt(1, this.getIdproveedores());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " ELIMINADO CORRECTAMENTE");
        } catch (SQLException ex) {
            System.err.println("ERROR AL ELIMINAR "+this.getClass().getSimpleName()+": "+ex.getMessage());
        }
    }
    
    }
    
    
            
    

