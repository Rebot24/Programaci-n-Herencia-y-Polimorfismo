package UT5_Herencia_Y_Polimorfismo.Actividad2_Composición.Ejercicio3;

public class MainEncapsulacion {
    public static void main(String[] args) {
        Impresora impresora = new Impresora(50, true);

        System.out.println("Tóner actual: " + impresora.setToner(20));
        System.out.println("Páginas para imprimir: " + impresora.imprimir(7));
        System.out.println("Total páginas impresas: " + impresora.getpImpresas());
        System.out.println("Páginas para imprimir: " + impresora.imprimir(7));
        System.out.println("Total páginas impresas: " + impresora.getpImpresas());
    }
}
