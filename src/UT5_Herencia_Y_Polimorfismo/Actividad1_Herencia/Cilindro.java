package UT5_Herencia_Y_Polimorfismo.Actividad1_Herencia;

public class Cilindro extends Circulo {
    private double altura;

    public Cilindro(double radio, double altura) {
        super(radio);

        if (altura < 0) this.altura = 0;
        else this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getVolume(){
        return getArea() * altura;
    }
}
