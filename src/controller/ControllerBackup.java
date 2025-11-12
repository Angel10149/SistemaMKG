package controller;
import model.BacKup;
import java.util.ArrayList;

public class ControllerBackup implements IServicio<BacKup>{
    private ArrayList<BacKup> listaBackups = new ArrayList<>();

    @Override
    public void registrar(BacKup obj) {
        listaBackups.add(obj);
    }

    @Override
    public BacKup buscar(int id) {
        for (BacKup b : listaBackups) {
            if (b.getIdBackup() == id)
                return b;
        }
        return null;
    }

    @Override
    public boolean editar(int id, BacKup nuevo) {
        for (int i = 0; i < listaBackups.size(); i++) {
            if (listaBackups.get(i).getIdBackup() == id) {
                listaBackups.set(i, nuevo);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        BacKup b = buscar(id);
        if (b != null) {
            listaBackups.remove(b);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<BacKup> listar() {
        return listaBackups;
    }

    public void generarBackup(String rutaArchivo) {
        BacKup nuevo = new BacKup();
        nuevo.setIdBackup(listaBackups.size() + 1);
        nuevo.setFecha(java.time.LocalDateTime.now().toString());
        nuevo.setRutaArchivo(rutaArchivo);
        nuevo.setEstado("Completado");
        registrar(nuevo);
    }
}
