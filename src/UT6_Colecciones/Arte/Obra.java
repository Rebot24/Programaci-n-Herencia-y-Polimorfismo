package UT6_Colecciones.Arte;

import com.sun.jdi.ObjectReference;

public class Obra {
    private String nombre, tipo;
    private int precio, year;

    public Obra(String nombre, String tipo, int precio, int year) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.year = year;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return nombre + ", " + tipo + ", " + precio + ", " + year;
    }
}
