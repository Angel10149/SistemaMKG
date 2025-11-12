package controller;

import java.util.ArrayList;
import model.Caja;
import model.MovimientoCaja;
import model.Usuario;

public class ControllerCaja {
    private ArrayList<Caja> listaCajas = new ArrayList<>();

    public void abrirCaja(int idCaja, String fecha, double montoInicial, Usuario usuario) {
        Caja nueva = new Caja(idCaja, fecha, montoInicial, usuario);
        listaCajas.add(nueva);
    }

    public Caja obtenerCajaAbierta() {
        for (Caja c : listaCajas)
            if (c.getEstado().equals("ABIERTA"))
                return c;
        return null;
    }

    public void registrarMovimiento(String tipo, String descripcion, double monto, String fecha) {
        Caja cajaActiva = obtenerCajaAbierta();
        if (cajaActiva != null) {
            MovimientoCaja m = new MovimientoCaja(cajaActiva.getMovimientos().size() + 1,
                                      tipo, descripcion, monto, fecha);
            cajaActiva.agregarMovimiento(m);
        }
    }

    public boolean cerrarCaja(int idCaja, String fechaCierre) {
        Caja c = buscarCaja(idCaja);
        if (c != null && c.getEstado().equals("ABIERTA")) {
            c.setFechaCierre(fechaCierre);
            c.setMontoFinal(c.calcularSaldoActual());
            c.setEstado("CERRADA");
            return true;
        }
        return false;
    }

    public Caja buscarCaja(int idCaja) {
        for (Caja c : listaCajas)
            if (c.getIdCaja()==idCaja)
                return c;
        return null;
    }

    public ArrayList<Caja> listarCajas() {
        return listaCajas;
    }
}
