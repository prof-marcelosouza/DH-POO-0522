package entities;

public class Boleto10d extends Boleto {

    // Construtor
    public Boleto10d(double valor) { // 1000.0
        super(valor);
        this.juro = 0.02; // 2%
        this.desconto = 0.1; // 10%
        this.multa = 0.05; // 5%
    }
}
