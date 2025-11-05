
import java.time.LocalDateTime;


public class AlertaStock {
    private int idAlerta;
    private Producto producto;
    private String tipo;
    private LocalDateTime fechaGeneracion;

    public AlertaStock() {
    }

    public AlertaStock(int idAlerta, Producto producto, String tipo, LocalDateTime fechaGeneracion) {
        this.idAlerta = idAlerta;
        this.producto = producto;
        this.tipo = tipo;
        this.fechaGeneracion = fechaGeneracion;
    }

    public AlertaStock(Producto producto, String tipo, LocalDateTime fechaGeneracion) {
        this.producto = producto;
        this.tipo = tipo;
        this.fechaGeneracion = fechaGeneracion;
    }

    public int getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDateTime fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    @Override
    public String toString() {
        return "AlertaStock{" + "idAlerta=" + idAlerta + ", producto=" + producto + ", tipo=" + tipo + ", fechaGeneracion=" + fechaGeneracion + '}';
    }
    
}
