package model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Venta {
    private int idVenta;
    private Usuario usuario;
    private LocalDateTime fechaVenta;
    private double total;
    private List<DetalleVenta> detalles;

    public Venta() {
    }

    public Venta(int idVenta, Usuario usuario, LocalDateTime fechaVenta, double total) {
        this.idVenta = idVenta;
        this.usuario = usuario;
        this.fechaVenta = fechaVenta;
        this.total = total;
        this.detalles= new ArrayList<>();
    }

    public Venta(Usuario usuario, LocalDateTime fechaVenta, double total) {
        this.usuario = usuario;
        this.fechaVenta = fechaVenta;
        this.total = total;
        this.detalles= new ArrayList<>();
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", usuario=" + usuario + ", fechaVenta=" + fechaVenta + ", total=" + total + ", detalles=" + detalles + '}';
    }
    
}
