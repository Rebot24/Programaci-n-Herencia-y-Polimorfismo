package UT5_Herencia_Y_Polimorfismo.Actividad5_Abstract.Ejercicio2;

public class SalaryEmployee extends Employee {
    private double salario;

    public SalaryEmployee(String nombre, String cargo,  double salario) {
        super(nombre, cargo);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calculateWeeklyPay() {
        return salario;
    }
}
