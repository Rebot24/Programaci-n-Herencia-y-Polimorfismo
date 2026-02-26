package UT6_Colecciones.Vuelos;

import java.util.ArrayList;
import java.util.Set;

public class Vuelos {
    public enum Clase{
        TURISTA, PRIMERA
    }

    private String numero, origen, destino, dia;
    private Clase clase;
    private ArrayList<Vuelos> vuelos;

    public Vuelos(String numero, String origen, String destino, String dia, Clase clase){
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.dia = dia;
        this.clase = clase;
        this.vuelos = new ArrayList<Vuelos>();
    }

    public String getNumero() {
        return numero;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getDia() {
        return dia;
    }

    public Clase getClase() {
        return clase;
    }

    @Override
    public String toString() {
        return "número: " + numero + ", origen: " + origen + ", destino: " + destino + ", dia: " + dia +  ", clase: " + clase;
    }
}
