package model;

import java.util.ArrayList;

public class Compra {
    private String idCompra;
    private Proveedor proveedor;
    private String fecha;
    private ArrayList<DetalleCompra> detalles = new ArrayList<>();
    private double total;
    private String estado;

    public Compra() {
    }

    public Compra(String idCompra, Proveedor proveedor, String fecha, double total, String estado) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    public Compra(Proveedor proveedor, String fecha, double total, String estado) {
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<DetalleCompra> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetalleCompra> detalles) {
        this.detalles = detalles;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", proveedor=" + proveedor + ", fecha=" + fecha + ", total=" + total + ", estado=" + estado + '}';
    }
    public void agregarDetalle(DetalleCompra d) {
            detalles.add(d);
            total += d.Subtotal();
    }
}
