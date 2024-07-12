package test;

import Model.Dao.FarmaceuticoDao;
import Model.Dao.PedidoDao;
import Model.Dao.ProductoDao;
import Model.Entity.Farmaceutico;
import Model.Entity.Pedido;
import Model.Entity.Producto;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Test {
      public static void main(String[] args) {
     /* TEST */
        //int id, String direccion, String cliente, float total, Farmaceutico farmaceutico
                List<Producto> productos = new ArrayList();
        ProductoDao producDao = new ProductoDao();

        productos = producDao.filtro("nombre","omega");
        for (Producto produc : productos) {
            System.out.println(produc.getNombre());
        }
       // Pedido n = new Pedido(128);
         // System.out.println("Resultado :"+pedidoDao.consultarId(n));
      /*
          Test Farmaceutico
        Farmaceutico uno = new Farmaceutico("1111","Saimer","Saavedra","3115442","saimer@","Av 1","Jefe");
        FarmaceuticoDao farmaDao = new FarmaceuticoDao();
        INSERTAR
        System.out.println("Resultado " + farmaDao.Insertar(uno));
        List<Farmaceutico> farmaceuticos = new ArrayList();
       // CONSULTAR
        farmaceuticos = farmaDao.consultar();
        for (Farmaceutico farma : farmaceuticos) {
            System.out.println(farma.getNombre());
        }
       
     */
      /*
          Test Producto

        INSERTAR
        System.out.println("Resultado: "+producDao.Insertar(tres));
       // CONSULTAR
        
        ProductoDao producDao = new ProductoDao();
        List<Producto> productos = new ArrayList();
       // CONSULTAR_REFERENCIA
        productos = producDao.buscarRef("fecha_vencimiento","ayer");
        for (Producto produc : productos) {
            System.out.println(produc.toString());
        }
        List<Producto> productos = new ArrayList();
       // CONSULTAR_REFERENCIA
        productos = producDao.filtro("nombre","ja");
        for (Producto produc : productos) {
            System.out.println(produc.toString());
        }
      */
       /*
          Test Pedido
      PedidoDao pedidoDao = new PedidoDao();
        List<Pedido> pedidos = pedidoDao.consultar();
        for (Pedido pedid : pedidos) {
            System.out.println(pedid.toString());
        }
      
      
      */ 
    }
}
