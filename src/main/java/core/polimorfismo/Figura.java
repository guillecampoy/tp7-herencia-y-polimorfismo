package core.polimorfismo;

public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    abstract public double calcularArea();
    public String mostrarDatos() {
        return "Nombre: "+nombre.toUpperCase()+" Area: "+String.format("%.2f", calcularArea());
    }
}
