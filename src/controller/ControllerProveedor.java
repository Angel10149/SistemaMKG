package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Proveedor;

public class ControllerProveedor implements IServicio<Proveedor>{
    private ArrayList<Proveedor> proveedores = new ArrayList<>();

    @Override
    public void registrar(Proveedor proveedor) {
        if (proveedor == null) {
            JOptionPane.showMessageDialog(null, "No se puede registrar un proveedor nulo.");
            return;
        }
        
        if (proveedor.getRuc().length() != 11) {
            JOptionPane.showMessageDialog(null, "El RUC debe tener 11 dígitos.");
            return;
        }

        proveedores.add(proveedor);
        JOptionPane.showMessageDialog(null, "Proveedor registrado correctamente.");
    }

    @Override
    public Proveedor buscar(int id) {
        for (Proveedor p : proveedores)
            if (p.getIdPersona()== id)
                return p;
        JOptionPane.showMessageDialog(null, "Proveedor no encontrado.");
        return null;
    }

    @Override
    public boolean editar(int id, Proveedor nuevo) {
        for (int i = 0; i < proveedores.size(); i++) {
            if (proveedores.get(i).getIdPersona()== id) {
                proveedores.set(i, nuevo);
                JOptionPane.showMessageDialog(null, "Proveedor actualizado correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Proveedor no encontrado.");
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        for (Proveedor p : proveedores) {
            if (p.getIdPersona()== id) {
                proveedores.remove(p);
                JOptionPane.showMessageDialog(null, "Proveedor eliminado correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Proveedor no encontrado.");
        return false;
    }

    @Override
    public ArrayList<Proveedor> listar() {
        return proveedores;
    }
    public Proveedor buscarPorRuc(String ruc) {
        for (Proveedor p : proveedores)
            if (p.getRuc().equals(ruc))
                return p;
        return null;
    }
}
