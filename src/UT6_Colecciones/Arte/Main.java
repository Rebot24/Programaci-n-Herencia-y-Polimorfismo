package UT6_Colecciones.Arte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Artista> artistas = new ArrayList<Artista>();

    static void main(String[] args) {
        artistas.add(new Artista("Leonardo da Vinci", "Italiano"));
        artistas.add(new Artista("Pablo Picasso", "Español"));
        artistas.add(new Artista("Auguste Rodin", "Francés"));

        int opcion;

        do {
            imprimir();
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            eleccion(opcion);
        } while (opcion != 8);
    }

    public static void menu(){
        System.out.println("=======================================");
        System.out.println("   VUELOS DEL ÁEROPUERTO DE VALENCIA   ");
        System.out.println("=======================================");
        System.out.println(" 1 - Añadir obra");
        System.out.println(" 2 - Añadir artista");
        System.out.println(" 3 - Buscar obra por nombre");
        System.out.println(" 4 - Buscar obras por artista");
        System.out.println(" 5 - Eliminar obra");
        System.out.println(" 6 - Encontrar obra más barata");
        System.out.println(" 7 - Encontrar obra más moderna");
        System.out.println(" 8 - Salir");
        System.out.println("-----------------------------");
        System.out.print("Dame la opción: ");
    }

    public static void eleccion(int opcion) {
        switch (opcion) {
            case 1: anadirObra(); break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            default: System.out.println("Esa no es una opción válida.");
        }
    }

    public static void imprimir() {
        for (Artista artista : artistas) {
            System.out.println(artista);
        }
    }

    public static void anadirObra() {
        String nombre, tipo, nomArtista;
        int precio, year;

        System.out.print("Nombre de la obra: ");
        nombre = sc.nextLine();

        System.out.print("Tipo de obra: ");
        tipo = sc.nextLine();

        System.out.print("Precio aproximado de la obra: ");
        precio = sc.nextInt();

        System.out.print("Año de realización de la obra: ");
        year = sc.nextInt();
        sc.nextLine();

        System.out.print("Artista que ha hecho la obra: ");
        nomArtista = sc.nextLine();

        for (Artista artista : artistas) {
            if (artista.getNombre().equalsIgnoreCase(nomArtista)) {
                artista.anadirObra(new Obra(nombre, tipo, precio, year));
            }
        }
    }
}
