package feature;

import core.Ejecutable;
import core.polimorfismo.Circulo;
import core.polimorfismo.Figura;
import core.polimorfismo.Rectangulo;
import utils.ContextColor;
import utils.UtilsColor;
import java.util.ArrayList;

public class FigurasGeomMetodosAbstractos implements Ejecutable {
    @Override

    public void execute() {
        ArrayList<Figura> figuras = new ArrayList<>();

        // construcción de objetos
        figuras.add( new Circulo("Circulo", 3.00));
        figuras.add( new Rectangulo("Rectángulo",2.00, 3.00));
        figuras.add( new Circulo("Circulo", 4.00));
        figuras.add( new Rectangulo("Rectángulo",2.45, 3.10));
        figuras.add( new Circulo("Circulo", 2.00));
        figuras.add( new Rectangulo("Rectángulo",4.00, 5.00));
        figuras.add( new Circulo("Circulo", 1.50));
        figuras.add( new Rectangulo("Rectángulo",6.10, 1.25));
        figuras.add( new Circulo("Circulo", 3.25));
        figuras.add( new Rectangulo("Rectángulo",2.35, 2.45));

        UtilsColor.imprimirBloque(ContextColor.INFO, "Listado de figuras con cálculo de área");
        for (Figura figura : figuras) {
            UtilsColor.imprimirBloque(ContextColor.DEFAULT,figura.mostrarDatos());
        }
    }
}
