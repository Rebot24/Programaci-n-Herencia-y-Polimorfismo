package UT5_Herencia_Y_Polimorfismo.Actividad5_Abstract.Ejercicio5;

public class Rectangulo extends Forma implements Redimensionable, Comparable<Rectangulo>{
    private double ancho, alto;

    public Rectangulo(int numLados, double ancho, double alto) {
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

    @Override
    public void redimensionar(int x) {
        this.ancho = this.ancho * x;
        this.alto = this.alto * x;
    }

    @Override
    public int compareTo(Rectangulo r) {
        return Double.compare(this.getArea(), r.getArea());
    }

    @Override
    public String toString() {
        return "Rectangulo [ancho=" + ancho + ", alto=" + alto + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}
