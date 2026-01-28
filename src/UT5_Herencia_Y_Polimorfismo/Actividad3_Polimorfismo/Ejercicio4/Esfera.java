package UT5_Herencia_Y_Polimorfismo.Actividad3_Polimorfismo.Ejercicio4;

public class Esfera extends Forma {
    private double radio;

    public Esfera(double radio){
        super("Esfera");
        this.radio = radio;
    }

    @Override
    public double area() {
        return radio * radio * 4 * Math.PI;
    }
}
