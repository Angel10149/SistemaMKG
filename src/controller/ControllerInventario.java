
package controller;

import java.util.ArrayList;
import model.Inventario;
import model.Producto;

public class ControllerInventario implements IServicio<Inventario>{
    private ArrayList<Inventario> listaInventario = new ArrayList<>();

    @Override
    public void registrar(Inventario obj) {
        listaInventario.add(obj);
    }

    @Override
    public Inventario buscar(int id) {
        for (Inventario inv : listaInventario) {
            if (inv.getIdInventario() == id) {
                return inv;
            }
        }
        return null;
    }

    @Override
    public boolean editar(int id, Inventario nuevo) {
        for (int i = 0; i < listaInventario.size(); i++) {
            if (listaInventario.get(i).getIdInventario() == id) {
                listaInventario.set(i, nuevo);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        Inventario inv = buscar(id);
        if (inv != null) {
            listaInventario.remove(inv);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Inventario> listar() {
        return listaInventario;
    }
    public void actualizarStock(Producto producto, int cantidad, boolean esEntrada) {
        for (Inventario inv : listaInventario) {
            if (inv.getProducto().equals(producto)) {
                if (esEntrada) {
                    inv.setCantidadActual(inv.getCantidadActual() + cantidad);
                    inv.setCantidadEntradas(inv.getCantidadEntradas() + cantidad);
                } else {
                    inv.setCantidadActual(inv.getCantidadActual() - cantidad);
                    inv.setCantidadSalidas(inv.getCantidadSalidas() + cantidad);
                }
                return;
            }
        }
    }

    public boolean verificarStockMinimo(Producto producto) {
        for (Inventario inv : listaInventario) {
            if (inv.getProducto().equals(producto)) {
                return inv.getCantidadActual() <= producto.getStockMinimo();
            }
        }
        return false;
    }

    public boolean verificarStockMaximo(Producto producto) {
        for (Inventario inv : listaInventario) {
            if (inv.getProducto().equals(producto)) {
                return inv.getCantidadActual() >= producto.getStockMaximo();
            }
        }
        return false;
    }
}
