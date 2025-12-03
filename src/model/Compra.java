package model;

import java.util.ArrayList;
import java.util.Date;

public class Compra {
    private int idCompra;
    private Date fecha;
    private double total;
    private String estado;
    private Proveedor proveedor;
    private String tipoComprobante;
    private String serie;
    private String numero;
    private ArrayList<DetalleCompra> detalles;

    public Compra() {
        detalles = new ArrayList<>();
    }

    public Compra(int idCompra, Date fecha, double total, String estado, Proveedor proveedor,
                  String tipoComprobante, String serie, String numero) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
        this.proveedor = proveedor;
        this.tipoComprobante = tipoComprobante;
        this.serie = serie;
        this.numero = numero;
        detalles = new ArrayList<>();
    }

    // GETTERS Y SETTERS
    public int getIdCompra() { return idCompra; }
    public void setIdCompra(int idCompra) { this.idCompra = idCompra; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Proveedor getProveedor() { return proveedor; }
    public void setProveedor(Proveedor proveedor) { this.proveedor = proveedor; }

    public String getTipoComprobante() { return tipoComprobante; }
    public void setTipoComprobante(String tipoComprobante) { this.tipoComprobante = tipoComprobante; }

    public String getSerie() { return serie; }
    public void setSerie(String serie) { this.serie = serie; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public ArrayList<DetalleCompra> getDetalles() { return detalles; }
    public void addDetalle(DetalleCompra d) { detalles.add(d); }
}

