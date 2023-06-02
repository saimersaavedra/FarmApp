package Model.Dao;

import Model.Entity.Pedido;
import java.util.List;

public interface IPedido {
    public int Insertar(Pedido pedido);
    //existen dos tipos de consulta, toda la tabla, o uno especifica, utilizando la llave primaria
    public List<Pedido> consultar(); // para toda la lista
    public Pedido consultarId(Pedido pedido); // para un objecto especifico 
    public int borrar(Pedido pedido); 
    public int actualizar(Pedido pedido);
}
