
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.TipoProducto;

public class ControllerTipoProducto {
    private ArrayList<TipoProducto> tipoProductos = new ArrayList();

    public ControllerTipoProducto() {
        tipoProductos.add(new TipoProducto(1, "Gas.Premium"));
        tipoProductos.add(new TipoProducto(2, "GasRegular"));
        tipoProductos.add(new TipoProducto(3, "GLP"));
        tipoProductos.add(new TipoProducto(4, "Diesel"));
    }
    public void agreagrTipoProducto(TipoProducto c){
        tipoProductos.add(c);
    }
    public TipoProducto buscarTipoProductoPorId(int codigo){
        if (codigo<0){
            JOptionPane.showMessageDialog(null, "Ingrese un código valido");
        }else{
            for (TipoProducto tipoProducto : tipoProductos) {
                if(codigo==tipoProducto.getIdTipo()){
                    return tipoProducto;
                }
            }
        }return null;
    }
    public void eliminarTipoProducto(int codigo){
        TipoProducto c = buscarTipoProductoPorId(codigo);
        if(c != null){
            tipoProductos.remove(c);
            JOptionPane.showMessageDialog(null, "Producto eliminado","Mensaje",1);
        }else{
            JOptionPane.showMessageDialog(null, "Código no existente");
        }
    }
    public ArrayList<TipoProducto> getTipoProductos() {
    return tipoProductos;
    }
}
