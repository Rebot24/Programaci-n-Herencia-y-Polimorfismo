package UT6_Colecciones.Vuelos;

import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Map<String, Vuelos> vuelos =  new LinkedHashMap<>();

    public static void main(String[] args) {
        int opcion;
        vuelos.put("2020-01", new Vuelos("2020-01", "Valencia", "Menorca", "15-08", Vuelos.Clase.TURISTA));
        vuelos.put("2020-02", new Vuelos("2020-02", "Valencia", "Tenerife", "20-08", Vuelos.Clase.TURISTA));
        vuelos.put("2020-03", new Vuelos("2020-03", "París", "Valencia", "15-08", Vuelos.Clase.PRIMERA));
        vuelos.put("2020-04", new Vuelos("2020-04", "Atenas", "Valencia", "20-08", Vuelos.Clase.PRIMERA));

        do {
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------");
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
            case 1: imprimir(); System.out.println("-----------------------------"); break;
            case 2: buscarNumero(); System.out.println("------------------------------"); break;
        }
    }

    public static void imprimir(){
        for(Vuelos vuelo: vuelos.values()){
            System.out.println(vuelo);
        }
    }

    public static void buscarNumero(){
        String numero;
        if (vuelos.isEmpty()) {
            System.out.println("No existen vuelos.");
        } else {
            System.out.println("BUSCAR VUELO POR Nº:");
            System.out.print("Número de vuelo: ");
            numero = sc.nextLine();
            sc.nextLine();

            if (vuelos.containsKey(numero)) {
                System.out.println(vuelos.get(numero));
            }
        }
    }
}
