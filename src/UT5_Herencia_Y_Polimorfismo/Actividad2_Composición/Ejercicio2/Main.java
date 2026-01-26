package UT5_Herencia_Y_Polimorfismo.Actividad2_Composición.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa(new Puerta(false));
        casa.getPuerta().abrir();
    }
}