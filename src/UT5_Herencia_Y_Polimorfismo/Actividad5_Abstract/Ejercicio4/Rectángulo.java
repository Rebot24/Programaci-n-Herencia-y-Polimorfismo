package UT5_Herencia_Y_Polimorfismo.Actividad5_Abstract.Ejercicio4;

public class Rectángulo extends Forma{
    private double ancho, alto;

    public Rectángulo(int numLados,  double ancho, double alto) {
        super(numLados);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double getArea() {
        return ancho * alto;
    }

    @Override
    public double getPerimeter() {
        return 2 * ancho + alto * 2;
    }
}
