
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;



public class Materiales {
    
    private int    idMateriales;
    private String nombreArticulo;
    private String marca;
    private String modelo;
    private String serial;
    private String fechaCompra;
    private String precioCompra;
    private String fechaSalida;
    private String descripcionMat;
    private String estado;

    public int getIdMateriales() {
        return idMateriales;
    }

    public void setIdMateriales(int idregistroMateriales) {
        this.idMateriales = idregistroMateriales;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(String precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getDescripcionMat() {
        return descripcionMat;
    }

    public void setDescripcionMat(String descripcionMat) {
        this.descripcionMat = descripcionMat;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Materiales{" + "nombreArticulo=" + nombreArticulo + '}';
        //dato representativo
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
        final Materiales other = (Materiales) obj;
        if (this.idMateriales != other.idMateriales) {
            return false;
        }
        return true;
    }
    
    public Iterator<Materiales> listar(){
        ArrayList<Materiales> losMateriales = new ArrayList<>();
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "+this.getClass().getSimpleName());
            ResultSet rs = sql.executeQuery();
            Materiales unMaterial;
            while (rs.next()) {
                unMaterial = new Materiales();
                unMaterial.setIdMateriales(  rs.getInt   ("idMateriales"));
                unMaterial.setNombreArticulo(rs.getString("nombreArticulo"));
                unMaterial.setMarca(         rs.getString("marca"));
                unMaterial.setModelo(        rs.getString("modelo"));
                unMaterial.setSerial(        rs.getString("serial"));
                unMaterial.setFechaCompra(   rs.getString("fechaCompra"));
                unMaterial.setPrecioCompra(  rs.getString("precioCompra"));
                unMaterial.setFechaSalida(   rs.getString("fechaSalida"));
                unMaterial.setDescripcionMat(rs.getString("descripcionMat"));
                unMaterial.setEstado(        rs.getString("estado"));
                losMateriales.add(unMaterial);                
            }          
        } catch (SQLException ex) {
            System.err.println("ERROR AL LISTAR LOS MATERIALES:"+ex.getMessage());
        }
        if (losMateriales.isEmpty()){
            Materiales miMaterial = new Materiales();
            miMaterial.setNombreArticulo("NO HAY MATERIALES");
            losMateriales.add(miMaterial);
        }
        return losMateriales.iterator();
    }
    
      
    public void insertar2(){
        try { 
            System.out.println("AQUI MATER TRY");
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("INSERT INTO materiales VALUES (NULL,?,?,?,?,?,?,?,?,?)");
            
            sql.setString(1, this.getNombreArticulo());
            sql.setString(2, this.getMarca());
            sql.setString(3, this.getModelo());
            sql.setString(4, this.getSerial());
            sql.setString(5, this.getFechaCompra());
            sql.setString(6, this.getPrecioCompra());
            sql.setString(7,  this.getFechaSalida());
            sql.setString(8, this.getDescripcionMat());
            sql.setString(9, this.getEstado());
            sql.executeUpdate();   
            System.out.println("PASO DATOS MAT");
            System.out.println(this.getClass().getSimpleName()+ "INSERTADO CORRECTAMENTE");               
        } catch (SQLException ex) {
            System.err.println("ERROR AL INSERTAR "+this.getClass().getSimpleName()+":"+ex.getMessage());
        }    
    }

    public void modificar2(){
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("UPDATE "+this.getClass().getSimpleName()
            + " SET nombreArticulo = ?, marca = ?, modelo = ?, serial = ?, fechaCompra = ?, precioCompra = ?, "
            + "fechaSalida = ?, descripcionMat = ?, estado = ? WHERE idMateriales = ?");

            sql.setString(1,  this.getNombreArticulo());
            sql.setString(2,  this.getMarca());
            sql.setString(3,  this.getModelo());
            sql.setString(4,  this.getSerial());
            sql.setString(5,  this.getFechaCompra());
            sql.setString(6,  this.getPrecioCompra());
            sql.setString(7,  this.getFechaSalida());
            sql.setString(8,  this.getDescripcionMat());
            sql.setString(9,  this.getEstado());   
            sql.setInt(  10,  this.getIdMateriales());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " MODIFICADO CORRECTAMENTE");
            
        } catch (SQLException ex) {
            System.err.println("ERROR AL MODIFICAR"+this.getClass().getSimpleName()+": "+ex.getMessage());
        }
    }
    
    public void eliminar2(){
        System.out.println("ENTRAR AL ELIMINAR FUNCION");
        try {
            System.out.println("ENTRA AL TRY MAT");
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("DELETE FROM materiales WHERE idMateriales = ? ");
            System.out.println("PASA LA CONEXION");
            sql.setInt(1, this.getIdMateriales());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " ELIMINADO CORRECTAMENTE");
        } catch (SQLException ex) {
            System.err.println("ERROR AL ELIMINAR "+this.getClass().getSimpleName()+": "+ex.getMessage());
        }
    }
    
    public Iterator<Materiales> buscar(String busqueda){
        ArrayList<Materiales> losMateriales = new ArrayList<>();
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "+this.getClass().getSimpleName()
                    +" WHERE idMateriales LIKE ? OR nombreArticulo LIKE ? OR marca LIKE ? OR modelo LIKE ? OR serial LIKE ? OR "
                    + "fechaCompra LIKE ? OR precioCompra  LIKE ? OR fechaSalida  LIKE ? OR descripcionMat LIKE ? OR estado LIKE ? ");
            sql.setString(1,"%"+busqueda+"%" );
            sql.setString(2,"%"+busqueda+"%" ); 
            sql.setString(3,"%"+busqueda+"%" );
            sql.setString(4,"%"+busqueda+"%" );
            sql.setString(5,"%"+busqueda+"%" );
            sql.setString(6,"%"+busqueda+"%" );
            sql.setString(7,"%"+busqueda+"%" );
            sql.setString(8,"%"+busqueda+"%" );
            sql.setString(9,"%"+busqueda+"%" );
            sql.setString(10,"%"+busqueda+"%" );
            ResultSet rs = sql.executeQuery();
            Materiales unMaterial;
            while (rs.next()) {
               unMaterial = new Materiales();
               unMaterial.setIdMateriales(  rs.getInt   ("idMateriales"));
               unMaterial.setNombreArticulo(rs.getString("nombreArticulo"));
               unMaterial.setMarca(         rs.getString("marca"));
               unMaterial.setModelo(        rs.getString("modelo"));
               unMaterial.setSerial(        rs.getString("serial"));
               unMaterial.setFechaCompra(   rs.getString("fechaCompra"));
               unMaterial.setPrecioCompra(  rs.getString("precioCompra"));
               unMaterial.setFechaSalida(   rs.getString("fechaSalida"));
               unMaterial.setDescripcionMat(rs.getString("descripcionMat"));
               unMaterial.setEstado(        rs.getString("estado"));
               losMateriales.add(unMaterial);
            }
        } catch (SQLException ex) {
            System.err.println("ERROR AL BUSCAR "+this.getClass().getSimpleName()+": "+ex.getMessage());
        }
        return losMateriales.iterator();
    }    
}
