package UT5_Herencia_Y_Polimorfismo.Actividad5_Abstract.Ejercicio7;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Patri", 170, 12);
        Estudiante estudiante2 = new Estudiante("Manuel", 173, 43);
        Estudiante estudiante3 = new Estudiante("Javier", 189, 72);
        Estudiante estudiante4 = new Estudiante("Alicia", 168, 52);
        Estudiante estudiante5 = new Estudiante("Alberto", 189, 35);

        Estudiante array[] = new Estudiante[5];
        array[0] = estudiante1;
        array[1] = estudiante2;
        array[2] = estudiante3;
        array[3] = estudiante4;
        array[4] = estudiante5;

        System.out.println("Estudiantes sin ordenar:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(array[i]);
        }

        Arrays.sort(array);
        System.out.println();

        System.out.println("Estudiantes ordenados:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(array[i]);
        }
    }
}
