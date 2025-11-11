package model;

import java.time.LocalDateTime;

public class Auditoria {
    private int idAuditoria;
    private Usuario usuario;
    private String accion;
    private String dispositivo;
    private LocalDateTime fechaHora;

    public Auditoria() {
    }

    public Auditoria(int idAuditoria, Usuario usuario, String accion, String dispositivo, LocalDateTime fechaHora) {
        this.idAuditoria = idAuditoria;
        this.usuario = usuario;
        this.accion = accion;
        this.dispositivo = dispositivo;
        this.fechaHora = fechaHora;
    }

    public Auditoria(Usuario usuario, String accion, String dispositivo, LocalDateTime fechaHora) {
        this.usuario = usuario;
        this.accion = accion;
        this.dispositivo = dispositivo;
        this.fechaHora = fechaHora;
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

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Auditoria{" + "idAuditoria=" + idAuditoria + ", usuario=" + usuario + ", accion=" + accion + ", dispositivo=" + dispositivo + ", fechaHora=" + fechaHora + '}';
    }
    
}
