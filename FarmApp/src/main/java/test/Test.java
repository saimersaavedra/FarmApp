package test;

import Model.Dao.FarmaceuticoDao;
import Model.Dao.PedidoDao;
import Model.Dao.ProductoDao;
import Model.Entity.Farmaceutico;
import Model.Entity.Pedido;
import Model.Entity.Producto;

public class Test {
      public static void main(String[] args) {
     
      /*
          Test Farmaceutico
      FarmaceuticoDao farmaDao = new FarmaceuticoDao();
      Farmaceutico uno = new Farmaceutico("1111","Saimer","Saavedra","3115442","saimer@","Av 1","Jefe");
      //INSERTAR
          System.out.println("Resultado " + farmaDao.Insertar(uno));
     */
        ProductoDao producDao = new ProductoDao();
        Producto tres = new Producto(2, "Atamen", "1 - fiebre", "cura dolor de cabeza", "malestar xd", "Ayer", "asodka", 500);
          System.out.println("Resultado eliminado: "+producDao.borrar(tres));
    }
}
