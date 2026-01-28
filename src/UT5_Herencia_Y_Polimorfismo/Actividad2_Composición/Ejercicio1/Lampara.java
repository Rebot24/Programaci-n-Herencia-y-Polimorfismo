package UT5_Herencia_Y_Polimorfismo.Actividad2_Composición.Ejercicio1;

public class Lampara {
    private String estilo;
    private boolean bateria;
    private int calificacion;

    public Lampara(String estilo, boolean bateria, int calificacion) {
        this.estilo = estilo;
        this.bateria = bateria;
        this.calificacion = calificacion;
    }

    public void encender(){
        System.out.println("Encendendo la lampara...");
        try {
            Thread.sleep(2000);
            System.out.println("Has encendido la lampara.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getEstilo() {
        return estilo;
    }

    public boolean hayBateria() {
        return bateria;
    }

    public int getCalificacion() {
        return calificacion;
    }
}
