package feature;

import core.Ejecutable;
import core.overrides.Animal;
import core.overrides.Gato;
import core.overrides.Perro;
import core.overrides.Vaca;
import utils.ContextColor;
import utils.UtilsColor;

import java.util.ArrayList;

public class AnimalesYComportamientoSobrecarg implements Ejecutable {
    @Override
    public void execute() {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Canino", "Labrador"));
        animales.add(new Gato("Felino", "Persa"));
        animales.add(new Vaca("Bovino", "Hereford"));

        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Listado animales");
        for(Animal animal : animales){
            UtilsColor.imprimirBloque(ContextColor.DEFAULT,"-------------------------" );
            UtilsColor.imprimirBloque(ContextColor.INFO, "Datos animal:");
            UtilsColor.imprimirBloque(ContextColor.DEFAULT, animal.infoAnimal()
                    +"\n Sonido: "+animal.hacerSonido()
                    +"\n Descripción: "+animal.describirAnimal());
        }
    }
}
