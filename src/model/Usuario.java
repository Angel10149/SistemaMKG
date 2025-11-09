package model;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Usuario extends Persona{
    private String codigoUsuario;
    private String password;
    private boolean estado;
    private Rol rol;
    private LocalDateTime fechaCreacion;
    
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String dni) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, dni);
    }

    public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, String dni) {
        super(nombre, apellidoPaterno, apellidoMaterno, dni);
    }

    public Usuario(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String dni,
            String codigoUsuario, String password, boolean estado, Rol rol, LocalDateTime fechaCreacion) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, dni);
        this.codigoUsuario = codigoUsuario;
        this.password = password;
        this.estado = estado;
        this.rol = rol;
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, String dni,
            String codigoUsuario, String password, boolean estado, Rol rol, LocalDateTime fechaCreacion) {
        super(nombre, apellidoPaterno, apellidoMaterno, dni);
        this.codigoUsuario = codigoUsuario;
        this.password = password;
        this.estado = estado;
        this.rol = rol;
        this.fechaCreacion = fechaCreacion;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codigoUsuario='" + codigoUsuario + '\'' +
                ", estado=" + estado +
                ", rol=" + (rol != null ? rol.getNombreRol(): "N/A") +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
    
    public boolean validarCredenciales(String usuario, String password) {
        return this.codigoUsuario.equals(usuario) && this.password.equals(password) && this.estado;
    }

    public void cambiarEstado(boolean nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public String mostrarInfo() {
        return "Usuario: " + getNombre() + " " + getApellidoPaterno() +
               " | Rol: " + (rol != null ? rol.getNombreRol(): "Sin rol");
    }

    public static void registrarUsuario(Usuario u) {
        listaUsuarios.add(u);
        System.out.println("Usuario registrado correctamente: " + u.getCodigoUsuario());
    }

    public static void listarUsuarios() {
        if (listaUsuarios.isEmpty()) {
            System.out.println("No existen usuarios registrados.");
        } else {
            System.out.println("Lista de usuarios registrados:");
            for (Usuario u : listaUsuarios) {
                System.out.println(u.mostrarInfo());
            }
        }
    }

    public static Usuario buscarUsuario(String codigo) {
        for (Usuario u : listaUsuarios) {
            if (u.getCodigoUsuario().equalsIgnoreCase(codigo)) {
                return u;
            }
        }
        return null;
    }

    public void imprimirUsuario() {
        System.out.println(this.toString());
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
