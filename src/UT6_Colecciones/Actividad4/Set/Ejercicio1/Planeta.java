package UT6_Colecciones.Actividad4.Set.Ejercicio1;

public class Planeta extends CuerpoCeleste{

    public Planeta(String nombre, double periodoOrbital) {
        super(nombre, periodoOrbital, TipoCuerpoCeleste.PLANETA);
    }

    @Override
    public boolean addSatelite(CuerpoCeleste cuerpoCeleste) {
        if (cuerpoCeleste.getTipoCuerpo() == TipoCuerpoCeleste.LUNA) {
            return super.addSatelite(cuerpoCeleste);
        } else return false;
    }
}