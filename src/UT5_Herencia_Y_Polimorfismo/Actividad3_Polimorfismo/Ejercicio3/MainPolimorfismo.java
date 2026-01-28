package UT5_Herencia_Y_Polimorfismo.Actividad3_Polimorfismo.Ejercicio3;

public class MainPolimorfismo {

    public static void main(String[] args) {

        Coche c1 = new Seat("Terraco", 4);
        Coche c2 = new Opel("Corsa", 3);
        Coche c3 = new Peugeot("3008", 4);

        Coche[] coches = { c1, c2, c3 };

        for (Coche c : coches) {
            System.out.println("Modelo: " + c.getModelo());
            System.out.println("Cilindros: " + c.getCilindros());
            System.out.println("Ruedas: " + c.getRuedas());
            System.out.println("Motor: " + c.getMotor());
            c.arrancar();
            c.acelerar();
            c.frenar();
            System.out.println();
        }
    }
}

class Coche {

    protected String modelo;
    protected boolean motor;
    protected int ruedas;
    protected int cilindros;

    public Coche(String modelo, int cilindros) {
        this.modelo = modelo;
        this.cilindros = cilindros;
        this.ruedas = 4;
        this.motor = true;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean getMotor() {
        return motor;
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void arrancar() {
        System.out.println("El coche arranca");
    }

    public void acelerar() {
        System.out.println("El coche acelera");
    }

    public void frenar() {
        System.out.println("El coche frena");
    }
}

class Seat extends Coche {

    public Seat(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    public void arrancar() {
        System.out.println("El Seat arranca suavemente");
    }
}

class Opel extends Coche {

    public Opel(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    public void acelerar() {
        System.out.println("El Opel acelera con potencia");
    }
}

class Peugeot extends Coche {

    public Peugeot(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    public void frenar() {
        System.out.println("El Peugeot frena de forma progresiva");
    }
}
