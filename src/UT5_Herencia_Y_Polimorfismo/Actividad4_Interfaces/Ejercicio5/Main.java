package UT5_Herencia_Y_Polimorfismo.Actividad4_Interfaces.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        // c
        Bienes[] array = new Bienes[3];

        Comida comidas = new Comida(234, 2, "Yogurt de frutilla");
        array[0] = comidas;

        Juguete juguete = new Juguete(18, 30, "Consolador");
        array[1] = juguete;

        Libro libro = new Libro("Daniela", 15, "Autobiografía de Daniela Abellán");
        array[2] = libro;

        // d
        for (Bienes bienes : array) {
            System.out.println(bienes);
        }

        System.out.println();

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println();
        // e
        Imponible juguete2 = new Juguete(10, 7.99, "Unblock");
        System.out.println(juguete2);

        System.out.println();
        // f
        // funciona, pero poner el toSting es innecesario
        System.out.println(libro.toString());

        System.out.println();
        // g
        System.out.println(libro.getAutor());
    }
}
