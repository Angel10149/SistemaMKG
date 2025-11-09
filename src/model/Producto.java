package model;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Producto {
    private int idProducto;
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stockActual;
    private int stockMinimo;
    private int stockMaximo;
    private Categoria categoria;
    private CategoriaRotacion categoriaR;
    private Proveedor proveedor;
    private String ubicacion;
    
    
    
    
    private static ArrayList<Producto> listaProductos = new ArrayList<>();

    public Producto() {
    }

    public Producto(int idProducto, String codigo, String nombre, String descripcion, double precioCompra, double precioVenta, int stockActual, int stockMinimo, int stockMaximo, CategoriaRotacion categoria, LocalDateTime fechaRegistro) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;
        this.categoria = categoria;
        this.fechaRegistro = fechaRegistro;
    }

    public Producto(String codigo, String nombre, String descripcion, double precioCompra, double precioVenta, int stockActual, int stockMinimo, int stockMaximo, CategoriaRotacion categoria, LocalDateTime fechaRegistro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;
        this.categoria = categoria;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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

    public CategoriaRotacion getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaRotacion categoria) {
        this.categoria = categoria;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precioVenta=" + precioVenta +
                ", stockActual=" + stockActual +
                ", categoria=" + categoria +
                '}';
    }
    public void aumentarStock(int cantidad) {
        this.stockActual += cantidad;
        System.out.println("Stock aumentado. Nuevo stock: " + this.stockActual);
    }

    public void disminuirStock(int cantidad) {
        if (cantidad <= this.stockActual) {
            this.stockActual -= cantidad;
            System.out.println("Stock reducido. Nuevo stock: " + this.stockActual);
        } else {
            System.out.println("No hay suficiente stock disponible.");
        }
    }

    public boolean verificarStockMinimo() {
        return this.stockActual <= this.stockMinimo;
    }

    public String mostrarInfo() {
        return "Código: " + codigo + " | Nombre: " + nombre + 
               " | Stock: " + stockActual + " | Precio Venta: S/." + precioVenta;
    }
    public static void registrarProducto(Producto p) {
        listaProductos.add(p);
        System.out.println("Producto registrado correctamente: " + p.getNombre());
    }

    public static void listarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("No existen productos registrados.");
        } else {
            System.out.println("Lista de productos registrados:");
            for (Producto p : listaProductos) {
                System.out.println(p.mostrarInfo());
            }
        }
    }

    public static Producto buscarProductoPorCodigo(String codigo) {
        for (Producto p : listaProductos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    public static void eliminarProducto(String codigo) {
        Producto encontrado = buscarProductoPorCodigo(codigo);
        if (encontrado != null) {
            listaProductos.remove(encontrado);
            System.out.println("Producto eliminado correctamente: " + codigo);
        } else {
            System.out.println(" Producto no encontrado.");
        }
    }
    public void imprimirProducto() {
        System.out.println(this.toString());
    }
}
