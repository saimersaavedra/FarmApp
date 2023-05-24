package test;

import Model.Dao.FarmaceuticoDao;
import Model.Dao.PedidoDao;
import Model.Dao.ProductoDao;
import Model.Entity.Farmaceutico;
import Model.Entity.Pedido;
import Model.Entity.Producto;
import java.util.ArrayList;
import java.util.List;

public class Test {
      public static void main(String[] args) {
     /* TEST */
        ProductoDao producDao = new ProductoDao();
        Producto producto = new Producto(2);
          System.out.println( producDao.consultarId(producto));
        
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
        List<Producto> productos = new ArrayList();
       // CONSULTAR
        productos = producDao.consultar();
        for (Producto produc : productos) {
            System.out.println(produc.getNombre());
        }
        ProductoDao producDao = new ProductoDao();
        List<Producto> productos = new ArrayList();
       // CONSULTAR_REFERENCIA
        productos = producDao.buscarRef("fecha_vencimiento","ayer");
        for (Producto produc : productos) {
            System.out.println(produc.toString());
        }
      */
       /*
          Test Pedido
        Pedido dos = new Pedido(1,"av 2", "saimer","hoy",25,uno);
        PedidoDao pedidoDao = new PedidoDao();

        INSERTAR
        pedidoDao.Insertar(dos);
         List<Pedido> pedidos = new ArrayList();
        // CONSULTAR
        pedidos = pedidoDao.consultar();
        for (Pedido pedid : pedidos) {
            System.out.println(pedid.getFarmaceutico().getCedula());
        }
      
      */ 
    }
}
