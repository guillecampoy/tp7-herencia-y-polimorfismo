package core.overrides;

public class Vaca extends Animal {
    public Vaca(String especie, String tipo) {
        super(especie, tipo);
    }

    @Override
    public String hacerSonido() {
        return "Muuuuuuu";
    }

    @Override
    public String describirAnimal() {
        return "Animal dócil, de granja, mamífero de cuatro patas";
    }
}
