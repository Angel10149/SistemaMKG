package model;

import java.util.List;

public class Venta {
    private int idVenta;
    private String fecha;
    private Cliente cliente;
    private Usuario vendedor;
    private List<DetalleVenta> detalles;
    private double total;
    private String estado;
    
    public Venta() {
    }
}
