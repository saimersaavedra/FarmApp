package Model.Dao;

import Model.Entity.Producto;
import java.util.List;

public interface IProducto {
    public int Insertar(Producto producto);
    //existen dos tipos de consulta, toda la tabla, o uno especifica, utilizando la llave primaria
    public List<Producto> consultar(); // para toda la lista
    public Producto consultarId(Producto producto); // para un objecto especifico 
    public List<Producto> buscarRef(String columna,String referencia); //para buscar por referencia
    public int borrar(Producto producto); 
    public int actualizar(Producto producto);
}
