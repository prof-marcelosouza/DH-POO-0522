package entities;

public class Cachorro {

    private String nome;
    private String raca;
    private int anoNasc;
    private float peso;
    private boolean chip;
    private boolean ferido;

    // Construtores
    public Cachorro() {
    }

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isFerido() {
        return ferido;
    }

    public void setFerido(boolean ferido) {
        this.ferido = ferido;
    }

    // Métodos


    @Override
    public String toString() {
        return "Cachorro { " +
                "\nnome = '" + nome + '\'' +
                ",\nraca = '" + raca + '\'' +
                ",\nanoNasc = " + anoNasc +
                ",\npeso = " + peso +
                ",\nchip = " + chip +
                ",\nferido = " + ferido + "\n" +
                '}';
    }
}
