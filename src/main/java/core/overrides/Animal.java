package core.overrides;

public abstract class Animal {
    protected String especie;
    protected String tipo;

    public Animal(String especie, String tipo) {
        this.especie = especie;
        this.tipo = tipo;
    }
    abstract public String hacerSonido();
    abstract public String describirAnimal();
    public String infoAnimal() {
        return "Especie: "+especie+" - tipo: "+tipo;
    }
}
