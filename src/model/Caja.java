package model;
import java.util.ArrayList;

public class Caja {
    private int idCaja;
    private String fechaApertura;
    private String fechaCierre;
    private double montoInicial;
    private double montoFinal;
    private String estado; // "ABIERTA", "CERRADA"
    private Usuario usuario; // Cajero que abrió la caja
    private ArrayList<MovimientoCaja> movimientos;
    
    public Caja() {
    }

    public Caja(int idCaja, String fechaApertura, String fechaCierre, double montoInicial, double montoFinal, String estado, Usuario usuario) {
        this.idCaja = idCaja;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.montoInicial = montoInicial;
        this.montoFinal = montoFinal;
        this.estado = estado;
        this.usuario = usuario;
        this.movimientos= new ArrayList<>();
    }

    public Caja(String fechaApertura, String fechaCierre, double montoInicial, double montoFinal, String estado, Usuario usuario) {
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.montoInicial = montoInicial;
        this.montoFinal = montoFinal;
        this.estado = estado;
        this.usuario = usuario;
        this.movimientos= new ArrayList<>();
    }

    public Caja(int idCaja, String fechaApertura, double montoInicial, Usuario usuario) {
        this.idCaja = idCaja;
        this.fechaApertura = fechaApertura;
        this.montoInicial = montoInicial;
        this.usuario = usuario;
    }
    

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<MovimientoCaja> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<MovimientoCaja> movimientos) {
        this.movimientos = movimientos;
    }
    
    
    @Override
    public String toString() {
        return "Caja{" + "idCaja=" + idCaja + ", fechaApertura=" + fechaApertura + ", fechaCierre=" + fechaCierre + ", montoInicial=" + montoInicial + ", montoFinal=" + montoFinal + ", estado=" + estado + ", usuario=" + usuario + '}';
    }
    public void agregarMovimiento(MovimientoCaja m) {
        movimientos.add(m);
    }

    public double calcularSaldoActual() {
        double total = montoInicial;
        for (MovimientoCaja m : movimientos) {
            if (m.getTipo().equals("INGRESO"))
                total += m.getMonto();
            else
                total -= m.getMonto();
        }
        return total;
    }
}
