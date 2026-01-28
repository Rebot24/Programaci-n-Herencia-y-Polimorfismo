package UT5_Herencia_Y_Polimorfismo.Actividad3_Polimorfismo.Ejercicio4;

public class Cilindro extends Forma {
    private double longitud, radio;

    public Cilindro(int longitud, double radio) {
        super("Cilindro");
        this.longitud = longitud;
        this.radio = radio;
    }

    @Override
    public double area() {
        return longitud * Math.PI * radio * radio;
    }
}
