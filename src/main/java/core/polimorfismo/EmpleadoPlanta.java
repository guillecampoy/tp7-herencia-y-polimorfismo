package core.polimorfismo;

public class EmpleadoPlanta extends Empleado {
    private double sueldo;

    public EmpleadoPlanta(String nombre, double salario) {
        super(nombre);
        this.sueldo = salario;
    }

    @Override
    public double calcularSueldo() {
        return sueldo;
    }
}
