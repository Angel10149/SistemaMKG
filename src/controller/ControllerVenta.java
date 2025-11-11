package controller;

import java.util.ArrayList;
import model.DetalleVenta;
import model.Producto;
import model.Venta;

public class ControllerVenta implements IServicio<Venta>{
    private ArrayList<Venta> ventas = new ArrayList<>();

    @Override
    public void registrar(Venta venta) {
        ventas.add(venta);
        for (DetalleVenta d : venta.getDetalles()) {
            Producto p = d.getProducto();
            p.setStockActual(p.getStockActual() - d.getCantidad());
        }
    }

    @Override
    public Venta buscar(int id) {
        for (Venta v : ventas)
            if (v.getIdVenta() == id)
                return v;
        return null;
    }

    @Override
    public boolean editar(int id, Venta nuevo) {
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getIdVenta() == id) {
                ventas.set(i, nuevo);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        Venta v = buscar(id);
        if (v != null) return ventas.remove(v);
        return false;
    }

    @Override
    public ArrayList<Venta> listar() {
        return ventas;
    }
}
