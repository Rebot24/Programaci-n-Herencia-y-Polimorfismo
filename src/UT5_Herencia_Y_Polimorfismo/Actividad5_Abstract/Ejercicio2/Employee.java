package UT5_Herencia_Y_Polimorfismo.Actividad5_Abstract.Ejercicio2;

public abstract class Employee {
    private String nombre, cargo;

    public Employee(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }
    public String getCargo() {
        return cargo;
    }

    public abstract double calculateWeeklyPay();
}
