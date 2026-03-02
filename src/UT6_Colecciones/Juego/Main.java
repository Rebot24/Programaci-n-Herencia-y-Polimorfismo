package UT6_Colecciones.Juego;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Jugador> jugadores = new ArrayList<>();
    private static String nomJug;
    private static boolean jugado = false;

    static void main(String[] args) {
        jugadores.add(new Jugador("Sergio", Jugador.Personaje.INVENTOR, 90));
        jugadores.add(new Jugador("Mara", Jugador.Personaje.GUERRERO, 80));
        jugadores.add(new Jugador("Miquel", Jugador.Personaje.RASTREADOR, 85));
        jugadores.add(new Jugador("Claudia", Jugador.Personaje.MAGO, 110));
        jugadores.add(new Jugador("Carlos", Jugador.Personaje.SABIO, 95));
        jugadores.add(new Jugador("Alexia", Jugador.Personaje.EXPLORADOR, 100));

        boolean existe = false;
        int eleccion;

        do {
            if (!jugado) {
                do {
                    for (Jugador jugador : jugadores) {
                        System.out.println(jugador);
                    }
                    System.out.println();

                    System.out.print("Ingrese el nombre del personaje principal: ");
                    nomJug = sc.nextLine();

                    for (Jugador jugador : jugadores) {
                        if (jugador.getNombre().equalsIgnoreCase(nomJug)) {
                            existe = true;
                            System.out.println("Se ha encontrado el jugador correctamente.");
                        }
                    }
                    jugado = true;
                } while (!existe);
            }

            menu();
            eleccion = sc.nextInt();

            elecciones(eleccion);
        } while (eleccion != 3);
    }

    public static void menu(){
        System.out.println("=======================================");
        System.out.println("   VUELOS DEL ÁEROPUERTO DE VALENCIA   ");
        System.out.println("=======================================");
        System.out.println(" 1 - Imprimir todos tus datos");
        System.out.println(" 2 - Jugar");
        System.out.println(" 3 - Salir");
        System.out.println("-----------------------------");
        System.out.print("Dame la opción: ");
    }

    public static void elecciones(int eleccion) {
        switch (eleccion) {
            case 1: System.out.println(); imprimirDatos(); break;
            case 2: System.out.println(); jugar(); break;
            case 3: break;
            default: System.out.println("Eso no es una elección válida.");
        }
    }

    public static void imprimirDatos() {
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equals(nomJug)) {
                System.out.println(jugador);
            }
        }
    }

    public static void jugar() {
        sc.nextLine();

        boolean existe = false;
        String nomJug2;

        do {
            for (Jugador jugador : jugadores) {
                if (!(jugador.getNombre().equals(nomJug))) System.out.println(jugador);
            }
            System.out.println();

            System.out.print("Ingrese el nombre del personaje del jugador 2: ");
            nomJug2 = sc.nextLine();

            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equalsIgnoreCase(nomJug2) && !(jugador.getNombre().equalsIgnoreCase(nomJug))) {
                    existe = true;
                    System.out.println("Se ha encontrado el jugador correctamente.");
                }
            }

            if (nomJug.equals(nomJug2)) {
                System.out.println("No se puede escoger el mismo jugador.");
            }
        } while (!existe);

        int jug1Arm1, jug1Arm2, jug1Arm3, jug1Arm4, jug2Arm1, jug2Arm2, jug2Arm3, jug2Arm4;
        String arma1, arma2;

        do {
            jug1Arm1 = (int) (Math.random() * 10);
            jug1Arm2 = (int) (Math.random() * 10);
            jug1Arm3 = (int) (Math.random() * 10);
            jug1Arm4 = (int) (Math.random() * 10);
        } while (jug1Arm1 > 0 && jug1Arm1 < 5 &&  jug1Arm2 > 0 && jug1Arm2 < 5 &&  jug1Arm3 > 0 && jug1Arm3 < 5 && jug1Arm4 > 0 && jug1Arm4 < 5 && jug1Arm1 != jug1Arm2 && jug1Arm1 !=  jug1Arm3 && jug1Arm1 != jug1Arm4 && jug1Arm2 != jug1Arm3 &&  jug1Arm2 != jug1Arm4 &&  jug1Arm3 != jug1Arm4);

        do {
            jug2Arm1 = (int) (Math.random() * 10);
            jug2Arm2 = (int) (Math.random() * 10);
            jug2Arm3 = (int) (Math.random() * 10);
            jug2Arm4 = (int) (Math.random() * 10);
        } while (jug2Arm1 > 0 && jug2Arm1 < 5 &&  jug2Arm2 > 0 && jug2Arm2 < 5 &&  jug2Arm3 > 0 && jug2Arm3 < 5 && jug2Arm4 > 0 && jug2Arm4 < 5 && jug2Arm1 != jug2Arm2 && jug2Arm1 !=  jug2Arm3 && jug2Arm1 != jug2Arm4 && jug2Arm2 != jug2Arm3 &&  jug2Arm2 != jug2Arm4 &&  jug2Arm3 != jug2Arm4);

        boolean valida = false;
        int buscarArma1 = 0, buscarArma2 = 0;
        do {
            System.out.println("Jugador1:");

            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equals(nomJug)) {
                    System.out.println(jugador.getMochila());
                }
            }

            System.out.print("Introduce la herramienta que quieres usar: ");
            arma1 = sc.nextLine();

            for (Jugador jugador : jugadores) {
                for (buscarArma1 = 0; buscarArma1 < jugador.getMochila().size(); buscarArma1++) {
                    if (jugador.getMochila().get(buscarArma1).equals(arma1)) {
                        System.out.println("Arma válida");
                        valida = true;
                    }
                }
            }

            if (!valida) {
                System.out.println("Esa arma no está disponible.");
            }
        } while (!valida);
        valida = false;

        if (buscarArma1 == 1) {
            buscarArma1 = jug1Arm1;
        } else if (buscarArma1 == 2) {
            buscarArma1 = jug1Arm2;
        }  else if (buscarArma1 == 3) {
            buscarArma1 = jug1Arm3;
        } else {
            buscarArma1 = jug1Arm4;
        }

        do {
            System.out.println("Jugador2:");

            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equals(nomJug)) {
                    System.out.println(jugador.getMochila());
                }
            }

            System.out.print("Introduce la herramienta que quieres usar: ");
            arma1 = sc.nextLine();

            for (Jugador jugador : jugadores) {
                for (buscarArma2 = 0; buscarArma2 < jugador.getMochila().size(); buscarArma2++) {
                    if (jugador.getMochila().get(buscarArma2).equals(arma1)) {
                        System.out.println("Arma válida");
                        valida = true;
                    }
                }
            }

            if (!valida) {
                System.out.println("Esa arma no está disponible.");
            }
        } while (!valida);

        if (buscarArma2 == 1) {
            buscarArma2 = jug2Arm1;
        } else if (buscarArma2 == 2) {
            buscarArma2 = jug2Arm2;
        }  else if (buscarArma2 == 3) {
            buscarArma2 = jug2Arm3;
        } else {
            buscarArma2 = jug2Arm4;
        }

        if (buscarArma1 > buscarArma2) {
            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equals(nomJug)) {
                    jugador.getMochila().remove(buscarArma1);
                }
            }
        } else if (buscarArma1 < buscarArma2) {
            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equals(nomJug2)) {
                    jugador.getMochila().remove(buscarArma2);
                }
            }
        }

        jugado = false;
    }
}
