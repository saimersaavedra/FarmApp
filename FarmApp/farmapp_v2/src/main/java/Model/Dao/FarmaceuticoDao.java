package Model.Dao;

import Model.Entity.Farmaceutico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import red.BaseDatos;

public class FarmaceuticoDao implements IFarmaceutico {
        final static String SQL_BORRAR = "DELETE FROM Farmaceutico WHERE cedula = ?";
        final static String SQL_ACTUALIZAR = "UPDATE Farmaceutico SET  nombre = ?, apellido = ?, telefono = ?, correo = ?, direccion = ?, nivel =? WHERE cedula = ?";
        final static String SQL_CONSULTAR = "SELECT * FROM Farmaceutico";
        final static String SQL_CONSULTARID = "SELECT * FROM Farmaceutico WHERE cedula = ?";
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
           Connection connection = null;
           PreparedStatement sentencia = null;
           ResultSet resultado = null;
           List<Farmaceutico> farmaceuticos = new ArrayList();
        try {
            
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_CONSULTAR);
            resultado = sentencia.executeQuery();
            while(resultado.next())
            {
                String cedula = resultado.getString("cedula");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String telefono = resultado.getString("telefono");
                String correo = resultado.getString("correo");
                String direccion = resultado.getString("direccion");
                String nivel = resultado.getString("nivel");
                
                Farmaceutico farmaceutico = new Farmaceutico(cedula, nombre, apellido, telefono, correo, direccion, nivel);
                farmaceuticos.add(farmaceutico);
                        
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
               try {
                   BaseDatos.close(resultado);
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
           return farmaceuticos;
    }

    @Override
    public Farmaceutico consultarId(Farmaceutico farmaceutico) {
         Connection connection = null;
           PreparedStatement sentencia = null;
           ResultSet resultado = null;
           Farmaceutico rFarma = null;
        try {
            
                connection = BaseDatos.getConnection();
                sentencia = connection.prepareStatement(SQL_CONSULTARID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
                sentencia.setString(1, farmaceutico.getCedula());
                resultado = sentencia.executeQuery();
                resultado.absolute(1);
                
                String cedula = resultado.getString("cedula");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String telefono = resultado.getString("telefono");
                String correo = resultado.getString("correo");
                String direccion = resultado.getString("direccion");
                String nivel = resultado.getString("nivel");;
                 rFarma = new Farmaceutico(cedula, nombre, apellido, telefono, correo, direccion, nivel);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
               try {
                   BaseDatos.close(resultado);
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(FarmaceuticoDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
           return rFarma;
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
            sentencia = connection.prepareStatement(SQL_ACTUALIZAR);
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
