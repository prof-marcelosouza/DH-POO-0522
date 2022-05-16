package entities;

import static java.lang.Boolean.FALSE;

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
    public int trazerIdade() {
        return 2022 - getAnoNasc();
    }

    public void encaminharAdocao() {
        if (isFerido() != FALSE && getPeso() > 5) {
            System.out.println("O cachorro pode ser adotado!");
        } else {
            System.out.println("O cachorro ainda NÃO pode ser adotado!");
        }
    }

    @Override
    public String toString() {
        return "Cachorro { " +
                "nome = '" + nome + '\'' +
                ",raca = '" + raca + '\'' +
                ",anoNasc = " + anoNasc +
                ",peso = " + peso +
                ",chip = " + chip +
                ",ferido = " + ferido + "\n" +
                '}';
    }
}
