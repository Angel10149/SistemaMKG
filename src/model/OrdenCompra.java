package model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class OrdenCompra {
    private String codigo;
    private Proveedor proveedor;
    private LocalDate fecha;
    private List<DetalleCompra> productos;
    private String estado;
    private double total;

    public OrdenCompra() {
    }
    
    public OrdenCompra(String codigo, Proveedor proveedor, LocalDate fecha, String estado, double total) {
        this.codigo = codigo;
        this.proveedor = proveedor;
        this.productos = new ArrayList<>();
        this.fecha = fecha;
        this.estado = estado;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<DetalleCompra> getProductos() {
        return productos;
    }

    public void setProductos(List<DetalleCompra> productos) {
        this.productos = productos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrdenCompra{" + "codigo=" + codigo + ", proveedor=" + proveedor + ", fecha=" + fecha + ", productos=" + productos + ", estado=" + estado + ", total=" + total + '}';
    }
    
    
}
