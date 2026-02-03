package UT5_Herencia_Y_Polimorfismo.Actividad4_Interfaces.Ejemplo;

public class Dinamita extends Cubo implements Explotable{
    public Dinamita(String nombre) {
        super(nombre);
    }

    @Override
    public void explotar() {
        System.out.println("Boooo!!!");
    }
}
