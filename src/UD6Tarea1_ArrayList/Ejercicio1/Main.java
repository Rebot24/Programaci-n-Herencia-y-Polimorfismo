package UD6Tarea1_ArrayList.Ejercicio1;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static TelefonoMovil telefonoMovil = new TelefonoMovil("673702903");

    public static void main(String[] args) {
        Contacto contacto1 = new Contacto("Daniela", "111111111");
        telefonoMovil.addNewContact(contacto1);
        Contacto contacto2 = new Contacto("Juan Pablo", "222222222");
        telefonoMovil.addNewContact(contacto2);
        Contacto contacto3 = new Contacto("Nortes", "333333333");
        telefonoMovil.addNewContact(contacto3);

        int opcion = 6;
        do {
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            opciones(opcion);
        } while (opcion != 0);
    }

    public static void menu() {
        System.out.println("0. Salir");
        System.out.println("1. Mostrar contactos");
        System.out.println("2. Agregar contacto");
        System.out.println("3. Actualizar contacto");
        System.out.println("4. Eliminar contacto");
        System.out.println("5. Buscar contacto");
        System.out.println("6. Volver al menu");
        System.out.print("Introduce una de las opciones :");
    }

    public static void opciones(int opcion) {
        switch (opcion) {
            case 1: telefonoMovil.printContacts(); break;
            case 2: agregacion(); break;
            case 3: actualizarContacto(); break;
            case 4: eliminarContacto(); break;
            case 5: buscarContacto(); break;
            case 0, 6: break;
            default: System.out.println("Opcion incorrecta");
        }
    }

    public static void agregacion() {
        System.out.print("Introduce el nombre del contacto: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el numero del contacto: ");
        String numero = sc.next();
        sc.nextLine();
        Contacto contacto = telefonoMovil.queryContact(nombre);
        if (contacto == null) {
            contacto = new Contacto(nombre, numero);
            telefonoMovil.addNewContact(contacto);
            System.out.println("Contacto agregado correctamente");
        } else  {
            System.out.println("El contacto ya existe");
        }

    }

    public static void actualizarContacto() {
        System.out.print("Introduce el nombre del contacto que quieres modificar: ");
        String nombre1 = sc.nextLine();
        Contacto oldContact = telefonoMovil.queryContact(nombre1);
        if (oldContact == null) {
            System.out.println("Contacto no encontrado");
        } else {
            System.out.print("Introduce el nombre del nuevo contacto: ");
            String nombre = sc.nextLine();
            System.out.print("Introduce el numero del nuevo contacto: ");
            String numero = sc.nextLine();

            Contacto newContact = telefonoMovil.queryContact(nombre);

            if (newContact == null) {
                newContact = new Contacto(nombre, numero);
                if (telefonoMovil.updateContact(oldContact, newContact)) {
                    System.out.println("Contacto actualizado correctamente");
                } else {
                    System.out.println("No se pudo actualizar el contacto");
                }
            } else  {
                System.out.println("El contacto ya existe");
            }
        }
    }

    public static void eliminarContacto() {
        System.out.print("Introduce el nombre del contacto que quieres eliminar: ");
        String nombre1 = sc.nextLine();
        Contacto contact = telefonoMovil.queryContact(nombre1);
        if (contact == null) {
            System.out.println("Contacto no encontrado");
        } else {
            if (telefonoMovil.removeContact(contact)) {
                System.out.println("Contacto eliminado correctamente");
            } else {
                System.out.println("No se pudo eliminar el contacto");
            }
        }
    }

    public static void buscarContacto() {
        System.out.print("Introduce el nombre del contacto que quieres buscar: ");
        String nombre1 = sc.nextLine();
        Contacto contact = telefonoMovil.queryContact(nombre1);
        if (contact == null) {
            System.out.println("Contacto no encontrado");
        } else {
            System.out.println(contact);
        }
    }
}