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

}
