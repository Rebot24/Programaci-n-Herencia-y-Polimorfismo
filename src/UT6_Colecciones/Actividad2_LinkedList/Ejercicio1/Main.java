package UT6_Colecciones.Actividad2_LinkedList.Ejercicio1;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    private static LinkedList<Cancion> playList = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);
    private static boolean adelante = true;

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
        album1.addToPlayList(2, playList);
        album1.addToPlayList(3, playList);
        album2.addToPlayList("NUEVAYoL", playList);
        album2.addToPlayList("CAFé CON RON", playList);
        album2.addToPlayList("Dtmf", playList);

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
            case 2: System.out.println("------"); prevCancion(listIterator); System.out.println("------"); break;
            case 3: System.out.println("------"); repetirCancion(listIterator); System.out.println("------"); break;
            case 4: System.out.println("------"); imprimirPlayList(); System.out.println("------"); break;
            case 0, 5: System.out.println("------"); break;
            default: System.out.println("Opcion incorrecta"); System.out.println("------");
        }
    }

    public static void nextCancion(ListIterator<Cancion> listIterator){
        if (adelante){
            if (listIterator.hasNext()){
                Cancion cancion = listIterator.next();
                System.out.println("Reproduciendo: " + cancion);
            } else {
                System.out.println("Has llegado al final");
                listIterator.previous();
                adelante = false;
            }
        } else {
            listIterator.next();
            adelante = true;
            if (listIterator.hasNext()){
                Cancion cancion = listIterator.next();
                System.out.println("Reproduciendo: " + cancion);
            } else {
                System.out.println("Has llegado al final");
                listIterator.previous();
                adelante = false;
            }
        }
    }

    public static void prevCancion(ListIterator<Cancion> listIterator){
        if (adelante){
            listIterator.previous();
            adelante = false;
            if (listIterator.hasPrevious()){
                Cancion cancion = listIterator.previous();
                System.out.println("Reproduciendo: " + cancion);
            } else {
                System.out.println("Has llegado al principio");
                listIterator.next();
                adelante = true;
            }
        } else {
            if (listIterator.hasPrevious()){
                Cancion cancion = listIterator.previous();
                System.out.println("Reproduciendo: " + cancion);
            } else {
                System.out.println("Has llegado al principio");
                listIterator.next();
                adelante = true;
            }
        }
    }

    public static void repetirCancion(ListIterator<Cancion> listIterator){
        if (adelante){
            Cancion cancion = listIterator.previous();
            System.out.println("Reproduciendo: " + cancion);
            listIterator.next();
        } else {
            Cancion cancion = listIterator.next();
            System.out.println("Reproduciendo: " + cancion);
            listIterator.previous();
        }
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
        System.out.println("------");

        int opcion = 6;
        do {
            try {
                menu();
                opcion = sc.nextInt();
                sc.nextLine();
                opciones(opcion, listIterator);
            } catch (InputMismatchException e) {
                System.out.println("No se pueden usar letras ni caractéres especiales.");
                System.out.println("------");
                sc.nextLine();
            }
        } while (opcion != 0);
    }
}
