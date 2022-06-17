package entities;

public class Boleto60d extends Boleto {

    // Construtor
    public Boleto60d(double valor) { // 1000.0
        super(valor);
        this.juro = 0.1; // 10%
        this.desconto = 0.0; // 0%
        this.multa = 0.2; // 20%
    }
}
