package UT6_Colecciones.Vuelos;

import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static ArrayList<Vuelos> vuelos = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;

        vuelos.add(new Vuelos("2023-01", "Valencia", "Menorca", "15-08", Vuelos.Clase.TURISTA));
        vuelos.add(new Vuelos("2023-02", "Valencia", "Tenerife", "20-08", Vuelos.Clase.TURISTA));
        vuelos.add(new Vuelos("2023-03", "París", "Valencia", "15-08", Vuelos.Clase.PRIMERA));
        vuelos.add(new Vuelos("2023-04", "Atenas", "Valencia", "20-08", Vuelos.Clase.PRIMERA));

        do {
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();
            eleccion(opcion);
        } while (opcion != 0);
    }

    public static void menu(){
        System.out.println("=======================================");
        System.out.println("   VUELOS DEL ÁEROPUERTO DE VALENCIA   ");
        System.out.println("=======================================");
        System.out.println(" 1 - Imprimir todos los vuelos");
        System.out.println(" 2 - Buscar un número de vuelo");
        System.out.println(" 3 - Buscar vuelo por clave");
        System.out.println(" 4 - Añadir vuelo nuevo");
        System.out.println(" 5 - Borrar vuelo por número");
        System.out.println(" 0 - SALIR");
        System.out.println("-----------------------------");
        System.out.print("Dame la opción: ");
    }

    public static void eleccion(int opcion){
        switch (opcion){
            case 1: imprimir(); System.out.println(); break;
            case 2: buscarNumero(); System.out.println(); break;
            case 3: buscarClave(); System.out.println(); break;
            case 4: anadirVuelo(); System.out.println(); break;
        }
    }

    public static void imprimir(){
        if (vuelos.isEmpty()) {
            System.out.println("No existen vuelos.");
            return;
        }

        for (Vuelos vuelo : vuelos) {
            System.out.println(vuelo);
        }
    }

    public static void buscarNumero(){
        System.out.println("BUSCAR VUELO POR Nº:");

        if (vuelos.isEmpty()){
            System.out.println("No existen vuelos.");
            return;
        }

        System.out.print("Número de vuelo: ");
        String numero = sc.nextLine();

        for (Vuelos vuelo : vuelos) {
            if (vuelo.getNumero().equalsIgnoreCase(numero)){
                System.out.println(vuelo);
                return;
            }
        }

        System.out.println("El número de vuelo no existe.");
    }

    public static void buscarClave(){
        System.out.println("BUSCAR VUELO POR CLAVE:");

        if (vuelos.isEmpty()){
            System.out.println("No existen vuelos.");
            return;
        }

        System.out.print("Clave: ");
        String clave = sc.nextLine();

        String valor = "";
        int contador = 0;
        if (clave.equalsIgnoreCase("origen")) {
            System.out.print("Valor: ");
            valor = sc.nextLine();
            for (Vuelos vuelo : vuelos) {
                if (vuelo.getOrigen().equalsIgnoreCase(valor)){
                    System.out.println("\nDatos del vuelo:");
                    System.out.println(vuelo);
                    contador++;
                }
            }
            if (contador == 0) System.out.println("No existen datos para (" + clave + " = " + valor + ").");
        } else if (clave.equalsIgnoreCase("destino")) {
            System.out.print("Valor: ");
            valor = sc.nextLine();
            for (Vuelos vuelo : vuelos) {
                if (vuelo.getDestino().equalsIgnoreCase(valor)){
                    System.out.println("\nDatos del vuelo:");
                    System.out.println(vuelo);
                    contador++;
                }
            }
            if (contador == 0) System.out.println("No existen datos para (" + clave + " = " + valor + ").");
        } else if (clave.equalsIgnoreCase("dia")) {
            System.out.print("Valor: ");
            valor = sc.nextLine();
            for (Vuelos vuelo : vuelos) {
                if (vuelo.getDia().equalsIgnoreCase(valor)){
                    System.out.println("\nDatos del vuelo:");
                    System.out.println(vuelo);
                    contador++;
                }
            }
            if (contador == 0) System.out.println("No existen datos para (" + clave + " = " + valor + ").");
        }  else if (clave.equalsIgnoreCase("numero")) {
            System.out.print("Valor: ");
            valor = sc.nextLine();
            for (Vuelos vuelo : vuelos) {
                if (vuelo.getNumero().equalsIgnoreCase(valor)){
                    System.out.println("\nDatos del vuelo:");
                    System.out.println(vuelo);
                    contador++;
                }
            }
            if (contador == 0) System.out.println("No existen datos para (" + clave + " = " + valor + ").");
        } else if (clave.equalsIgnoreCase("clase")) {
            System.out.print("Valor: ");
            valor = sc.nextLine();
            for (Vuelos vuelo : vuelos) {
                if (vuelo.getClase().toString().equalsIgnoreCase(valor)){
                    System.out.println("\nDatos del vuelo:");
                    System.out.println(vuelo);
                    contador++;
                }
            }
            if (contador == 0) System.out.println("No existen datos para (" + clave + " = " + valor + ").");
        } else {
            System.out.println("Lo siento pero la clave no existe.");
        }
    }

    public static void anadirVuelo(){
        System.out.println("AÑADIR NUEVO VUELO:");
        String numero, origen, destino, dia, clase;

        do {
            System.out.print("Número: ");
            numero = sc.nextLine();
        } while (!numero.matches("\\d{4}-\\d{2}"));

        System.out.print("Origen: ");
        origen = sc.nextLine();

        System.out.print("Destino: ");
        destino = sc.nextLine();

        do {
            System.out.print("Dia (dd-mm): ");
            dia = sc.nextLine();
        } while (!dia.matches("\\d{2}-\\d{2}"));

        do {
            System.out.println("Clase: ");
            clase = sc.nextLine();
        } while (!clase.equalsIgnoreCase("Primera") &&  !clase.equalsIgnoreCase("Turista"));

        if (clase.equalsIgnoreCase("Primera")) {
            vuelos.add(new Vuelos(numero, origen, destino, dia, Vuelos.Clase.PRIMERA));
        } else {
            vuelos.add(new Vuelos(numero, origen, destino, dia, Vuelos.Clase.TURISTA));
        }
        System.out.println("Vuelo añadido a la lista.");
    }

    public static void borrarVuelo(){

    }
}
