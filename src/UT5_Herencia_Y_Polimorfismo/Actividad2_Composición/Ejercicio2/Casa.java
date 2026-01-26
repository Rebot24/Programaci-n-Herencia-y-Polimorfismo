package UT5_Herencia_Y_Polimorfismo.Actividad2_Composición.Ejercicio2;

public class Casa {
    private Puerta puerta;

    public Casa(Puerta puerta) {
        this.puerta = puerta;
    }

    // Getter para acceder a la parte
    public Puerta getPuerta() {
        return puerta;
    }
}