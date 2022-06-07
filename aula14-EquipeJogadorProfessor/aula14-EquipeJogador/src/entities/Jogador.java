package entities;

// implements trata de interface, tem que usar os métodos
// extends trata de herança, acesso a atributos e métodos da supérclasse

public class Jogador implements Comparable<Jogador> {

    private int id;
    private int camisa;
    private String nome;
    private boolean lesionado;
    private boolean titular;

    public Jogador(int id, int camisa, String nome, boolean lesionado, boolean titular) {
        this.id = id;
        this.camisa = camisa;
        this.nome = nome;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    /*
    * Estamos indicando que se a camisa do jogador for menor,
    * mande ele mais para a esquerda (-1), se for maior,
    * mande para a direita (1) e se as camisas forem iguais
    * não faça nada.*/

    @Override
    public int compareTo(Jogador o) {
        if (this.camisa < o.camisa) {
            return -1;
        }
        if (this.camisa > o.camisa) {
            return 1;
        }
        return 0;
    }
}
