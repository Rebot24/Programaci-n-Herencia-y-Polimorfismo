package UT6_Colecciones.Actividad2_LinkedList.Ejercicio1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    private static LinkedList<Cancion> playList = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //creacion de albums
        Album album1 = new Album("Hijos de la ruina", "Natos y Waor");
        Album album2 = new Album("DeBÍ TiRAR MáS FOToS", "Bad Bunny");
        albums.add(album1);
        albums.add(album2);

        //añadir canciones
        album1.addSong("CHILLIN", 2.37);
        album1.addSong("HIJA DE PUTA", 2.44);
        album1.addSong("Hijos de la ruina", 3.15);

        album2.addSong("NUEVAYoL", 3.04);
        album2.addSong("CAFé CON RON", 3.49);
        album2.addSong("Dtmf", 3.58);

        album1.addToPlayList(1, playList);
        album2.addToPlayList("CAFé CON RON", playList);

        play(playList);
    }

    public static void menu() {
        System.out.println("0. Salir");
        System.out.println("1. Reproducir siguiente canción en la lista");
        System.out.println("2. Reproducir la canción previa de la lista");
        System.out.println("3. Repetir la canción actual");
        System.out.println("4. Imprimir la lista de canciones en la playlist");
        System.out.println("5. Volver a imprimir el menú");
        System.out.print("Introduce una de las opciones: ");
    }

    public static void opciones(int opcion, ListIterator<Cancion> listIterator) {
        switch (opcion) {
            case 1: System.out.println("------"); nextCancion(listIterator); System.out.println("------"); break;
            case 2: System.out.println("------"); break;
            case 3: System.out.println("------"); break;
            case 4: System.out.println("------"); imprimirPlayList(); System.out.println("------"); break;
            case 0, 5: System.out.println("------"); break;
            default: System.out.println("Opcion incorrecta"); System.out.println("------");
        }
    }

    public static void nextCancion(ListIterator<Cancion> listIterator){
        if (listIterator.hasNext()) {
            listIterator.next();
            System.out.println("Reproduciendo: " + listIterator.next());
        } else System.out.println("Has llegado al final.");
    }

    public static void imprimirPlayList(){
        ListIterator<Cancion> listIterator = playList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }

    public static void play(LinkedList<Cancion> playList){
        if (playList.isEmpty()) {
            System.out.println("La playlist está vacía.");
            return;
        }

        ListIterator<Cancion> listIterator = playList.listIterator();

        System.out.println("Reproduciendo: " + listIterator.next());
        imprimirPlayList();

        int opcion = 6;
        do {
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            opciones(opcion, listIterator);
        } while (opcion != 0);
    }
}
