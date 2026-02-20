package UT6_Colecciones.Actividad3.Map.Ejercicio1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ubicacion {
    private int id;
    private String descripcion;
    private Map<String,Integer> exits;

    public Ubicacion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.exits = new LinkedHashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Map<String, Integer> getExits() {
        return exits;
    }

    public void addExit(String direccion, Integer idUbicacion) {
        exits.put(direccion, idUbicacion);
    }
}
