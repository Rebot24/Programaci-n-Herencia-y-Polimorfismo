package UT6_Colecciones.Arte;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Artista> artistas = new ArrayList<Artista>();

    public static void main(String[] args) {
        artistas.add(new Artista("Leonardo da Vinci", "Italiano"));
        artistas.add(new Artista("Pablo Picasso", "Español"));
        artistas.add(new Artista("Auguste Rodin", "Francés"));

        artistas.get(0).anadirObra(new Obra("Salvator Mundi", "óleo sobre madera", 450000000, 1500, "Leonardo da Vinci"));
        artistas.get(0).anadirObra(new Obra("La Gioconda", "óleo sobre madera", 870000000, 1503, "Leonardo da Vinci"));
        artistas.get(2).anadirObra(new Obra("El pensador", "escultura", 11000000, 1904, "Auguste Rodin"));
        artistas.get(1).anadirObra(new Obra("El sueño", "óleo sobre lienzo", 155000000, 1932, "Pablo Picasso"));
        artistas.get(1).anadirObra(new Obra("El Guernica", "óleo sobre lienzo", 2000000000, 1937, "Pablo Picasso"));

        int opcion = 0;

        do {
            try {
                menu();
                opcion = sc.nextInt();
                sc.nextLine();
                eleccion(opcion);
            } catch (InputMismatchException e) {
                System.out.println("Solo las opciones que te salen.");
                sc.nextLine();
            }
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
            case 1: System.out.println(); anadirObra(); System.out.println(); break;
            case 2: System.out.println(); anadirArtista(); System.out.println(); break;
            case 3: System.out.println(); findNomObra(); System.out.println(); break;
            case 4: System.out.println(); findArtObra(); System.out.println(); break;
            case 5: System.out.println(); removeObra(); System.out.println(); break;
            case 6: System.out.println(); obraBarata(); System.out.println(); break;
            case 7: System.out.println(); obraModerna(); System.out.println(); break;
            case 8: break;
            default: System.out.println("Esa no es una opción válida.");
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
                artista.anadirObra(new Obra(nombre, tipo, precio, year, nomArtista));
            }
        }
    }

    public static void anadirArtista() {
        String nombre, nacionalidad;
        int contador = 0;

        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Nacionalidad: ");
        nacionalidad = sc.nextLine();

        for (Artista artista : artistas) {
            if (artista.getNombre().equalsIgnoreCase(nombre)) contador++;
        }

        if (contador == 0) {
            artistas.add(new Artista(nombre, nacionalidad));
        }
    }

    public static void findNomObra() {
        String nombre;

        System.out.print("Introduce el nombre de la obra que quiere buscar: ");
        nombre = sc.nextLine();

        for (Artista artista : artistas) {
            if (!(artista.getObra().isEmpty())) {
                for (Obra obra : artista.getObra()) {
                    if (obra.getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println(obra);
                    }
                }
            }
        }
    }

    public static void findArtObra() {
        String nombre;

        System.out.print("Introduce el nombre del artista: ");
        nombre = sc.nextLine();

        for (Artista artista : artistas) {
            if (!(artista.getObra().isEmpty())) {
                for (Obra obra : artista.getObra()) {
                    if (artista.getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println(obra);
                    }
                }
            }
        }
    }

    public static void removeObra() {
        String nombre;

        System.out.print("Introduce el nombre de la obra que quiere eliminar: ");
        nombre = sc.nextLine();

        for (Artista artista : artistas) {
            if (!(artista.getObra().isEmpty())) {
                for(int i = 0; i < artista.getObra().size(); i++){
                    if (artista.getObra().get(i).getNombre().equalsIgnoreCase(nombre)){
                        artista.getObra().remove(i);
                        System.out.println("Se ha eliminado corectamente.");
                    }
                }
            }
        }
    }

    public static void obraBarata() {
        Obra barata = null;

        for (Artista artista : artistas) {
            if (!(artista.getObra().isEmpty())) {
                for (Obra obra : artista.getObra()) {
                    if (barata == null) {
                        barata = obra;
                    } else if (barata.getPrecio() > obra.getPrecio()) {
                        barata = obra;
                    }
                }
            }
        }

        System.out.println(barata);
    }

    public static void obraModerna() {
        Obra moderna = null;

        for (Artista artista : artistas) {
            if (!(artista.getObra().isEmpty())) {
                for (Obra obra : artista.getObra()) {
                    if (moderna == null) {
                        moderna = obra;
                    } else if (moderna.getYear() < obra.getYear()) {
                        moderna = obra;
                    }
                }
            }
        }

        System.out.println(moderna);
    }
}
