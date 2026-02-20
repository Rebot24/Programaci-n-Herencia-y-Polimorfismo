package UT6_Colecciones.Actividad3.Map.Ejercicio1;

import java.util.*;

public class Main {
    private static Map<Integer, Ubicacion> ubicaciones;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ubicaciones = new LinkedHashMap<>();

        ubicaciones.put(0, new Ubicacion(0, "Estás sentado en la clase de programación"));
        ubicaciones.put(1, new Ubicacion(1, "Estás en la cima de una montaña"));
        ubicaciones.put(2, new Ubicacion(2, "Estás bañándote en la playa"));
        ubicaciones.put(3, new Ubicacion(3, "Estás dentro de un edificio muy alto"));
        ubicaciones.put(4, new Ubicacion(4, "Estás de pie en un puente"));
        ubicaciones.put(5, new Ubicacion(5, "Estás en un bosque"));

        //montaña
        ubicaciones.get(1).addExit("N", 5);
        ubicaciones.get(1).addExit("S", 4);
        ubicaciones.get(1).addExit("E", 3);
        ubicaciones.get(1).addExit("O", 2);

        //playa
        ubicaciones.get(2).addExit("N", 5);
        ubicaciones.get(2).addExit("S", 4);
        ubicaciones.get(2).addExit("E", 1);

        //edificio
        ubicaciones.get(3).addExit("O", 1);

        //puente
        ubicaciones.get(4).addExit("N", 1);
        ubicaciones.get(4).addExit("O", 2);

        //bosque
        ubicaciones.get(5).addExit("S", 1);
        ubicaciones.get(5).addExit("O", 2);

        for (Ubicacion ubicacion : ubicaciones.values()) {
            if (ubicacion.getId() != 0) {
                ubicacion.addExit("Q", 0);
            }
        }

        int ubicacion = 1;

        while (ubicacion != 0) {
            System.out.println(ubicaciones.get(ubicacion).getDescripcion());

            System.out.print("Tus salidas válidas son ");
            for (String direccion : ubicaciones.get(ubicacion).getExits().keySet()) {
                System.out.print(direccion + " ");
            }

            System.out.println();
            System.out.print("Introduce dirección: ");
            String direccion = sc.nextLine().toUpperCase();

            if (ubicaciones.get(ubicacion).getExits().containsKey(direccion)) {
                ubicacion = ubicaciones.get(ubicacion).getExits().get(direccion);
                System.out.println("------");
            } else {
                System.out.println("No puedes ir en esa dirección.");
                System.out.println("------");
            }
        }
    }
}
