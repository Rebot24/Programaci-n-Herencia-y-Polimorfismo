package UT5_Herencia_Y_Polimorfismo.Actividad5_Abstract.Ejercicio2;

public class HourlyEmployee extends Employee {
    private double tasa_pago, horas_trabajadas;

    public HourlyEmployee(String nombre, String cargo, double tasa_pago, double horas_trabajadas) {
        super(nombre, cargo);
        this.tasa_pago = tasa_pago;
        this.horas_trabajadas = horas_trabajadas;
    }

    public double calculateWeeklyPay(){
        return  horas_trabajadas * tasa_pago;
    }
}
