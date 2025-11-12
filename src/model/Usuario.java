package model;
public class Usuario extends Persona{
    private String codigoUsuario;
    private String password;
    private Rol rol;
    private String estado;
    
    public Usuario() {
    }

    public Usuario(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String dni,
            String codigoUsuario, String password, Rol rol, String estado) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, dni);
        this.codigoUsuario = codigoUsuario;
        this.password = password;
        this.rol = rol;
        this.estado = estado;
    }

    public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, String dni,
            String codigoUsuario, String password, Rol rol, String estado) {
        super(nombre, apellidoPaterno, apellidoMaterno, dni);
        this.codigoUsuario = codigoUsuario;
        this.password = password;
        this.rol = rol;
        this.estado = estado;
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String isEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString() + ", usuario=" + codigoUsuario + ", rol=" + rol;
    }
}
