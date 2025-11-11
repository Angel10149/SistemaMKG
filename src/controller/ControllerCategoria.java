package controller;

import java.util.ArrayList;
import model.Categoria;

public class ControllerCategoria {
    private ArrayList<Categoria> listaCategorias = new ArrayList<>();

    public void registrarCategoria(Categoria c) {
        listaCategorias.add(c);
    }

    public Categoria buscarCategoria(int id) {
        for (Categoria c : listaCategorias)
            if (c.getIdCategoria()==id)
                return c;
        return null;
    }

    public boolean eliminarCategoria(int id) {
        Categoria c = buscarCategoria(id);
        if (c != null) {
            listaCategorias.remove(c);
            return true;
        }
        return false;
    }

    public boolean editarCategoria(Categoria categoriaEditada) {
        for (int i = 0; i < listaCategorias.size(); i++) {
            if (listaCategorias.get(i).getIdCategoria()==categoriaEditada.getIdCategoria()) {
                listaCategorias.set(i, categoriaEditada);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Categoria> listarCategorias() {
        return listaCategorias;
    }
}
