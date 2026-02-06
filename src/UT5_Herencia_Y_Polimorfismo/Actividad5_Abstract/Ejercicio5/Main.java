package UT5_Herencia_Y_Polimorfismo.Actividad5_Abstract.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo(4, 2, 3);
        System.out.println(rect);

        Rectangulo rect2 = new Rectangulo(4, 2, 3);
        System.out.println(rect2);

        if (rect.compareTo(rect2) == 0) {
            System.out.println("Son iguales");
        } else if (rect.compareTo(rect2) < 0) {
            System.out.println(rect2 + " es mayor a " + rect);
        } else {
            System.out.println(rect + " es mayor a " + rect2);
        }
    }
}
