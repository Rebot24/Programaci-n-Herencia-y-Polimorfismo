package UT5_Herencia_Y_Polimorfismo.Actividad2_Composición.Ejercicio2;

public class Puerta {
    private boolean abierta;

    public Puerta(boolean abierta) {
        this.abierta = abierta;
    }

    public void abrir() {
        abierta = true;
        System.out.println("La puerta se ha abierto");
    }

    public boolean isAbierta() {
        return abierta;
    }
}