package Model.Dao;

import Model.Entity.Farmaceutico;
import Model.Entity.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import red.BaseDatos;

public class PedidoDao implements IPedido {
    final static String SQL_BORRAR = "DELETE FROM pedido WHERE id_pedido = ?";
    final static String SQL_ACTUALIZAR = "UPDATE producto SET direccion = ?, cliente = ?, fechaPedido = ?, total = ?, id_farmaceutico = ? WHERE id_pedido = ?";
    final static String SQL_CONSULTAR = "SELECT * FROM pedido";
    final static String SQL_CONSULTARID = "SELECT * FROM pedido WHERE id_pedido = ?";
    final static String SQL_INSERTAR = "INSERT INTO pedido(id_pedido, direccion, cliente, fechaPedido, total, id_farmaceutico) VALUES(?,?,?,?,?,?)";
    //int id, String direccion, String cliente, Date Fecha, float total
    @Override
    public int Insertar(Pedido pedi) {
         Connection connection = null;
         PreparedStatement sentencia = null;
            int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_INSERTAR);
            sentencia.setInt(1, pedi.getId());
            sentencia.setString(2, pedi.getDireccion());
            sentencia.setString(3, pedi.getCliente());
            sentencia.setString(4, pedi.getFecha());
            sentencia.setFloat(5,pedi.getTotal());
            sentencia.setString(6, pedi.getFarmaceutico().getCedula());
            resultado = sentencia.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally
        {
               try {
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
        return resultado;    
    }

    @Override
    public List<Pedido> consultar() {
           Connection connection = null;
           PreparedStatement sentencia = null;
           ResultSet resultado = null;
           List<Pedido> pedidos = new ArrayList();
        try {
            
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_CONSULTAR);
            resultado = sentencia.executeQuery();
            while(resultado.next())
            {
                Farmaceutico ped = new Farmaceutico();
                int id = resultado.getInt("id_pedido");
                String direccion = resultado.getString("direccion");
                String cliente = resultado.getString("cliente");
                String fecha = resultado.getString("fechaPedido");
                float total = resultado.getFloat("total");
                ped.setCedula(resultado.getString("id_farmaceutico"));
                Pedido pedido = new Pedido(id, direccion, cliente, fecha, total, ped);
              //Pedido pedido = new Pedido(id, direccion, cliente, fecha, total);
              pedidos.add(pedido);
                      
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
               try {
                   BaseDatos.close(resultado);
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
           return pedidos;
    }

    @Override
    public Pedido consultarId(Pedido pedido) {
 Connection connection = null;
           PreparedStatement sentencia = null;
           ResultSet resultado = null;
           Pedido rPed = null;
        try {
            
                connection = BaseDatos.getConnection();
                sentencia = connection.prepareStatement(SQL_CONSULTARID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
                sentencia.setInt(1, pedido.getId());
                resultado = sentencia.executeQuery();
                resultado.absolute(1);
                
                 Farmaceutico ped = new Farmaceutico();
                int id = resultado.getInt("id_pedido");
                String direccion = resultado.getString("direccion");
                String cliente = resultado.getString("cliente");
                String fecha = resultado.getString("fechaPedido");
                float total = resultado.getFloat("total");
                ped.setCedula(resultado.getString("id_farmaceutico"));
                rPed = new Pedido(id, direccion, cliente, fecha, total, ped);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
               try {
                   BaseDatos.close(resultado);
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
           return rPed;
    }

    @Override
    public int borrar(Pedido pedido) {
  Connection connection = null;
        PreparedStatement sentencia = null;
        int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_BORRAR);

            sentencia.setInt(1, pedido.getId());
            resultado = sentencia.executeUpdate();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        finally
        {
               try {
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
        
        return resultado;
    }

    @Override
    public int actualizar(Pedido pedi) {
            Connection connection = null;
            PreparedStatement sentencia = null;
            int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_ACTUALIZAR);
  
            sentencia.setString(1, pedi.getDireccion());
            sentencia.setString(2, pedi.getCliente());
            sentencia.setString(3, pedi.getFecha());
            sentencia.setFloat(4,pedi.getTotal());
            sentencia.setInt(5,pedi.getId());
            sentencia.setString(6,pedi.getFarmaceutico().getCedula());
            resultado = sentencia.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally
        {
               try {
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
        return resultado;
    }

}
