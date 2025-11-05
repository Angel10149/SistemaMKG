
import java.util.ArrayList;


public class Empresa {
    private int idEmpresa;
    private String ruc;
    private String nombre;
    private ArrayList<Trabajador> empleados;

    public Empresa() {
    }

    public Empresa(int idEmpresa, String ruc, String nombre, ArrayList<Trabajador> empleados) {
        this.idEmpresa = idEmpresa;
        this.ruc = ruc;
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public Empresa(String ruc, String nombre, ArrayList<Trabajador> empleados) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Trabajador> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Trabajador> empleados) {
        this.empleados = empleados;
    }
    public void listarEmpleados(){
        if(this.getEmpleados().isEmpty())
            System.out.println("No existen empleados registrados");
        else{
            System.out.println("Lista de empleados");
            for (int i = 0; i < this.getEmpleados().size(); i++) {
                System.out.println(this.getEmpleados().get(i).toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Empresa{" + "idEmpresa=" + idEmpresa + ", ruc=" + ruc + ", nombre=" + nombre + '}';
    }
    public void imprimirEmpresa(){
        System.out.println(this.toString());
        this.listarEmpleados();
    }
}
