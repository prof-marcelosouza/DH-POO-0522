package entities;

public class Pessoa {

    private String nome;
    private Pet cachorro;

    public Pessoa(String nome, Pet cachorro) {
        this.nome = nome;
        this.cachorro = cachorro;
    }

    @Override
    public String toString() {
        return "Pessoa { " +
                "nome='" + nome + '\'' +
                ", cachorro=" + cachorro +
                '}';
    }
}
