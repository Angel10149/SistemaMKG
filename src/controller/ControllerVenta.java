package controller;

import java.util.ArrayList;
import model.Venta;

public class ControllerVenta {
    private ArrayList<Venta> listaVentas = new ArrayList<>();

    public void registrarVenta(Venta v) {
        listaVentas.add(v);
    }

    public Venta buscarVenta(int id) {
        for (Venta v : listaVentas)
            if (v.getIdVenta()==id)
                return v;
        return null;
    }

    public ArrayList<Venta> listarVentas() {
        return listaVentas;
    }

    public void cancelarVenta(int idVenta) {
        Venta v = buscarVenta(idVenta);
        if (v != null)
            v.setEstado("CANCELADA");
    }
}
