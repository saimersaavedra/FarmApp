package Model.Entity;

import java.sql.Date;
import java.util.List;

public class Pedido {
    private int id;
    private String direccion;
    private String cliente;
    private Date Fecha;
    private float total;
    private Farmaceutico farmaceutico;
    private Producto productos;
    private Producto producton;
 //f.nombre, f.apellido, pe.cliente, pe.total, pr.nombre, pr.referencia 
    
    public Pedido(int id,Farmaceutico farmaceutico, String cliente, float total, Producto producto, String direccion, Date fecha)
    {
        this.id = id;
        this.cliente = cliente;
        this.direccion = direccion;
        this.Fecha = fecha;
        this.total = total;
        this.farmaceutico = farmaceutico;
        this.productos = producto;
        this.producton = producton;
    }  

    public Pedido(int id, String direccion, String cliente, float total, Farmaceutico fasrmaceutico) {
        this.id = id;
        this.direccion = direccion;
        this.cliente = cliente;
        this.total = total;
        this.farmaceutico = farmaceutico;
    }
          
    public Pedido(int id, String direccion, String cliente, Date Fecha, float total, Farmaceutico farmaceutico) {
        this.id = id;
        this.direccion = direccion;
        this.cliente = cliente;
        this.Fecha = Fecha;
        this.total = total;
        this.farmaceutico = farmaceutico;
    }

    public Pedido(int id, String direccion, String cliente, Producto productos, Date Fecha, float total, Farmaceutico farmaceutico) {
        this.id = id;
        this.direccion = direccion;
        this.cliente = cliente;
        this.productos = productos;
        this.Fecha = Fecha;
        this.total = total;
        this.farmaceutico = farmaceutico;
    }
    public Pedido(int id, String direccion, String cliente, Date Fecha, float total) {
        this.id = id;
        this.direccion = direccion;
        this.cliente = cliente;
        this.Fecha = Fecha;
        this.total = total;
    }
    public Pedido(int id) {
        this.id = id;
    }

    public Pedido() {
    }

  
    /**
     * @return the pedido
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the pedido to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the farmaceutico
     */
    public Farmaceutico getFarmaceutico() {
        return farmaceutico;
    }

    /**
     * @param farmaceutico the farmaceutico to set
     */
    public void setFarmaceutico(Farmaceutico farmaceutico) {
        this.farmaceutico = farmaceutico;
    }
      public void setProductos(Producto productos) {
        this.productos = productos;
    }

    public Producto getProductos() {
        return productos;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", direccion=" + direccion + ", cliente=" + cliente + ", Fecha=" + Fecha + ", total=" + total + ", farmaceutico=" + farmaceutico + ", productos=" + productos + '}';
    }

    
}
