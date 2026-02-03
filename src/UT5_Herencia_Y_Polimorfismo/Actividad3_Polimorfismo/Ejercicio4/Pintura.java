package UT5_Herencia_Y_Polimorfismo.Actividad3_Polimorfismo.Ejercicio4;

public class Pintura {
    private double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double calcularPintura(Forma forma) {
        return forma.area() / cobertura;
    }

    public double getCobertura() {
        return cobertura;
    }
}
