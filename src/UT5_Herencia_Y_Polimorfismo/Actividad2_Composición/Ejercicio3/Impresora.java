package UT5_Herencia_Y_Polimorfismo.Actividad2_Composición.Ejercicio3;

public class Impresora {
    private int nivelToner;
    private int paginasImpresas;
    private boolean dobleCara;

    public Impresora(int nivelToner, boolean dobleCara) {
        if (nivelToner < 0 || nivelToner > 100) {
            this.nivelToner = 0;
        } else {
            this.nivelToner = nivelToner;
        }
        this.dobleCara = dobleCara;
        this.paginasImpresas = 0;
    }


    public int setToner(int cantidad) {
        if (cantidad < 0 || cantidad > 100 || nivelToner + cantidad > 100) return -1;
        nivelToner += cantidad;
        return nivelToner;
    }

    public int imprimir(int paginas){
        int hojasNecesarias;

        if (dobleCara){
            hojasNecesarias = (paginas + 1) / 2;
        } else {
            hojasNecesarias = paginas;
        }

        if (hojasNecesarias > nivelToner) return -1;

        nivelToner -= hojasNecesarias;
        paginasImpresas += paginas;

        return paginas;
    }

    public int getpImpresas() {
        return paginasImpresas;
    }
}