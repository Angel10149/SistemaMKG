
package model;

import java.time.LocalDate;

public class GuiaRemision {
    private int idGuia;
    private String codigoGuia;
    private Venta venta;
    private String transportista;
    private String placaVehiculo;
    private String puntoPartida;
    private String puntoLlegada;
    private LocalDate fechaEmision;
    private LocalDate fechaTraslado;
    private String observaciones;

    public GuiaRemision() {
    }

    public GuiaRemision(int idGuia, String codigoGuia, Venta venta, String transportista, String placaVehiculo, String puntoPartida, String puntoLlegada, LocalDate fechaEmision, LocalDate fechaTraslado, String observaciones) {
        this.idGuia = idGuia;
        this.codigoGuia = codigoGuia;
        this.venta = venta;
        this.transportista = transportista;
        this.placaVehiculo = placaVehiculo;
        this.puntoPartida = puntoPartida;
        this.puntoLlegada = puntoLlegada;
        this.fechaEmision = fechaEmision;
        this.fechaTraslado = fechaTraslado;
        this.observaciones = observaciones;
    }

    public GuiaRemision(String codigoGuia, Venta venta, String transportista, String placaVehiculo, String puntoPartida, String puntoLlegada, LocalDate fechaEmision, LocalDate fechaTraslado, String observaciones) {
        this.codigoGuia = codigoGuia;
        this.venta = venta;
        this.transportista = transportista;
        this.placaVehiculo = placaVehiculo;
        this.puntoPartida = puntoPartida;
        this.puntoLlegada = puntoLlegada;
        this.fechaEmision = fechaEmision;
        this.fechaTraslado = fechaTraslado;
        this.observaciones = observaciones;
    }

    public int getIdGuia() {
        return idGuia;
    }

    public void setIdGuia(int idGuia) {
        this.idGuia = idGuia;
    }

    public String getCodigoGuia() {
        return codigoGuia;
    }

    public void setCodigoGuia(String codigoGuia) {
        this.codigoGuia = codigoGuia;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getPuntoPartida() {
        return puntoPartida;
    }

    public void setPuntoPartida(String puntoPartida) {
        this.puntoPartida = puntoPartida;
    }

    public String getPuntoLlegada() {
        return puntoLlegada;
    }

    public void setPuntoLlegada(String puntoLlegada) {
        this.puntoLlegada = puntoLlegada;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaTraslado() {
        return fechaTraslado;
    }

    public void setFechaTraslado(LocalDate fechaTraslado) {
        this.fechaTraslado = fechaTraslado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "GuiaRemision{" + "idGuia=" + idGuia + ", codigoGuia=" + codigoGuia + ", venta=" + venta + ", transportista=" + transportista + ", placaVehiculo=" + placaVehiculo + ", puntoPartida=" + puntoPartida + ", puntoLlegada=" + puntoLlegada + ", fechaEmision=" + fechaEmision + ", fechaTraslado=" + fechaTraslado + ", observaciones=" + observaciones + '}';
    }
    
}
