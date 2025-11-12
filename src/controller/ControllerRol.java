package controller;

import java.util.ArrayList;
import model.Rol;

public class ControllerRol {
    private ArrayList<Rol> listaRoles = new ArrayList<>();

    public ControllerRol() {
        listaRoles.add(new Rol(1, "Administrador", "Acceso completo al sistema"));
        listaRoles.add(new Rol(2, "Vendedor", "Gestiona ventas y clientes"));
        listaRoles.add(new Rol(3, "Cajero", "Control de caja y pagos"));
        listaRoles.add(new Rol(4, "Almacenero", "Control de inventario y productos"));
    }

    public void registrarRol(Rol r) {
        listaRoles.add(r);
    }
    public Rol buscarRolPorNombre(String nombre) {
        for (Rol r : listaRoles) {
            if (r.getNombreRol().equalsIgnoreCase(nombre)) {
                return r;
            }
        }
        return null;
    }
    public ArrayList<Rol> listarRoles() {
        return listaRoles;
    }
}
