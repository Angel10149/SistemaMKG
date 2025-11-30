package model;

import javax.swing.JOptionPane;

public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private Categoria categoria;
    private String marca;
    private double precioCompra;
    private double precioVenta;
    private double margenGanancia;
    private int stockActual;
    private int stockMinimo;
    private int stockMaximo;
    /*private CategoriaRotacion rotacion;
    private int ventasAcumuladas;
    private String ubicacion;
    private Proveedor proveedor;*/
    
    public Producto() {
    }

    public Producto(String codigo, String nombre, String descripcion, Categoria categoria, String marca, double precioCompra, double precioVenta, double margenGanancia, int stockActual, int stockMinimo, int stockMaximo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.marca = marca;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.margenGanancia = margenGanancia;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;
    }

    public Producto(String nombre, String descripcion, Categoria categoria, String marca, double precioCompra, double precioVenta, double margenGanancia, int stockActual, int stockMinimo, int stockMaximo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.marca = marca;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.margenGanancia = margenGanancia;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoria + ", marca=" + marca + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", margenGanancia=" + margenGanancia + ", stockActual=" + stockActual + ", stockMinimo=" + stockMinimo + ", stockMaximo=" + stockMaximo + '}';
    }
    public double calcularPrecioVenta() {
        if (margenGanancia >= 1) margenGanancia /= 100;
        return precioCompra / (1 - margenGanancia);
    }
    public void actualizarPrecioVenta() {
        this.precioVenta = calcularPrecioVenta();
    }
    public void aumentarStock(int cantidad) {
        this.stockActual += cantidad;
    }

    public void disminuirStock(int cantidad) {
        if (cantidad <= this.stockActual) {
            this.stockActual -= cantidad;
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficiente stock disponible.");
        }
    }
}
