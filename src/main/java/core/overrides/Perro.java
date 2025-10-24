package core.overrides;

public class Perro extends Animal {
    public Perro(String especie, String tipo) {
        super(especie, tipo);
    }

    @Override
    public String hacerSonido() {
        return "Guau, guau";
    }

    @Override
    public String describirAnimal() {
        return "Animal de compañía, se dice que mejor amigo del hombre, mamífero de cuatro patas";
    }
}
