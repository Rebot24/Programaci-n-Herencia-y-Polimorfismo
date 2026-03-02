package UT6_Colecciones.Juego;

import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final Map<String, Jugador> jugadores = new LinkedHashMap<>();
    private static final Random random = new Random();

    public static void main(String[] args) {
        int opcion = 0;

        cargarPersonajes();
        Jugador jugador1 = pedirJugadorInicial();

        do {
            menu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: System.out.println(jugador1); break;
                case 2: jugar(jugador1); break;
            }
        } while (opcion != 3);
    }

    public static void cargarPersonajes() {
        jugadores.put("Sergio", new Jugador("Sergio", Jugador.Personaje.INVENTOR, 90));
        jugadores.put("Mara", new Jugador("Mara", Jugador.Personaje.GUERRERO, 80));
        jugadores.put("Miquel", new Jugador("Miquel", Jugador.Personaje.RASTREADOR, 85));
        jugadores.put("Claudia", new Jugador("Claudia", Jugador.Personaje.MAGO, 110));
        jugadores.put("Carlos", new Jugador("Carlos", Jugador.Personaje.SABIO, 95));
        jugadores.put("Alexia", new Jugador("Alexia", Jugador.Personaje.EXPLORADOR, 100));
    }

    public static Jugador pedirJugadorInicial() {
        Jugador jugador = null;

        while (jugador == null) {
            System.out.println("Jugadores disponibles: " + jugadores.keySet());

            System.out.print("Introduce jugador inicial: ");
            String nombre = sc.nextLine();

            jugador = jugadores.get(nombre);

            if (jugador == null) {
                System.out.println("Jugador no existe.");
            }
        }

        return jugador;
    }

    private static void menu() {
        System.out.println("\n1 - Imprimir datos");
        System.out.println("2 - Jugar");
        System.out.println("3 - Salir");
        System.out.print("Elige opción: ");
    }

    private static void jugar(Jugador jugador1) {
        Jugador jugador2 = null;

        System.out.print("Jugadores disponibles: ");
        while (jugador2 == null) {
            for (Jugador jugador : jugadores.values()) {
                if (!(jugador.getNombre().equalsIgnoreCase(jugador1.getNombre()))) {
                    System.out.println(jugador.getNombre());
                }
            }

            System.out.print("Introduce jugador 2: ");
            String nombre = sc.nextLine();

            jugador2 = jugadores.get(nombre);

            if (jugador2 == null || jugador2 == jugador1) {
                System.out.println("Jugador no válido.");
                jugador2 = null;
            }
        }

        ArrayList<String> mochila1 = new ArrayList<>(jugador1.getMochila());
        ArrayList<String> mochila2 = new ArrayList<>(jugador2.getMochila());

        int gana1 = 0, gana2 = 0;

        Map<String, Integer> valores1 = asignarValores(jugador1);
        Map<String, Integer> valores2 = asignarValores(jugador2);

        while (gana1 < 2 && gana2 < 2) {
            String arma1, arma2;

            do {
                System.out.println(jugador1.getNombre() + ": " + mochila1);
                System.out.print("Elige una herramienta: ");
                arma1 = sc.nextLine();

                if (!(mochila1.contains(arma1))) {
                    System.out.println("Herramienta inválida.");
                }
            } while (!(mochila1.contains(arma1)));

            do {
                System.out.println(jugador2.getNombre() + ": " + mochila2);
                System.out.print("Elige una herramienta: ");
                arma2 = sc.nextLine();

                if (!(mochila2.contains(arma2))) {
                    System.out.println("Herramienta inválida.");
                }
            } while (!(mochila2.contains(arma2)));

            int valor1 = valores1.get(arma1), valor2 = valores2.get(arma2);

            if (valor1 > valor2) {
                mochila1.remove(arma1);
                gana1++;
                System.out.println("El jugador 1 gana la ronda y pierde su herramienta.");
            } else if (valor2 > valor1) {
                mochila2.remove(arma2);
                gana2++;
                System.out.println("El jugador 2 gana la ronda y pierde su herramienta.");
            } else {
                System.out.println("Habéis empatado esta ronda.");
            }
        }

        if (gana1 == 2) {
            jugador1.aumentarVida();
            System.out.println("El jugador 1 ha ganado la partida y ha conseguido 10 de vida extra.");
        } else {
            jugador2.aumentarVida();
            System.out.println("El jugador 2 ha ganado la partida y ha conseguido 10 de vida extra.");
        }
    }

    public static HashMap<String, Integer> asignarValores(Jugador jugador) {
        HashMap<String, Integer> valores = new HashMap<>();
        HashSet<Integer> usados = new HashSet<>();

        for (String herramienta : jugador.getMochila()) {
            int numero;

            do {
                numero = random.nextInt(4) + 1;
            } while (usados.contains(numero));

            usados.add(numero);
            valores.put(herramienta, numero);
        }

        return valores;
    }
}
