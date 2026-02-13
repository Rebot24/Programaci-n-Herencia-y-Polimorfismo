package UT6_Colecciones.Actividad2_LinkedList.Ejercicio1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String nombre, artista;
    private ArrayList<Cancion> canciones;

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = new ArrayList<>();
    }

    private Cancion findSong(String titulo) {
        for (Cancion cancion : this.canciones) {
            if (cancion.getTitulo().equalsIgnoreCase(titulo)) return cancion;
        }
        return null;
    }

    public boolean addSong(String titulo, double duracion) {
        if (findSong(titulo) != null) {
            System.out.println("El título ya existe.");
            return false;
        }
        Cancion cancion = new Cancion(titulo, duracion);
        this.canciones.add(cancion);
        return true;
    }

    public boolean addToPlayList(int numCola, LinkedList<Cancion> canciones) {
        numCola -= 1;

        if (numCola >= 0 && numCola < this.canciones.size()) {
            canciones.add(this.canciones.get(numCola));
            return true;
        } else  {
            System.out.println("No se ha podido agregar la canción.");
            return false;
        }
    }

    public boolean addToPlayList(String titulo, LinkedList<Cancion> canciones) {
        Cancion cancion = findSong(titulo);
        if (cancion != null) {
            canciones.add(cancion);
            return true;
        } else {
            System.out.println("La canción no existe en el álbum.");
            return false;
        }
    }
}
