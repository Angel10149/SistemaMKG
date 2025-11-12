package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Rol;
import model.Usuario;

public class ControllerUsuario implements IServicio<Usuario>{
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    public ControllerUsuario(){
        usuarios.add(new Usuario(1,"Carlos","Pérez","Ramírez","12345678",
        "admin01","admin123",
        new Rol(1, "Administrador", "Acceso completo al sistema"),
        "Activo"
        ));

    usuarios.add(new Usuario(2,"María","Gómez","Torres","23456789","vend01",
        "venta123",
        new Rol(2, "Vendedor", "Gestiona ventas y clientes"),"Activo"));

    usuarios.add(new Usuario(3,"Luis","Fernández","López","34567890","caja01",
        "caja123",
        new Rol(3, "Cajero", "Control de caja y pagos"),"Activo"
        ));

    usuarios.add(new Usuario(
        4,
        "Ana",
        "Ruiz",
        "Martínez",
        "45678901",
        "almac01",
        "almac123",
        new Rol(4, "Almacenero", "Control de inventario y productos"),
        "Activo"
    ));
    }
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
