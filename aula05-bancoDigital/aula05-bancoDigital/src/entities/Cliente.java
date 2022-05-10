package entities;

public class Cliente {

    private int numeroCliente;
    private String nome;
    private double divida;

    // Construtor padrão
    public Cliente() {
    }

    // Construtor com parâmetros
    public Cliente(int numeroCliente, String nome) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = 0.0;
    }

    // Getters and Setters
    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDivida() {
        return divida;
    }

    // Métodos customizados
    public void aumentarDivida(double valor) {
        this.divida = this.divida + valor;
        System.out.println("Sua dívida agora é de RS " + this.divida);
    }

    public void pagarDivida(double valor) {
        this.divida = this.divida - valor;
        if (this.divida == 0) {
            System.out.println("Você não tem mais dívida :).");
        } else {
            System.out.println("Você ainda possui dívida :(.");
        }
    }

    @Override
    public String toString() {
        return "Cliente { " +
                "numeroCliente = " + numeroCliente +
                ", nome = '" + nome + '\'' +
                ", divida = " + divida +
                '}';
    }
}