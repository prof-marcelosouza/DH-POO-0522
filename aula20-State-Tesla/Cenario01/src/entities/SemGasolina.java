package entities;

public class SemGasolina implements EstadoCarro {

    private Carro v;

    public SemGasolina(Carro v) {
        this.v = v;
    }

    @Override
    public void ligar() {
        System.out.println("Abasteça o carro primeiro.");
    }

    @Override
    public void acelerar() {
        System.out.println("Abasteça o carro primeiro para poder acelerar.");
    }

    @Override
    public void freiar() {
        System.out.println("Abasteça o carro primeiro e depois ligue.");
    }
}
