package model;
import java.util.List;


public class OrdenCompra {
    private int idOrden;
    private Proveedor proveedor;
    private String fecha;
    private List<DetalleCompra> detalles;
    private String estado;

    public OrdenCompra() {
    }
    
}
