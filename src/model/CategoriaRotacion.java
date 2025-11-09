package model;
public class CategoriaRotacion {
    private String tipo;
    private double margenPorcentaje;

    public CategoriaRotacion() {
    }

    public CategoriaRotacion(String tipo, double margenPorcentaje) {
        this.tipo = tipo;
        this.margenPorcentaje = margenPorcentaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMargenPorcentaje() {
        return margenPorcentaje;
    }

    public void setMargenPorcentaje(double margenPorcentaje) {
        this.margenPorcentaje = margenPorcentaje;
    }

    @Override
    public String toString() {
        return "CategoriaRotacion{" + "tipo=" + tipo + ", margenPorcentaje=" + margenPorcentaje + '}';
    }
    
}
