package feature;

import core.Ejecutable;
import core.polimorfismo.Circulo;
import core.polimorfismo.Figura;
import core.polimorfismo.Rectangulo;
import utils.ContextColor;
import utils.UtilsColor;

import java.awt.*;
import java.util.ArrayList;

public class FigurasGeomMetodosAbstractos implements Ejecutable {
    @Override

    public void execute() {
        ArrayList<Figura> figuras = new ArrayList<>();

        // construcción de objetos
        Circulo circuloUno = new Circulo("Circulo", 3.00);
        Rectangulo rectanguloUno = new Rectangulo("Rectángulo",2.00, 3.00);
        Circulo circuloDos = new Circulo("Circulo", 4.00);
        Rectangulo rectanguloDos = new Rectangulo("Rectángulo",2.45, 3.10);
        Circulo circuloTres = new Circulo("Circulo", 2.00);
        Rectangulo rectanguloTres = new Rectangulo("Rectángulo",4.00, 5.00);
        Circulo circuloCuatro = new Circulo("Circulo", 1.50);
        Rectangulo rectanguloCuatro = new Rectangulo("Rectángulo",6.10, 1.25);
        Circulo circuloCinco = new Circulo("Circulo", 3.25);
        Rectangulo rectanguloCinco = new Rectangulo("Rectángulo",2.35, 2.45);

        figuras.add(circuloUno);
        figuras.add(circuloDos);
        figuras.add(circuloTres);
        figuras.add(circuloCuatro);
        figuras.add(circuloCinco);
        figuras.add(rectanguloUno);
        figuras.add(rectanguloDos);
        figuras.add(rectanguloTres);
        figuras.add(rectanguloCuatro);
        figuras.add(rectanguloCinco);

        UtilsColor.imprimirEncabezado();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Listado de figuras con cálculo de área");
        for (Figura figura : figuras) {
            UtilsColor.imprimirBloque(ContextColor.DEFAULT,figura.mostrarDatos());
        }
    }
}
