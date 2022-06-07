package entities;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= informarSaldo()) {
            setSaldo((informarSaldo() - valor));
        } else {
            System.out.println("Limite excedido :(.");
        }
    }

    public void cobrarJuros() {
        double juros = 0.05;
        setSaldo(informarSaldo() * (1 + juros));
    }
}
