package entities;

public abstract class Animal {

    private int id;
    private String nome;
    private int idade;

    public Animal() {
    }

    public Animal(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();

    @Override
    public String toString() {
        return "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade;
    }
}
