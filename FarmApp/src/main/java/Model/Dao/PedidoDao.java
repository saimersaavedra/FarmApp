package Model.Dao;

import Model.Entity.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import red.BaseDatos;

public class PedidoDao implements IPedido {
    final static String SQL_INSERTAR = "INSERT INTO pedido(id_pedido, direccion, cliente, fechaPedido, total) VALUES(?,?,?,?,?)";
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pedido consultarId(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int borrar(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int actualizar(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
