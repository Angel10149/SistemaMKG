
public class DetalleCompra {
    private int idDetalle;
    private OrdenCompra compra;
    private Producto producto;
    private int cantidadOrdenada;
    private int cantidadRecibida;
    private double precioCompra;
    private double subtotal;

    public DetalleCompra() {
    }

    public DetalleCompra(int idDetalle, OrdenCompra compra, Producto producto, int cantidadOrdenada, int cantidadRecibida, double precioCompra, double subtotal) {
        this.idDetalle = idDetalle;
        this.compra = compra;
        this.producto = producto;
        this.cantidadOrdenada = cantidadOrdenada;
        this.cantidadRecibida = cantidadRecibida;
        this.precioCompra = precioCompra;
        this.subtotal = subtotal;
    }

    public DetalleCompra(OrdenCompra compra, Producto producto, int cantidadOrdenada, int cantidadRecibida, double precioCompra, double subtotal) {
        this.compra = compra;
        this.producto = producto;
        this.cantidadOrdenada = cantidadOrdenada;
        this.cantidadRecibida = cantidadRecibida;
        this.precioCompra = precioCompra;
        this.subtotal = subtotal;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public OrdenCompra getCompra() {
        return compra;
    }

    public void setCompra(OrdenCompra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadOrdenada() {
        return cantidadOrdenada;
    }

    public void setCantidadOrdenada(int cantidadOrdenada) {
        this.cantidadOrdenada = cantidadOrdenada;
    }

    public int getCantidadRecibida() {
        return cantidadRecibida;
    }

    public void setCantidadRecibida(int cantidadRecibida) {
        this.cantidadRecibida = cantidadRecibida;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "DetalleCompra{" + "idDetalle=" + idDetalle + ", compra=" + compra + ", producto=" + producto + ", cantidadOrdenada=" + cantidadOrdenada + ", cantidadRecibida=" + cantidadRecibida + ", precioCompra=" + precioCompra + ", subtotal=" + subtotal + '}';
    }
    
}
