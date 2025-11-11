package model;
public class BacKup {
    private int idBackup;
    private String fecha;
    private String rutaArchivo;
    private String estado;

    public BacKup() {
    }

    public BacKup(int idBackup, String fecha, String rutaArchivo, String estado) {
        this.idBackup = idBackup;
        this.fecha = fecha;
        this.rutaArchivo = rutaArchivo;
        this.estado = estado;
    }

    public BacKup(String fecha, String rutaArchivo, String estado) {
        this.fecha = fecha;
        this.rutaArchivo = rutaArchivo;
        this.estado = estado;
    }

    public int getIdBackup() {
        return idBackup;
    }

    public void setIdBackup(int idBackup) {
        this.idBackup = idBackup;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "BacKup{" + "idBackup=" + idBackup + ", fecha=" + fecha + ", rutaArchivo=" + rutaArchivo + ", estado=" + estado + '}';
    }
    
}
