package model;
public class DetalleCompra {
    private int idDetalle;
    private Producto producto;
    private int cantidad;
    private double precioUnitario;

    public DetalleCompra() {
    }

    public DetalleCompra(int idDetalle, Producto producto, int cantidad, double precioUnitario) {
        this.idDetalle = idDetalle;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public DetalleCompra(Producto producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "DetalleCompra{" + "idDetalle=" + idDetalle + ", producto=" + producto + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + '}';
    }
    
    public double Subtotal() {
        return cantidad * precioUnitario;
    }

}
