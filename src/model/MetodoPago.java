package model;
public class MetodoPago {
    private int idMetodo;
    private String tipo;
    private double montoRecibido;
    private String nroOperacion;
    private String detalles;

    public MetodoPago() {
    }

    public MetodoPago(int idMetodo, String tipo, double montoRecibido, String nroOperacion, String detalles) {
        this.idMetodo = idMetodo;
        this.tipo = tipo;
        this.montoRecibido = montoRecibido;
        this.nroOperacion = nroOperacion;
        this.detalles = detalles;
    }

    public MetodoPago(String tipo, double montoRecibido, String nroOperacion, String detalles) {
        this.tipo = tipo;
        this.montoRecibido = montoRecibido;
        this.nroOperacion = nroOperacion;
        this.detalles = detalles;
    }

    public int getIdMetodo() {
        return idMetodo;
    }

    public void setIdMetodo(int idMetodo) {
        this.idMetodo = idMetodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMontoRecibido() {
        return montoRecibido;
    }

    public void setMontoRecibido(double montoRecibido) {
        this.montoRecibido = montoRecibido;
    }

    public String getNroOperacion() {
        return nroOperacion;
    }

    public void setNroOperacion(String nroOperacion) {
        this.nroOperacion = nroOperacion;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "MetodoPago{" + "idMetodo=" + idMetodo + ", tipo=" + tipo + ", montoRecibido=" + montoRecibido + ", nroOperacion=" + nroOperacion + ", detalles=" + detalles + '}';
    }
    
}
