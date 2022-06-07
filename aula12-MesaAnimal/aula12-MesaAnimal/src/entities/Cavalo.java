package entities;

public class Cavalo extends Animal implements AnimaisQueCorrem {

    public Cavalo() {
    }

    public Cavalo(int id, String nome, int idade) {
        super(id, nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo está relinchando!");
    }

    @Override
    public void correr() {
        System.out.println("O cavalo está correndo!");
    }

    @Override
    public String toString() {
        return "Cavalo {" + super.toString() + "}";
    }
}
