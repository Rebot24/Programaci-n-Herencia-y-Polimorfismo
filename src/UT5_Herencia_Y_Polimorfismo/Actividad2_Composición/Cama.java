package UT5_Herencia_Y_Polimorfismo.Actividad2_Composición;

public class Cama {
    private String estilo;
    private int almohadas, altura, sabanas, cocha;

    public Cama(String estilo,  int almohadas, int altura, int sabanas, int cocha) {
        this.estilo = estilo;
        this.almohadas = almohadas;
        this.altura = altura;
        this.sabanas = sabanas;
        this.cocha = cocha;
    }

    public void hacer(){
        System.out.println("Se ha hecho la cama.");
    }

    public String getEstilo() {
        return estilo;
    }

    public int getAlmohadas() {
        return almohadas;
    }

    public int getSabanas() {
        return sabanas;
    }

    public int getAltura() {
        return altura;
    }

    public int getCocha() {
        return cocha;
    }
}
