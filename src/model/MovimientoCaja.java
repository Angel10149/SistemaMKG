package model;

public class MovimientoCaja {
    private int idMovimiento;
    private String tipo;
    private String descripcion;
    private double monto;
    private String fecha;

    public MovimientoCaja() {
    }

    public MovimientoCaja(int idMovimiento, String tipo, String descripcion, double monto, String fecha) {
        this.idMovimiento = idMovimiento;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
    }

    public MovimientoCaja(String tipo, String descripcion, double monto, String fecha) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
    }
    

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "MovimientoCaja{" + "idMovimiento=" + idMovimiento + ", tipo=" + tipo + ", descripcion=" + descripcion + ", monto=" + monto + ", fecha=" + fecha + '}';
    }
    
}
