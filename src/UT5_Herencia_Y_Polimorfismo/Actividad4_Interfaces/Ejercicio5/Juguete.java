package UT5_Herencia_Y_Polimorfismo.Actividad4_Interfaces.Ejercicio5;

public class Juguete extends Bienes implements Imponible {
    private int edadMin;

    public  Juguete(int edadMin, double precio, String descripcion) {
        super(precio, descripcion);
        this.edadMin = edadMin;
    }

    @Override
    public double calculoImpuestos() {
        return precio * TASA_IMPUESTOS;
    }

    @Override
    public String toString() {
        return super.toString() + " - Edad mínima: " + edadMin;
    }
}
