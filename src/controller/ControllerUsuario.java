package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Usuario;

public class ControllerUsuario implements IServicio<Usuario>{
    private ArrayList<Usuario> usuarios = new ArrayList<>();
@Override
    public void registrar(Usuario usuario) {
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "No se puede registrar un usuario nulo.");
            return;
        }
        usuarios.add(usuario);
        JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.");
    }

    @Override
    public Usuario buscar(int id) {
        for (Usuario u : usuarios)
            if (u.getIdPersona() == id)
                return u;
        JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        return null;
    }

    @Override
    public boolean editar(int id, Usuario nuevo) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getIdPersona() == id) {
                usuarios.set(i, nuevo);
                JOptionPane.showMessageDialog(null, "Usuario editado correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        for (Usuario u : usuarios) {
            if (u.getIdPersona() == id) {
                usuarios.remove(u);
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        return false;
    }

    @Override
    public ArrayList<Usuario> listar() {
        return usuarios;
    }
    public boolean validarLogin(String codUsuario, String password) {
        for (Usuario u : usuarios) {
            if (u.getCodigoUsuario().equals(codUsuario) &&
                u.getPassword().equals(password)) {
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
        return false;
    }
}
