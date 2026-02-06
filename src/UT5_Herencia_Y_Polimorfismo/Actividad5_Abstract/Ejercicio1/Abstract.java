package UT5_Herencia_Y_Polimorfismo.Actividad5_Abstract.Ejercicio1;

public abstract class Abstract {
    public Abstract() {
        System.out.println("Este es un constructor de clase abstracta");
    }

    public abstract void abstract_method();

    public void noAbstract_method(){
        System.out.println("Este es un método normal de clase abstracta");
    }
}
