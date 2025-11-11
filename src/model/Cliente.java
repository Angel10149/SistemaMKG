package model;
public class Cliente extends Persona{
    private String ruc;
    private String direccion;
    private String telefono;
    private String email;

    public Cliente() {
    }

    public Cliente(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String dni) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, dni);
    }

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String dni) {
        super(nombre, apellidoPaterno, apellidoMaterno, dni);
    }

    public Cliente(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String dni,
            String ruc, String direccion, String telefono, String email) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, dni);
        this.ruc = ruc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String ruc, String direccion, String telefono, String email) {
        super(nombre, apellidoPaterno, apellidoMaterno, dni);
        this.ruc = ruc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + ", ruc=" + ruc + ", direccion=" + direccion +
               ", telefono=" + telefono + ", email=" + email;
    }
}
