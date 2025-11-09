package model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Compra {
    private int idCompra;
    private Proveedor proveedor;
    private Usuario usuario;
    private LocalDateTime fechaCompra;
    private double total;
    private List<DetalleCompra> detalles;

    public Compra() {
    }

    public Compra(int idCompra, Proveedor proveedor, Usuario usuario, LocalDateTime fechaCompra, double total) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.usuario = usuario;
        this.fechaCompra = fechaCompra;
        this.total = total;
        this.detalles= new ArrayList<>();
    }

    public Compra(Proveedor proveedor, Usuario usuario, LocalDateTime fechaCompra, double total) {
        this.proveedor = proveedor;
        this.usuario = usuario;
        this.fechaCompra = fechaCompra;
        this.total = total;
        this.detalles= new ArrayList<>();
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<DetalleCompra> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleCompra> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", proveedor=" + proveedor + ", usuario=" + usuario + ", fechaCompra=" + fechaCompra + ", total=" + total + ", detalles=" + detalles + '}';
    }
    
}
