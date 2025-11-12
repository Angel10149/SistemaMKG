package model;

public class Proveedor extends Persona{
    private String ruc;
    private String razonSocial;
    private String direccion;
    private String telefono;
    private String email;
    private String contacto;
    
    public Proveedor() {
    }

    public Proveedor(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String dni,
            String ruc, String razonSocial, String direccion, String telefono, String email, String contacto) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, dni);
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.contacto = contacto;
    }

    public Proveedor(String nombre, String apellidoPaterno, String apellidoMaterno, String dni,
            String ruc, String razonSocial, String direccion, String telefono, String email, String contacto) {
        super(nombre, apellidoPaterno, apellidoMaterno, dni);
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.contacto = contacto;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    @Override
    public String toString() {
        return "Proveedor{" +
                "RUC='" + ruc + '\'' +
                ", Razon Social='" + razonSocial + '\'' +
                ", Telefono='" + telefono +  '}';
    }
}
