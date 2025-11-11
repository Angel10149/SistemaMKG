
package controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Producto;
public class ControllerProducto implements IServicio<Producto>{
    private ArrayList<Producto> productos = new ArrayList();
    @Override
    public void registrar(Producto p) {
        if (p == null) {
            JOptionPane.showMessageDialog(null, "No se puede registrar un producto nulo.");
            return;
        }

        if (p.getCodigo() == null || p.getCodigo().isEmpty()) {
            p.setCodigo("PROD-" + (productos.size() + 1));
        }

        productos.add(p);
        JOptionPane.showMessageDialog(null, "Producto registrado correctamente.");
    }

    @Override
    public Producto buscar(int id) {
        for (Producto p : productos)
            if (p.getIdProducto() == id)
                return p;
        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        return null;
    }

    @Override
    public boolean editar(int id, Producto nuevo) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getIdProducto() == id) {
                productos.set(i, nuevo);
                JOptionPane.showMessageDialog(null, "Producto actualizado correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        for (Producto p : productos) {
            if (p.getIdProducto() == id) {
                productos.remove(p);
                JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        return false;
    }

    @Override
    public ArrayList<Producto> listar() {
        return productos;
    }
    
    public void actualizarStock(int idProducto, int cantidad) {
        Producto p = buscar(idProducto);
        if (p != null) {
            p.setStockActual(p.getStockActual()+ cantidad);
            verificarStock(p);
        }
    }

    public void verificarStock(Producto p) {
        if (p.getStockActual()<= p.getStockMinimo()) {
            JOptionPane.showMessageDialog(null, "Producto con stock bajo: " + p.getNombre());
        } else if (p.getStockActual()>= p.getStockMaximo()) {
            JOptionPane.showMessageDialog(null, "Producto con stock alto: " + p.getNombre());
        }
    }
}

