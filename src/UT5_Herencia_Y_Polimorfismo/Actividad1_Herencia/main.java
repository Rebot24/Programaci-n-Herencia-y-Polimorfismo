package UT5_Herencia_Y_Polimorfismo.Actividad1_Herencia;

public class main {
    public static void main() {
        /*Cilindro cilindro = new Cilindro(5, 10);

        System.out.println(cilindro.getRadio());
        System.out.println(cilindro.getAltura());
        System.out.println(cilindro.getArea());
        System.out.println(cilindro.getVolume());*/

        /*Cilindro c = new Circulo();*/
        /*Cilindro c = (Cilindro) new Circulo();*/

        Circulo cir = new Cilindro(5, 5);
        Cilindro cil = (Cilindro)cir;

        Circulo cir2 = (Circulo) new Cilindro(5, 5);
        Circulo cir3 = new Cilindro(5, 5);
    }
}