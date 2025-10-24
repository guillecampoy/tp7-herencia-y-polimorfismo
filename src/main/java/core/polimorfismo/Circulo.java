package core.polimorfismo;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        // PI*r^2
        return Math.PI*radio*radio;
    }
}
