package Model.Dao;

import Model.Entity.Farmaceutico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import red.BaseDatos;

public class FarmaceuticoDao implements IFarmaceutico {
        final static String SQL_BORRAR = "DELETE FROM Farmaceutico WHERE id = ?";
        final static String SQL_ACTUALIZAR = "UPDATE producto SET  nombre = ?, apellido = ?, telefono = ?, correo = ?, direccion = ?, nivel =? WHERE cedula = ?";
        final static String SQL_CONSULTAR = "SELECT * FROM pedido";
        final static String SQL_INSERTAR = "INSERT INTO Farmaceutico(cedula,nombre,apellido,telefono,correo,direccion,nivel) VALUES(?,?,?,?,?,?,?)";
 //String cedula, String nombre, String apellido, String telefono, String correo, String direccion, String nivel
    @Override
    public int Insertar(Farmaceutico farma) {
            Connection connection = null;
            PreparedStatement sentencia = null;
            int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_INSERTAR);
            sentencia.setString(1, farma.getCedula());
            sentencia.setString(2, farma.getNombre());
            sentencia.setString(3, farma.getApellido());
            sentencia.setString(4, farma.getTelefono());
            sentencia.setString(5,farma.getCorreo());
            sentencia.setString(6, farma.getDireccion());
            sentencia.setString(7, farma.getNivel());
            resultado = sentencia.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally
        {
               try {
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
        return resultado;    
    }

    @Override
    public List<Farmaceutico> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Farmaceutico consultarId(Farmaceutico farmaceutico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int borrar(Farmaceutico farmaceutico) {
  Connection connection = null;
        PreparedStatement sentencia = null;
        int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_BORRAR);

            sentencia.setString(1, farmaceutico.getCedula());
            resultado = sentencia.executeUpdate();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        finally
        {
               try {
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
        
        return resultado;
    }

    @Override
    public int actualizar(Farmaceutico farma) {
Connection connection = null;
            PreparedStatement sentencia = null;
            int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia.setString(1, farma.getNombre());
            sentencia.setString(2, farma.getApellido());
            sentencia.setString(3, farma.getTelefono());
            sentencia.setString(4,farma.getCorreo());
            sentencia.setString(5, farma.getDireccion());
            sentencia.setString(6, farma.getNivel());
            sentencia.setString(7, farma.getCedula());
            resultado = sentencia.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally
        {
               try {
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
        return resultado;
    }

}
