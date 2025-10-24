package core.overrides;

public class Gato extends Animal {
    public Gato(String especie, String tipo) {
        super(especie, tipo);
    }

    @Override
    public String hacerSonido() {
        return "Meow, meow";
    }

    @Override
    public String describirAnimal() {
        return "Animal de compañía, mamífero de cuatro patas";
    }
}
