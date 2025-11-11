
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Cliente;

public class ControllerCliente implements IServicio<Cliente>{
    private ArrayList<Cliente> clientes = new ArrayList();

    @Override
    public void registrar(Cliente cliente) {
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "No se puede registrar un cliente nulo.");
            return;
        }
        clientes.add(cliente);
        JOptionPane.showMessageDialog(null, "Cliente registrado correctamente.");
    }

    @Override
    public Cliente buscar(int id) {
        for (Cliente c : clientes) {
            if (c.getIdPersona() == id) {
                return c;
            }
        }
        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
        return null;
    }

    @Override
    public boolean editar(int id, Cliente nuevo) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getIdPersona() == id) {
                clientes.set(i, nuevo);
                JOptionPane.showMessageDialog(null, "Cliente editado correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró el cliente con ID " + id);
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        for (Cliente c : clientes) {
            if (c.getIdPersona() == id) {
                clientes.remove(c);
                JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró el cliente con ID " + id);
        return false;
    }

    @Override
    public ArrayList<Cliente> listar() {
        return clientes;
    }
}
