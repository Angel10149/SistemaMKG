package controller;

import java.util.ArrayList;
import model.Auditoria;

public class ControllerAuditoria implements IServicio<Auditoria>{
    private ArrayList<Auditoria> auditorias = new ArrayList<>();

    @Override
    public void registrar(Auditoria auditoria) {
        auditorias.add(auditoria);
    }

    @Override
    public Auditoria buscar(int id) {
        for (Auditoria a : auditorias)
            if (a.getIdAuditoria() == id)
                return a;
        return null;
    }

    @Override
    public boolean editar(int id, Auditoria nuevo) {
        for (int i = 0; i < auditorias.size(); i++) {
            if (auditorias.get(i).getIdAuditoria() == id) {
                auditorias.set(i, nuevo);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        Auditoria a = buscar(id);
        if (a != null) return auditorias.remove(a);
        return false;
    }

    @Override
    public ArrayList<Auditoria> listar() {
        return auditorias;
    }
}
