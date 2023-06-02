package Model.Entity;

import java.sql.Date;

public class Producto {
    private int id;
    private String nombre;
    private String referencia;
    private String caracteristicas;
    private String efectSecundarios;
    private String fecha;
    private String imagen;
    private float precio;
    private String nivelPrecio;
    private String calidad;

    public Producto(int id) {
        this.id = id;
    }

    public Producto(String referencia) {
        this.referencia = referencia;
    }

    public Producto() {
    }

    @Override
    public String toString() {
        return "Producto{" +", referencia=" + referencia +", id="+id+", precio="+precio+'}';
    }

    public Producto(int id, String nombre, String referencia, String caracteristicas, String efectSecundarios, String fecha, String imagen, float precio, String nivelPrecio, String calidad) {
        this.id = id;
        this.nombre = nombre;
        this.referencia = referencia;
        this.caracteristicas = caracteristicas;
        this.efectSecundarios = efectSecundarios;
        this.fecha = fecha;
        this.imagen = imagen;
        this.precio = precio;
        this.nivelPrecio = nivelPrecio;
        this.calidad = calidad;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the caracteristicas
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * @param caracteristicas the caracteristicas to set
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    /**
     * @return the efectSecundarios
     */
    public String getEfectSecundarios() {
        return efectSecundarios;
    }

    /**
     * @param efectSecundarios the efectSecundarios to set
     */
    public void setEfectSecundarios(String efectSecundarios) {
        this.efectSecundarios = efectSecundarios;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void setNivelPrecio(String nivelPrecio) {
        this.nivelPrecio = nivelPrecio;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getNivelPrecio() {
        return nivelPrecio;
    }

    public String getCalidad() {
        return calidad;
    }
    
}
