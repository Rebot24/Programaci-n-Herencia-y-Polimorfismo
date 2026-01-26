package UT5_Herencia_Y_Polimorfismo.Actividad2_Composición;

public class Main {
    static void main() {
        // Crear objetos necesarios
        Lampara lampara = new Lampara("Moderna", true, 9);
        Cama cama = new Cama("Minimalista", 2, 50, 1, 1);
        Techo techo = new Techo(300, 1);

        Pared pared1 = new Pared("Norte");
        Pared pared2 = new Pared("Sur");
        Pared pared3 = new Pared("Este");
        Pared pared4 = new Pared("Oeste");

        Habitacion habitacion = new Habitacion("Dormitorio", pared1, pared2, pared3, pared4, techo, cama, lampara);
        habitacion.hacerLaCama();
        habitacion.getLampara().encender();
    }
}
