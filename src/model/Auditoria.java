package model;

import java.time.LocalDateTime;

public class Auditoria {
    private int idAuditoria;
    private Usuario usuario;
    private String fechaHora;
    private String accion;
    private String descripcion;

    public Auditoria() {
    }

    public Auditoria(int idAuditoria, Usuario usuario, String fechaHora, String accion, String descripcion) {
        this.idAuditoria = idAuditoria;
        this.usuario = usuario;
        this.fechaHora = fechaHora;
        this.accion = accion;
        this.descripcion = descripcion;
    }

    public Auditoria(Usuario usuario, String fechaHora, String accion, String descripcion) {
        this.usuario = usuario;
        this.fechaHora = fechaHora;
        this.accion = accion;
        this.descripcion = descripcion;
    }

    public int getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(int idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Auditoria{" + "idAuditoria=" + idAuditoria + ", usuario=" + usuario + ", fechaHora=" + fechaHora + ", accion=" + accion + ", descripcion=" + descripcion + '}';
    }

}
