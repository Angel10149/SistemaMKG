package model;
import java.util.ArrayList;


public class Proveedor extends Persona{
    private String ruc;
    private String razonSocial;
    private String direccion;
    private String telefono;
    private String email;
    private String contacto;
    
    private static ArrayList<Proveedor> listaProveedores = new ArrayList<>();

    public Proveedor() {
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "RUC='" + ruc + '\'' +
                ", Razon Social='" + razonSocial + '\'' +
                ", Telefono='" + telefono +  '}';
    }
    

    public String mostrarInfo() {
        return "RUC: " + ruc + " | " + razonSocial + " | Tel: " + telefono;
    }

    public void imprimirProveedor() {
        System.out.println(this.toString());
    }

  
    public static void registrarProveedor(Proveedor p) {
        listaProveedores.add(p);
        System.out.println("Proveedor registrado correctamente: " + p.getRazonSocial());
    }

    public static void listarProveedores() {
        if (listaProveedores.isEmpty()) {
            System.out.println(" No existen proveedores registrados.");
        } else {
            System.out.println("Lista de proveedores registrados:");
            for (Proveedor p : listaProveedores) {
                System.out.println(p.mostrarInfo());
            }
        }
    }

    public static Proveedor buscarProveedorPorRuc(String ruc) {
        for (Proveedor p : listaProveedores) {
            if (p.getRuc().equalsIgnoreCase(ruc)) {
                return p;
            }
        }
        return null;
    }

    public static void eliminarProveedor(String ruc) {
        Proveedor encontrado = buscarProveedorPorRuc(ruc);
        if (encontrado != null) {
            listaProveedores.remove(encontrado);
            System.out.println("Proveedor eliminado correctamente: " + ruc);
        } else {
            System.out.println("Proveedor no encontrado.");
        }
    }

    public static void actualizarProveedor(String ruc, String nuevoTelefono, String nuevoEmail) {
        Proveedor encontrado = buscarProveedorPorRuc(ruc);
        if (encontrado != null) {
            encontrado.setTelefono(nuevoTelefono);
            encontrado.setEmail(nuevoEmail);
            System.out.println("Datos actualizados correctamente para: " + encontrado.getRazonSocial());
        } else {
            System.out.println("No se encontró el proveedor con RUC: " + ruc);
        }
    }

    @Override
    protected void registrarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void editarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void eliminarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
