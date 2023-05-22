package test;

import Model.Dao.FarmaceuticoDao;
import Model.Dao.PedidoDao;
import Model.Entity.Farmaceutico;
import Model.Entity.Pedido;

public class Test {
      public static void main(String[] args) {
     
      /*
          Test Farmaceutico
      FarmaceuticoDao farmaDao = new FarmaceuticoDao();
      Farmaceutico uno = new Farmaceutico("1111","Saimer","Saavedra","3115442","saimer@","Av 1","Jefe");
      //INSERTAR
          System.out.println("Resultado " + farmaDao.Insertar(uno));
      */
      
      PedidoDao pediDao = new PedidoDao();
      Pedido dos = new Pedido(1111, "Av 2", "Angel","2013-12-07",15000);
      //Insertar
          System.out.println("Resultado "+pediDao.Insertar(dos));
    }
}
