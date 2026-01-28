package UT5_Herencia_Y_Polimorfismo.Actividad3_Polimorfismo.Ejercicio4;

public class MainPintura {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);
        Rectangulo rectangulo = new Rectangulo(20, 35);
        Esfera esfera = new Esfera(15);
        Cilindro cilindro = new Cilindro(30, 10);

        System.out.println(pintura.calcularPintura(rectangulo));
        System.out.println(pintura.calcularPintura(esfera));
        System.out.println(pintura.calcularPintura(cilindro));
    }
}
