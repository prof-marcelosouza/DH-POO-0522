import entities.Pessoa;
import entities.Pet;

public class Programa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ana", new Pet("Fila"));
        System.out.println(p1);

        Pessoa p2 = new Pessoa("Luiza", new Pet("Poodle"));
        System.out.println(p2);

    }

}
