
import java.time.LocalDateTime;


public class Caja {
    private int idCaja;
    private Usuario cajero;
    private double montoInicial;
    private double montoIngresosEfectivo;
    private double montoIngresosTarjeta;
    private double montoFinalContado;
    private String estado;
    private LocalDateTime fechaApertura;
    private LocalDateTime fechaCierre;

    public Caja() {
    }

    public Caja(int idCaja, Usuario cajero, double montoInicial, double montoIngresosEfectivo, double montoIngresosTarjeta, double montoFinalContado, String estado, LocalDateTime fechaApertura, LocalDateTime fechaCierre) {
        this.idCaja = idCaja;
        this.cajero = cajero;
        this.montoInicial = montoInicial;
        this.montoIngresosEfectivo = montoIngresosEfectivo;
        this.montoIngresosTarjeta = montoIngresosTarjeta;
        this.montoFinalContado = montoFinalContado;
        this.estado = estado;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
    }

    public Caja(Usuario cajero, double montoInicial, double montoIngresosEfectivo, double montoIngresosTarjeta, double montoFinalContado, String estado, LocalDateTime fechaApertura, LocalDateTime fechaCierre) {
        this.cajero = cajero;
        this.montoInicial = montoInicial;
        this.montoIngresosEfectivo = montoIngresosEfectivo;
        this.montoIngresosTarjeta = montoIngresosTarjeta;
        this.montoFinalContado = montoFinalContado;
        this.estado = estado;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
    }

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public Usuario getCajero() {
        return cajero;
    }

    public void setCajero(Usuario cajero) {
        this.cajero = cajero;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public double getMontoIngresosEfectivo() {
        return montoIngresosEfectivo;
    }

    public void setMontoIngresosEfectivo(double montoIngresosEfectivo) {
        this.montoIngresosEfectivo = montoIngresosEfectivo;
    }

    public double getMontoIngresosTarjeta() {
        return montoIngresosTarjeta;
    }

    public void setMontoIngresosTarjeta(double montoIngresosTarjeta) {
        this.montoIngresosTarjeta = montoIngresosTarjeta;
    }

    public double getMontoFinalContado() {
        return montoFinalContado;
    }

    public void setMontoFinalContado(double montoFinalContado) {
        this.montoFinalContado = montoFinalContado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDateTime fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public LocalDateTime getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDateTime fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    @Override
    public String toString() {
        return "Caja{" + "idCaja=" + idCaja + ", cajero=" + cajero + ", montoInicial=" + montoInicial + ", montoIngresosEfectivo=" + montoIngresosEfectivo + ", montoIngresosTarjeta=" + montoIngresosTarjeta + ", montoFinalContado=" + montoFinalContado + ", estado=" + estado + ", fechaApertura=" + fechaApertura + ", fechaCierre=" + fechaCierre + '}';
    }
    
}
