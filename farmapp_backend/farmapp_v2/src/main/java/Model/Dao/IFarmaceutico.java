package Model.Dao;

import Model.Entity.Farmaceutico;
import java.util.List;

public interface IFarmaceutico {
    public int Insertar(Farmaceutico farmaceutico);
    //existen dos tipos de consulta, toda la tabla, o uno especifica, utilizando la llave primaria
    public List<Farmaceutico> consultar(); // para toda la lista
    public Farmaceutico consultarId(Farmaceutico farmaceutico); // para un objecto especifico 
    public int borrar(Farmaceutico farmaceutico); 
    public int actualizar(Farmaceutico farmaceutico);
}
