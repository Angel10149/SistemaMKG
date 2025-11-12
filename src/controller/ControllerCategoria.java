package controller;

import java.util.ArrayList;
import model.Categoria;

public class ControllerCategoria implements IServicio<Categoria>{
    private ArrayList<Categoria> listaCategorias = new ArrayList<>();

    @Override
    public void registrar(Categoria obj) {
        listaCategorias.add(obj);
    }

    @Override
    public Categoria buscar(int id) {
        for (Categoria c : listaCategorias)
            if (c.getIdCategoria() == id)
                return c;
        return null;
    }

    @Override
    public boolean editar(int id, Categoria nuevo) {
        for (int i = 0; i < listaCategorias.size(); i++) {
            if (listaCategorias.get(i).getIdCategoria() == id) {
                listaCategorias.set(i, nuevo);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        Categoria c = buscar(id);
        if (c != null) {
            listaCategorias.remove(c);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Categoria> listar() {
        return listaCategorias;
    }
}
