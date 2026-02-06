package UT5_Herencia_Y_Polimorfismo.Actividad5_Abstract.Ejercicio4;

public class Triángulo extends Forma{
    private double ancho, alto;

    public Triángulo(int numLados,  double ancho, double alto) {
        super(numLados);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double getArea() {
        return ancho * alto / 2;
    }

    @Override
    public double getPerimeter() {
        return 3 * ancho;
    }
}
