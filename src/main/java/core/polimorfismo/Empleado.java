package core.polimorfismo;

public abstract class Empleado {
    private String nombre;

    Empleado(String nombre) {
        this.nombre = nombre;
    }

    abstract public double calcularSueldo();

    public String getNombre() {
        return nombre;
    }
}
