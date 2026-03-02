package UT6_Colecciones.Juego;

import java.util.ArrayList;

public class Jugador {
    public enum Personaje {
        INVENTOR, GUERRERO, RASTREADOR, MAGO, SABIO, EXPLORADOR
    }

    private String nombre;
    private Personaje personaje;
    private int vida;
    private ArrayList<String> mochila;

    public Jugador(String nombre, Personaje personaje, int vida) {
        this.nombre = nombre;
        this.personaje = personaje;
        this.vida = vida;
        this.mochila = new ArrayList<>();
        if (personaje == Personaje.INVENTOR) {
            mochila.add("fórmula");
            mochila.add("microscopio");
            mochila.add("microorganismo");
            mochila.add("autómata");
        } else if (personaje == Personaje.GUERRERO) {
            mochila.add("escudo");
            mochila.add("ballesta");
            mochila.add("hacha");
            mochila.add("unicornio");
        } else if (personaje == Personaje.RASTREADOR) {
            mochila.add("lupa");
            mochila.add("escoba");
            mochila.add("dragón");
            mochila.add("brújula");
        }  else if (personaje == Personaje.MAGO) {
            mochila.add("varita");
            mochila.add("hechizo");
            mochila.add("libro");
            mochila.add("gata");
        }  else if (personaje == Personaje.SABIO) {
            mochila.add("varita");
            mochila.add("conjuro");
            mochila.add("sombrero");
            mochila.add("búho");
        }   else if (personaje == Personaje.EXPLORADOR) {
            mochila.add("látigo");
            mochila.add("semillas");
            mochila.add("hacha");
            mochila.add("yegua");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public int getVida() {
        return vida;
    }

    public ArrayList<String> getMochila() {
        return mochila;
    }

    @Override
    public String toString() {
        return  nombre + "-" +  personaje.toString().toLowerCase() + "-" + mochila.toString() + "-" + vida;
    }
}
