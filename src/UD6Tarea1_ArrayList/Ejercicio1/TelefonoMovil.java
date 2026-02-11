package UD6Tarea1_ArrayList.Ejercicio1;

import java.util.ArrayList;

public class TelefonoMovil {
    private String myNumber;
    private ArrayList<Contacto> myContacts;

    public TelefonoMovil(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacto>();
    }

    public boolean addNewContact(Contacto newContact) {
        if (findContact(newContact) >= 0) return false;
        myContacts.add(newContact);
        return true;
    }

    public boolean updateContact(Contacto oldContact, Contacto newContact) {
        if (findContact(newContact) >= 0) return false;
        else if (findContact(oldContact) >= 0) {
            myContacts.remove(oldContact);
            myContacts.add(newContact);
            return true;
        } else return false;
    }

    public boolean removeContact(Contacto oldContact) {
        if (findContact(oldContact) < 0) return false;
        myContacts.remove(oldContact);
        return true;
    }

    private int findContact(Contacto newContact) {
        return myContacts.indexOf(newContact);
    }

    private int findContact(String name) {
        for (Contacto contact : myContacts) {
            if (contact.getName().equals(name)) return findContact(contact);
        }
        return -1;
    }

    public Contacto queryContact(String name) {
        for (Contacto contacto : myContacts) {
            if (contacto.getName().equals(name)) {
                return contacto;
            }
        }
        return null;
    }

    public void printContacts() {
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.print(myContacts.get(i).getName());
            System.out.print(" \uF0E0 ");
            System.out.println(myContacts.get(i).getPhoneNumber());
        }
    }
}