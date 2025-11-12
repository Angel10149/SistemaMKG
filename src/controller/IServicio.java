
package controller;

import java.util.ArrayList;

public interface IServicio<T>{
    public void registrar(T obj);
    public T buscar(int id);
    public boolean editar(int id, T nuevo);
    public boolean eliminar(int id);
    ArrayList<T> listar();
}
