package controller;

import java.util.ArrayList;
import model.Rol;

public class ControllerRol {
    private ArrayList<Rol> listaRoles = new ArrayList<>();

    public void registrarRol(Rol r) { listaRoles.add(r); }
    public ArrayList<Rol> listarRoles() { return listaRoles; }
}
