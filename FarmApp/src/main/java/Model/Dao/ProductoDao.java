package Model.Dao;

import Model.Entity.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import red.BaseDatos;

public class ProductoDao implements IProducto {
    final static String SQL_INSERTAR = "INSERT INTO producto(id_producto, nombre, referencia, caracteristicas, efectos_secundarios, imagen,fecha_vencimiento,precio) VALUES(?,?,?,?,?,?,?,?)";
    final static String SQL_BORRAR = "DELETE FROM producto WHERE id_producto = ?";
    final static String SQL_ACTUALIZAR = "UPDATE producto SET nombre = ?, referencia = ?, caracteristicas = ?, efectos_secundarios = ?, imagen = ?, fecha_vencimiento = ?, precio =? WHERE id_producto = ?";
    final static String SQL_CONSULTAR = "SELECT * FROM producto";
    @Override
    public int Insertar(Producto producto) {
        Connection connection = null;
         PreparedStatement sentencia = null;
            int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_INSERTAR);
            sentencia.setInt(1, producto.getId());
            sentencia.setString(2,producto.getNombre());
            sentencia.setString(3,producto.getReferencia());
            sentencia.setString(4,producto.getCaracteristicas());
            sentencia.setString(5,producto.getEfectSecundarios());
            sentencia.setString(6,producto.getImagen());
            sentencia.setString(7,producto.getFecha());
            sentencia.setFloat(8,producto.getPrecio());
            resultado = sentencia.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally
        {
               try {
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
        return resultado;    
    }

    @Override
    public List<Producto> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto consultarId(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int borrar(Producto producto) {
        Connection connection = null;
        PreparedStatement sentencia = null;
        int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_BORRAR);

            sentencia.setInt(1, producto.getId());
            resultado = sentencia.executeUpdate();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        finally
        {
               try {
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
        
        return resultado;
    }

    @Override
    public int actualizar(Producto producto) {
        Connection connection = null;
            PreparedStatement sentencia = null;
            int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_ACTUALIZAR);
            sentencia.setString(1,producto.getNombre());
            sentencia.setString(2,producto.getReferencia());
            sentencia.setString(3,producto.getCaracteristicas());
            sentencia.setString(4,producto.getEfectSecundarios());
            sentencia.setString(5,producto.getImagen());
            sentencia.setString(6,producto.getFecha());
            sentencia.setFloat(7,producto.getPrecio());
            sentencia.setInt(8, producto.getId());
            resultado = sentencia.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally
        {
               try {
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
        return resultado;
    }

}
