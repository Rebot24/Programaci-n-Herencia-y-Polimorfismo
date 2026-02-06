package UT5_Herencia_Y_Polimorfismo.Actividad4_Interfaces.Ejercicio4;

public class Libro extends Bienes implements Imponible{
    private String autor;

    public Libro(String autor, double precio, String descripcion) {
        super(precio, descripcion);
        this.autor = autor;
    }

    @Override
    public double calculoImpuestos() {
        return precio + TASA_IMPUESTOS * precio;
    }

    @Override
    public String toString() {
        return super.toString() + " - Autor: " + autor;
    }
}
