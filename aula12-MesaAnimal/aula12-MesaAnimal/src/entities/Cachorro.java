package entities;

public class Cachorro extends Animal implements AnimaisQueCorrem {

    public Cachorro() {
    }

    public Cachorro(int id, String nome, int idade) {
        super(id, nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo!");
    }

    @Override
    public void correr() {
        System.out.println("O cachorro está correndo!");
    }

    @Override
    public String toString() {
        return "Cachorro {" + super.toString() + "}";
    }
}
