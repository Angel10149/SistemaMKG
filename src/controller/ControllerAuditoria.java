package controller;

import java.util.ArrayList;
import model.Auditoria;

public class ControllerAuditoria {
    private ArrayList<Auditoria> listaAuditorias = new ArrayList<>();

    public void registrarAccion(Auditoria a) {
        listaAuditorias.add(a);
    }

    public ArrayList<Auditoria> listarAuditorias() {
        return listaAuditorias;
    }
}
