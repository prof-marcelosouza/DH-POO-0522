package entities;

public abstract class Conta {

    private double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.printf("Depósito de R$%.2f realizado com sucesso%n", informarSaldo());
    }

    public abstract void sacar(double valor);

    public double informarSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
