package UT5_Herencia_Y_Polimorfismo.Actividad4_Interfaces.Ejercicio5;

public class Comida extends Bienes {
    private double calorias;

    public Comida(double calorias, double precio, String descripcion) {
        super(precio, descripcion);
        this.calorias = calorias;
    }

    public String toString() {
        return super.toString() + " - " + calorias + " kcal";
    }
}
