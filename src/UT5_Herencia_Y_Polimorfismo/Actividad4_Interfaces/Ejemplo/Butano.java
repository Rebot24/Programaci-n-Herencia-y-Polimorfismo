package UT5_Herencia_Y_Polimorfismo.Actividad4_Interfaces.Ejemplo;

public class Butano extends Cubo implements Inicinerable,Explotable{
    public Butano(String nombre) {
        super(nombre);
    }

    @Override
    public void explotar() {
        System.out.println("Bataboooo!!!");
    }

    @Override
    public void incinerar() {
        System.out.println("Fuegoonnnn!!!");
    }
}
