package controller;

import java.util.ArrayList;
import model.Compra;
import model.DetalleCompra;

public class ControllerCompra {
    private ArrayList<Compra> listaCompras = new ArrayList<>();
    private ControllerProducto ctrlProducto;

    public ControllerCompra(ControllerProducto ctrlProducto) {
        this.ctrlProducto = ctrlProducto;
    }

    public void registrarCompra(Compra c) {
        listaCompras.add(c);

        // Actualiza stock de cada producto comprado
        for (DetalleCompra d : c.getDetalles()) {
            ctrlProducto.actualizarStock(d.getProducto().getIdProducto(), d.getCantidad());
        }
    }

    public Compra buscarCompra(String id) {
        for (Compra c : listaCompras)
            if (c.getIdCompra().equals(id))
                return c;
        return null;
    }

    public ArrayList<Compra> listarCompras() {
        return listaCompras;
    }

    public void cambiarEstadoCompra(String idCompra, String nuevoEstado) {
        Compra c = buscarCompra(idCompra);
        if (c != null) {
            c.setEstado(nuevoEstado);
        }
    }
}
