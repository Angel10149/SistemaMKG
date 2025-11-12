package controller;

import java.util.ArrayList;
import model.Compra;
import model.DetalleCompra;
import model.Producto;

public class ControllerCompra implements IServicio<Compra>{
    private ArrayList<Compra> compras = new ArrayList<>();
    @Override
    public void registrar(Compra compra) {
        compras.add(compra);
        for (DetalleCompra d : compra.getDetalles()) {
            Producto p = d.getProducto();
            p.setStockActual(p.getStockActual() + d.getCantidad());
        }
    }

    @Override
    public Compra buscar(int id) {
        for (Compra c : compras)
            if (c.getIdCompra() == id)
                return c;
        return null;
    }

    @Override
    public boolean editar(int id, Compra nuevo) {
        for (int i = 0; i < compras.size(); i++) {
            if (compras.get(i).getIdCompra() == id) {
                compras.set(i, nuevo);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        Compra c = buscar(id);
        if (c != null) return compras.remove(c);
        return false;
    }

    @Override
    public ArrayList<Compra> listar() {
        return compras;
    }
}