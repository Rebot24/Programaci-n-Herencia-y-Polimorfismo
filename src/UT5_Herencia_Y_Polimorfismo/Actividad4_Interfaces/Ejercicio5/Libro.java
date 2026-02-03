package UT5_Herencia_Y_Polimorfismo.Actividad4_Interfaces.Ejercicio5;

public class Libro extends Bienes implements Imponible {
    private String autor;

    public Libro(String autor, double precio, String descripcion) {
        super(precio, descripcion);
        this.autor = autor;
    }

    @Override
    public double calculoImpuestos() {
        return precio * TASA_IMPUESTOS;
    }

    @Override
    public String toString() {
        return super.toString() + " - Autor: " + autor;
    }
}
