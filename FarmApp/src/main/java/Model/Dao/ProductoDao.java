package Model.Dao;

import Model.Entity.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import red.BaseDatos;

public class ProductoDao implements IProducto {
    final static String SQL_INSERTAR = "INSERT INTO producto(id_producto, nombre, referencia, caracteristicas, efectos_secundarios, imagen,fecha_vencimiento,precio) VALUES(?,?,?,?,?,?,?,?)";
    final static String SQL_BORRAR = "DELETE FROM producto WHERE id_producto = ?";
    final static String SQL_ACTUALIZAR = "UPDATE producto SET nombre = ?, referencia = ?, caracteristicas = ?, efectos_secundarios = ?, imagen = ?, fecha_vencimiento = ?, precio =? WHERE id_producto = ?";
    final static String SQL_CONSULTAR = "SELECT * FROM producto";
    final static String SQL_CONSULTARID = "SELECT * FROM producto WHERE id_producto = ?";
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
           Connection connection = null;
           PreparedStatement sentencia = null;
           ResultSet resultado = null;
           List<Producto> productos = new ArrayList();
        try {
            
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_CONSULTAR);
            resultado = sentencia.executeQuery();
            while(resultado.next())
            {
                int id = resultado.getInt("id_producto");
                String nombre = resultado.getString("nombre");
                String referencia = resultado.getString("referencia");
                String caracteristicas = resultado.getString("caracteristicas");
                String efectosSecundarios = resultado.getString("efectos_secundarios");
                String fecha = resultado.getString("fecha_vencimiento");
                String imagen = resultado.getString("imagen");
                float precio = resultado.getFloat("precio");
                Producto producto = new Producto(id,nombre, referencia, caracteristicas, efectosSecundarios, fecha,imagen, precio);
                productos.add(producto);
                        
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
               try {
                   BaseDatos.close(resultado);
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
           return productos;
    }

    @Override
    public Producto consultarId(Producto producto) {
           Connection connection = null;
           PreparedStatement sentencia = null;
           ResultSet resultado = null;
           Producto rProd = null;
        try {
            
                connection = BaseDatos.getConnection();
                sentencia = connection.prepareStatement(SQL_CONSULTARID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
                sentencia.setInt(1, producto.getId());
                resultado = sentencia.executeQuery();
                resultado.absolute(1);
                
                int id = resultado.getInt("id_producto");
                String nombre = resultado.getString("nombre");
                String referencia = resultado.getString("referencia");
                String caracteristicas = resultado.getString("caracteristicas");
                String efectosSecundarios = resultado.getString("efectos_secundarios");
                String fecha = resultado.getString("fecha_vencimiento");
                String imagen = resultado.getString("imagen");
                float precio = resultado.getFloat("precio");
                rProd = new Producto(id,nombre, referencia, caracteristicas, efectosSecundarios, fecha,imagen, precio);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
               try {
                   BaseDatos.close(resultado);
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
           return rProd;
    }
    @Override
    public List<Producto> buscarRef(String columna,String ref) {
        Connection connection = null;
        Statement sentencia = null;
        ResultSet resultado = null;
        List<Producto> productos = new ArrayList();

        try {
            
            connection = BaseDatos.getConnection();
            sentencia = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
            resultado = sentencia.executeQuery( "SELECT * FROM producto WHERE "+columna+" LIKE '%"+ref+"%'");
            
            while(resultado.next())
            {
                int id = resultado.getInt("id_producto");
                String nombre = resultado.getString("nombre");
                String referencia = resultado.getString("referencia");
                String caracteristicas = resultado.getString("caracteristicas");
                String efectosSecundarios = resultado.getString("efectos_secundarios");
                String fecha = resultado.getString("fecha_vencimiento");
                String imagen = resultado.getString("imagen");
                float precio = resultado.getFloat("precio");
                Producto producto = new Producto(id,nombre, referencia, caracteristicas, efectosSecundarios, fecha,imagen, precio);
                productos.add(producto);        
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
               try {
                   BaseDatos.close(connection);
                   BaseDatos.close(sentencia);
                   BaseDatos.close(resultado);
               } catch (SQLException ex) {
                   Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
        return productos;
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
