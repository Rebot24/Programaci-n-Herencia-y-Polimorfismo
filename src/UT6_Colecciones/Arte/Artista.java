package UT6_Colecciones.Arte;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Artista {
    private String nombre, nacionalidad;
    private ArrayList<Obra> obras;

    public Artista(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        obras = new ArrayList<>();
    }

    public void anadirObra(Obra obra) {
        obras.add(obra);
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public ArrayList<Obra> getObra() {
        return obras;
    }

    @Override
    public String toString() {
        return nombre + ", " + nacionalidad;
    }
}
