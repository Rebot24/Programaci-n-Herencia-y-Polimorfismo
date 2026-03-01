package UT6_Colecciones.Arte;

public class Artista {
    private String nombre, nacionalidad;
    private Obra obra;

    public Artista(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public void anadirObra(Obra obra) {
        this.obra = obra;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Obra getObra() {
        return obra;
    }

    @Override
    public String toString() {
        return nombre + ", " + nacionalidad + ", " + obra;
    }
}
