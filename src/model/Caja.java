package model;
import java.time.LocalDateTime;
import java.util.List;


public class Caja {
    private int idCaja;
    private Usuario cajero;
    private double montoInicial;
    private double montoIngresosEfectivo;
    private double montoIngresosTarjeta;
    private double montoFinalContado;
    private LocalDateTime fechaApertura;
    private LocalDateTime fechaCierre;
    private List<Pago> pagos;
    
    public Caja() {
    }

}
