package entities;

import java.util.ArrayList;

public class Equipe {

    private int id;
    private String nome;
    private ArrayList listaJogadores = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método customizado
    public void adicionarJogador(Jogador j) {
        listaJogadores.add(j);
    }
}