package feature;

import core.Ejecutable;
import core.herencia.Auto;
import utils.UtilsColor;

public class VehiculoHerenciaBasica implements Ejecutable {
    @Override
    public void execute() {

        // Atributos clase y sub clase
        String marca = "AUDI";
        String modelo = "Coupe";
        int cantidadPuertas = 2;

        // Consrucción Auto
        Auto auto = new Auto(marca, modelo, cantidadPuertas);

        UtilsColor.imprimirEncabezado();
        auto.mostrarIndo();
    }
}
