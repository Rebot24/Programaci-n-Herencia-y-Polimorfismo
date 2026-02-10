package UD6Tarea1_ArrayList.Ejercicio1;

public class Contacto {
    private String name, phoneNumber;

    public Contacto(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacto createContact(String name, String phoneNumber) {
        return new Contacto(name, phoneNumber);
    }

    @Override
    public String toString() {
        return name + " " + phoneNumber;
    }
}
