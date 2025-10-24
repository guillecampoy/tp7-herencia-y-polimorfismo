package core.herencia;

import utils.ContextColor;
import utils.UtilsColor;

public class Auto extends Vehiculo {
    private int cantidadPuertas;
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarIndo() {
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Información del Auto");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Marca: " + this.getMarca());
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Modelo: " + this.getModelo());
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Cantidad puertas: " + this.cantidadPuertas);
    }
}
