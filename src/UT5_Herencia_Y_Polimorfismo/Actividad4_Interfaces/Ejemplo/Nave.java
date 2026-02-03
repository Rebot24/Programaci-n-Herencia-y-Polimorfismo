package UT5_Herencia_Y_Polimorfismo.Actividad4_Interfaces.Ejemplo;

public class Nave implements Explotable{
    String nombre;
    @Override
    public void explotar() {
        System.out.println("Exxxxxploooosiooooon!!!!");
    }
}
