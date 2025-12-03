package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Venta {
    private int idVenta;
    private int idUsuario;
    private String tipoDocumento;
    private String numeroDocumento;
    private String documentoCliente;
    private String nombreCliente;
    private double montoPago;
    private double montoCambio;
    private double montoTotal;
    private java.util.Date fechaRegistro;
    
    public Venta() {
    }

    public Venta(int idVenta, int idUsuario, String tipoDocumento, String numeroDocumento, String documentoCliente, String nombreCliente, double montoPago, double montoCambio, double montoTotal, Date fechaRegistro) {
        this.idVenta = idVenta;
        this.idUsuario = idUsuario;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.documentoCliente = documentoCliente;
        this.nombreCliente = nombreCliente;
        this.montoPago = montoPago;
        this.montoCambio = montoCambio;
        this.montoTotal = montoTotal;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }

    public double getMontoCambio() {
        return montoCambio;
    }

    public void setMontoCambio(double montoCambio) {
        this.montoCambio = montoCambio;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", idUsuario=" + idUsuario + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", documentoCliente=" + documentoCliente + ", nombreCliente=" + nombreCliente + ", montoPago=" + montoPago + ", montoCambio=" + montoCambio + ", montoTotal=" + montoTotal + ", fechaRegistro=" + fechaRegistro + '}';
    }

  

    public void calcularTotal() {
        /*total = 0;
        for (DetalleVenta d : detalles)
            total += d.getSubtotal();*/
    }
}
