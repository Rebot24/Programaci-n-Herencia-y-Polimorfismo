package UT6_Colecciones.Actividad2_LinkedList.Ejercicio1;

public class Cancion {
    private String titulo;
    private double duracion;

    public Cancion(String titulo, double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String toString() {
        return titulo + " (" + duracion + " min)";
    }
}
