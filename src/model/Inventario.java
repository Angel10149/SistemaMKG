
package model;

import java.util.Date;

public class Inventario {
    private int idInventario;
    private Producto producto;
    private int cantidadInicial;
    private int cantidadActual;
    private int cantidadEntradas;
    private int cantidadSalidas;
    private Date fechaActualizacion;
    private String estado;

    public Inventario() {
    }

    public Inventario(int idInventario, Producto producto, int cantidadInicial, int cantidadActual, int cantidadEntradas, int cantidadSalidas, Date fechaActualizacion, String estado) {
        this.idInventario = idInventario;
        this.producto = producto;
        this.cantidadInicial = cantidadInicial;
        this.cantidadActual = cantidadActual;
        this.cantidadEntradas = cantidadEntradas;
        this.cantidadSalidas = cantidadSalidas;
        this.fechaActualizacion = fechaActualizacion;
        this.estado = estado;
    }

    public Inventario(Producto producto, int cantidadInicial, int cantidadActual, int cantidadEntradas, int cantidadSalidas, Date fechaActualizacion, String estado) {
        this.producto = producto;
        this.cantidadInicial = cantidadInicial;
        this.cantidadActual = cantidadActual;
        this.cantidadEntradas = cantidadEntradas;
        this.cantidadSalidas = cantidadSalidas;
        this.fechaActualizacion = fechaActualizacion;
        this.estado = estado;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadInicial() {
        return cantidadInicial;
    }

    public void setCantidadInicial(int cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCantidadEntradas() {
        return cantidadEntradas;
    }

    public void setCantidadEntradas(int cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }

    public int getCantidadSalidas() {
        return cantidadSalidas;
    }

    public void setCantidadSalidas(int cantidadSalidas) {
        this.cantidadSalidas = cantidadSalidas;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Inventario{" + "idInventario=" + idInventario + ", producto=" + producto + ", cantidadInicial=" + cantidadInicial + ", cantidadActual=" + cantidadActual + ", cantidadEntradas=" + cantidadEntradas + ", cantidadSalidas=" + cantidadSalidas + ", fechaActualizacion=" + fechaActualizacion + ", estado=" + estado + '}';
    }
    
}
