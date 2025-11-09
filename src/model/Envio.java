package model;
import java.time.LocalDate;
import java.time.LocalTime;


public class Envio {
    private int idEnvio;
    private Pedido pedido;
    private String transportista;
    private String guiaTransporte;
    private LocalDate fechaSalida;
    private LocalTime horaSalida;
    private LocalDate fechaEntregaEstimada;
    private String estado;

    public Envio() {
    }

    public Envio(int idEnvio, Pedido pedido, String transportista, String guiaTransporte, LocalDate fechaSalida, LocalTime horaSalida, LocalDate fechaEntregaEstimada, String estado) {
        this.idEnvio = idEnvio;
        this.pedido = pedido;
        this.transportista = transportista;
        this.guiaTransporte = guiaTransporte;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.fechaEntregaEstimada = fechaEntregaEstimada;
        this.estado = estado;
    }

    public Envio(Pedido pedido, String transportista, String guiaTransporte, LocalDate fechaSalida, LocalTime horaSalida, LocalDate fechaEntregaEstimada, String estado) {
        this.pedido = pedido;
        this.transportista = transportista;
        this.guiaTransporte = guiaTransporte;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.fechaEntregaEstimada = fechaEntregaEstimada;
        this.estado = estado;
    }

    public int getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }

    public String getGuiaTransporte() {
        return guiaTransporte;
    }

    public void setGuiaTransporte(String guiaTransporte) {
        this.guiaTransporte = guiaTransporte;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalDate getFechaEntregaEstimada() {
        return fechaEntregaEstimada;
    }

    public void setFechaEntregaEstimada(LocalDate fechaEntregaEstimada) {
        this.fechaEntregaEstimada = fechaEntregaEstimada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Envio{" + "idEnvio=" + idEnvio + ", pedido=" + pedido + ", transportista=" + transportista + ", guiaTransporte=" + guiaTransporte + ", fechaSalida=" + fechaSalida + ", horaSalida=" + horaSalida + ", fechaEntregaEstimada=" + fechaEntregaEstimada + ", estado=" + estado + '}';
    }
    
}
