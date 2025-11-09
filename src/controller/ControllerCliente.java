
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Cliente;

public class ControllerCliente {
    private ArrayList<Cliente> clientes = new ArrayList();
    public void agreagrCliente(Cliente c){
        clientes.add(c);
    }
    public Cliente buscarClientePorId(int codigo){
        if (codigo<0){
            JOptionPane.showMessageDialog(null, "Ingrese un código valido");
        }else{
            for (Cliente cliente : clientes) {
                if(codigo==cliente.getIdPersona()){
                    return cliente;
                }break;
            }
        }return null;
    }
    public void eliminarCliente(int codigo){
        Cliente c = buscarClientePorId(codigo);
        if(c != null){
            clientes.remove(c);
            JOptionPane.showMessageDialog(null, "Cliente eliminado","Mensaje",1);
        }else{
            JOptionPane.showMessageDialog(null, "Código no existente");
        }
    }
    
}
