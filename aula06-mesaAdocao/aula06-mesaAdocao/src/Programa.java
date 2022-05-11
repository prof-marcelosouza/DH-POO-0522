import entities.Cachorro;

public class Programa {

    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("Jack", "Fila");

        c1.setAnoNasc(2020);
        c1.setPeso(12.5f);
        c1.setChip(true);
        c1.setFerido(false);

        System.out.println(c1);
    }

}
