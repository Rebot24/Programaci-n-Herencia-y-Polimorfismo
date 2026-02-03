package UT5_Herencia_Y_Polimorfismo.Actividad4_Interfaces.Ejemplo;

public class Main {
    public static void main(String[] args) {
        //podemos crear una dinamita y explotarla
        Dinamita dim1=new Dinamita("DinamitaCat1");
        dim1.explotar();
        //podemos crear madera y quemarla
        Madera mad1=new Madera("Pino");
        mad1.incinerar();
        //podemos crear butano y explotarlo y quemarlo
        Butano but1=new Butano("But10Litros");
        but1.incinerar();
        but1.explotar();
        //pero no podemos crear cesped que se queme o explote
        Cesped cesp1=new Cesped("artificial");

    }
}
