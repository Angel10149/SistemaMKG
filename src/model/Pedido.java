package model;
import java.time.LocalDateTime;
import java.util.List;


public class Pedido {
    private String codigoSeguimiento;
    private Cliente cliente;
    private List<DetallePedido> detalles;
    private String destino;
    private String estado;
    private LocalDateTime fechaRegistro;
    private LocalDateTime fechaEntrega;

    public Pedido() {
    }

    public Pedido(String codigoSeguimiento, Cliente cliente, List<DetallePedido> detalles, String destino, String estado, LocalDateTime fechaRegistro, LocalDateTime fechaEntrega) {
        this.codigoSeguimiento = codigoSeguimiento;
        this.cliente = cliente;
        this.detalles = detalles;
        this.destino = destino;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
        this.fechaEntrega = fechaEntrega;
    }

    public Pedido(Cliente cliente, List<DetallePedido> detalles, String destino, String estado, LocalDateTime fechaRegistro, LocalDateTime fechaEntrega) {
        this.cliente = cliente;
        this.detalles = detalles;
        this.destino = destino;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
        this.fechaEntrega = fechaEntrega;
    }

    public String getCodigoSeguimiento() {
        return codigoSeguimiento;
    }

    public void setCodigoSeguimiento(String codigoSeguimiento) {
        this.codigoSeguimiento = codigoSeguimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDateTime fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigoSeguimiento=" + codigoSeguimiento + ", cliente=" + cliente + ", detalles=" + detalles + ", destino=" + destino + ", estado=" + estado + ", fechaRegistro=" + fechaRegistro + ", fechaEntrega=" + fechaEntrega + '}';
    }
    
}
