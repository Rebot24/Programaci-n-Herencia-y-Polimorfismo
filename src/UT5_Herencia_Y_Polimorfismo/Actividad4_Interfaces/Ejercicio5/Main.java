package UT5_Herencia_Y_Polimorfismo.Actividad4_Interfaces.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Bienes[] array = new Bienes[3];

        Comida comidas = new Comida(234, 2, "Yogurt de frutilla");
        array[0] = comidas;

        Juguete juguete = new Juguete(18, 30, "Consolador");
        array[1] = juguete;

        Libro libro = new Libro("Daniela", 15, "Autobiografía de Daniela Abellán");
        array[2] = libro;

        for (Bienes bienes : array) {
            System.out.println(bienes);

            if (bienes instanceof Imponible) {
                System.out.println("Impuestos: " + ((Imponible) bienes).calculoImpuestos());
            }
        }
    }
}
