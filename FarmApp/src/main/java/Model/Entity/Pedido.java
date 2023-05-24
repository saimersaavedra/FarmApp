package Model.Entity;

import java.sql.Date;

public class Pedido {
    private int id;
    private String direccion;
    private String cliente;
    private String Fecha;
    private float total;
    private Farmaceutico farmaceutico;

    public Pedido(int id, String direccion, String cliente, String Fecha, float total, Farmaceutico farmaceutico) {
        this.id = id;
        this.direccion = direccion;
        this.cliente = cliente;
        this.Fecha = Fecha;
        this.total = total;
        this.farmaceutico = farmaceutico;
    }
    public Pedido(int id, String direccion, String cliente, String Fecha, float total) {
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
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
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
    
}
