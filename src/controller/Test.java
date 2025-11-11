package controller;
public void generarBackup(String rutaArchivo) {
        Backup nuevo = new Backup();
        nuevo.setIdBackup(listaBackups.size() + 1);
        nuevo.setFecha(java.time.LocalDateTime.now().toString());
        nuevo.setRutaArchivo(rutaArchivo);
        nuevo.setEstado("Completado");
        registrar(nuevo);
    }