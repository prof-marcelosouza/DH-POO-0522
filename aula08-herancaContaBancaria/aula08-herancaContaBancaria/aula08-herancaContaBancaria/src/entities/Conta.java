package entities;

public class Conta {

    protected int nro;
    protected String nome;
    protected double saldo;
    protected double limite;

    // Sobrecarga de Construtores.
    public Conta(int nome, int nro, double valor) {
    }

    public Conta(int nro, String nome, double valor) {
        this.nro = nro;
        this.nome = nome;
        this.saldo = 0.0;
        this.limite = valor;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    // Métodos customizados
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Saldo atual: R$ %.2f%n", getSaldo());
        } else {
            System.out.println("Valor inválido. Tente outra vez!");
        }
    }

    public void sacar(double valor) {
        if (valor <= (getSaldo() + consultarLimite())) {
            this.saldo -= valor;
        } else {
            System.out.println("Valor excedido. Saldo insuficiente :(");
        }
    }

    private double consultarLimite() {
        return getLimite();
    }

    // Aqui temos uma sobreescrita do método ToString() da Classe String.

    @Override
    public String toString() {
        return "Conta{" +
                "nro=" + nro +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite;
    }
}
