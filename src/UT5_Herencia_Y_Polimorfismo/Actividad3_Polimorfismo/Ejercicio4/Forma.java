package UT5_Herencia_Y_Polimorfismo.Actividad3_Polimorfismo.Ejercicio4;

public class Forma {
    protected String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return nombre;
    }
}