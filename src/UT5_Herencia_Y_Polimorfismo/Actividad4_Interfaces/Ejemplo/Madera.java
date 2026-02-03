package UT5_Herencia_Y_Polimorfismo.Actividad4_Interfaces.Ejemplo;

public class Madera extends Cubo implements Inicinerable{
    public Madera(String nombre) {
        super(nombre);
    }

    @Override
    public void incinerar() {
        System.out.println("fuegooooo!!!");
    }
}
