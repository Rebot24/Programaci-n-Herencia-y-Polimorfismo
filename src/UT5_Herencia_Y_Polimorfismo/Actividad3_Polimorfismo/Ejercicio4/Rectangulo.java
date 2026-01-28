package UT5_Herencia_Y_Polimorfismo.Actividad3_Polimorfismo.Ejercicio4;

public class Rectangulo extends Forma {
    private double longitud, ancho;

    public Rectangulo(int longitud, int ancho) {
        super("Rectangulo");
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return longitud * ancho;
    }
}
