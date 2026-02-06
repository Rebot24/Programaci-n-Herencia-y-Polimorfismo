package UT5_Herencia_Y_Polimorfismo.Actividad5_Abstract.Ejercicio6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4, 10, 4);
        Rectangulo r2 = new Rectangulo(4, 15, 10);
        Rectangulo r3 = new Rectangulo(4, 10, 2);
        Rectangulo r4 = new Rectangulo(4, 10, 3);
        Rectangulo r5 = new Rectangulo(4, 13, 6);
        Rectangulo r6 = new Rectangulo(4, 6, 9);
        Rectangulo r7 = new Rectangulo(4, 19, 1);
        Rectangulo r8 = new Rectangulo(4, 10, 6);
        Rectangulo r9 = new Rectangulo(4, 12, 5);
        Rectangulo r10 = new Rectangulo(4, 10, 7);

        Rectangulo[] rectangulos = new Rectangulo[10];

        rectangulos[0] = r1;
        rectangulos[1] = r2;
        rectangulos[2] = r3;
        rectangulos[3] = r4;
        rectangulos[4] = r5;
        rectangulos[5] = r6;
        rectangulos[6] = r7;
        rectangulos[7] = r8;
        rectangulos[8] = r9;
        rectangulos[9] = r10;

        Arrays.sort(rectangulos);

        System.out.println(rectangulos[0]);
        System.out.println(rectangulos[1]);
        System.out.println(rectangulos[2]);
        System.out.println(rectangulos[3]);
        System.out.println(rectangulos[4]);
        System.out.println(rectangulos[5]);
        System.out.println(rectangulos[6]);
        System.out.println(rectangulos[7]);
        System.out.println(rectangulos[8]);
        System.out.println(rectangulos[9]);
    }
}
