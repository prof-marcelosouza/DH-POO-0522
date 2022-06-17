package entities;

public class Boleto30d extends Boleto {

    // Construtor
    public Boleto30d(double valor) { // 1000.0
        super(valor);
        this.juro = 0.05; // 5%
        this.desconto = 0.05; // 5%
        this.multa = 0.1; // 10%
    }
}
