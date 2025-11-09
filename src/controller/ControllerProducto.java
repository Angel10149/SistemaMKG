
package controler;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Producto;

public class ControllerProducto {
    private ArrayList<Producto> productos = new ArrayList();
    public void agreagrProducto(Producto c){
        productos.add(c);
    }
    public Producto buscarProductoPorId(int codigo){
        if (codigo<0){
            JOptionPane.showMessageDialog(null, "Ingrese un código valido");
        }else{
            for (Producto producto : productos) {
                if(codigo==producto.getIdProducto()){
                    return producto;
                }
            }
        }return null;
    }
    public void eliminarProducto(int codigo){
        Producto c = buscarProductoPorId(codigo);
        if(c != null){
            productos.remove(c);
            JOptionPane.showMessageDialog(null, "Producto eliminado","Mensaje",1);
        }else{
            JOptionPane.showMessageDialog(null, "Código no existente");
        }
    }
}
