package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venta {
    private int idVenta;
    private String fecha;
    private Cliente cliente;
    private Usuario vendedor;
    private ArrayList<DetalleVenta> detalles;
    private double total;
    private LocalDateTime fechaHora;
    private String estado;
    
    public Venta() {
    }

    public Venta(int idVenta, String fecha, Cliente cliente, Usuario vendedor, ArrayList<DetalleVenta> detalles, double total, LocalDateTime fechaHora, String estado) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.detalles = detalles;
        this.total = total;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public Venta(String fecha, Cliente cliente, Usuario vendedor, ArrayList<DetalleVenta> detalles, double total, LocalDateTime fechaHora, String estado) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.detalles = detalles;
        this.total = total;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetalleVenta> detalles) {
        this.detalles = detalles;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", fecha=" + fecha + ", cliente=" + cliente + ", vendedor=" + vendedor + ", total=" + total + ", fechaHora=" + fechaHora + ", estado=" + estado + '}';
    }
    public void agregarDetalle(DetalleVenta detalle) {
        detalles.add(detalle);
        calcularTotal();
    }

    public void eliminarDetalle(Producto producto) {
        detalles.removeIf(d -> d.getProducto().equals(producto));
        calcularTotal();
    }

    public void calcularTotal() {
        total = 0;
        for (DetalleVenta d : detalles)
            total += d.getSubtotal();
    }
}
