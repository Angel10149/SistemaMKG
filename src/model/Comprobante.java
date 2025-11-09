package model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Comprobante {
    private int idComprobante;
    private Venta venta;
    private String codigo;
    private LocalDateTime fechaHora;
    private Usuario vendedor;
    private List<DetalleVenta> productos;
    private double total;
    private String estado;
    private LocalDateTime expiracion;

    public Comprobante() {
    }

    public Comprobante(int idComprobante, Venta venta, String codigo, LocalDateTime fechaHora, Usuario vendedor, double total, String estado, LocalDateTime expiracion) {
        this.idComprobante = idComprobante;
        this.venta = venta;
        this.codigo = codigo;
        this.fechaHora = fechaHora;
        this.vendedor = vendedor;
        this.total = total;
        this.estado = estado;
        this.expiracion = expiracion;
        this.productos = new ArrayList<>();
    }

    public Comprobante(Venta venta, String codigo, LocalDateTime fechaHora, Usuario vendedor, double total, String estado, LocalDateTime expiracion) {
        this.venta = venta;
        this.codigo = codigo;
        this.fechaHora = fechaHora;
        this.vendedor = vendedor;
        this.total = total;
        this.estado = estado;
        this.expiracion = expiracion;
        this.productos = new ArrayList<>();
    }

    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public List<DetalleVenta> getProductos() {
        return productos;
    }

    public void setProductos(List<DetalleVenta> productos) {
        this.productos = productos;
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

    public LocalDateTime getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(LocalDateTime expiracion) {
        this.expiracion = expiracion;
    }

    @Override
    public String toString() {
        return "Comprobante{" + "idComprobante=" + idComprobante + ", venta=" + venta + ", codigo=" + codigo + ", fechaHora=" + fechaHora + ", vendedor=" + vendedor + ", productos=" + productos + ", total=" + total + ", estado=" + estado + ", expiracion=" + expiracion + '}';
    }
    
}
