package UT5_Herencia_Y_Polimorfismo.Actividad5_Abstract.Ejercicio5;

public abstract class Forma {
    private int numLados;

    public Forma(int numLados){
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
