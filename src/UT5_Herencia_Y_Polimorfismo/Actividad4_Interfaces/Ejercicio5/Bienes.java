package UT5_Herencia_Y_Polimorfismo.Actividad4_Interfaces.Ejercicio5;

public abstract class Bienes {
    protected double precio;
    protected String descripcion;

    public Bienes(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion + " - " + precio + "€";
    }
}
