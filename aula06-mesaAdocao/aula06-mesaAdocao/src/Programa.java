import entities.Cachorro;

public class Programa {

    public static void main(String[] args) {

        Cachorro c1 = new Cachorro();
        c1.setNome("Jack");
        c1.setRaca("Fila");
        c1.setAnoNasc(2015);
        c1.setPeso(12.5f);
        c1.setChip(true);
        c1.setFerido(false);

        System.out.printf("O cachorro possui %d anos.%n", c1.trazerIdade());

        c1.encaminharAdocao();
    }

}
