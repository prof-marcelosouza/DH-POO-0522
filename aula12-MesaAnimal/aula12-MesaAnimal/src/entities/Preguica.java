package entities;

public class Preguica extends Animal {

    public Preguica(int id, String nome, int idade) {
        super(id, nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça está dormindo!");
    }

    public void subirArvore() {
        System.out.println("A preguiça está subindo a árvore!");
    }

    @Override
    public String toString() {
        return "Preguiça {" + super.toString() + "}";
    }
}
