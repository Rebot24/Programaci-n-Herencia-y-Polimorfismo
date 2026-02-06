package UT5_Herencia_Y_Polimorfismo.Actividad5_Abstract.Ejercicio7;

public class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private int edad;
    private int altura;

    public Estudiante(String nombre, int altura, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return getNombre() + " - Altura: " + getAltura() + " - Edad: " + getEdad();
    }

    @Override
    public int compareTo(Estudiante o) {
        if (this.altura != o.altura) {
            return Integer.compare(o.altura, this.altura);
        }
        return Integer.compare(o.edad, this.edad);
    }
}
