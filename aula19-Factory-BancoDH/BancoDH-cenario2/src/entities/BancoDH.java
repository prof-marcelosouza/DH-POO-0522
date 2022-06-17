package entities;

public class BancoDH {

    private BoletoSimpleFactory boletoSimpleFactory;

    public BancoDH(BoletoSimpleFactory boletoSimpleFactory) {
        this.boletoSimpleFactory = boletoSimpleFactory;
    }

    public Boleto gerarBoleto(int vencimento, double valor) throws Exception {

        Boleto boleto = this.boletoSimpleFactory.criarBoleto(vencimento, valor);

        System.out.println("Valor do boleto gerado R$ " + valor);
        System.out.println("Valor do juro R$ " + boleto.calcularJuro());
        System.out.println("Valor do desconto R$ " + boleto.calcularDesconto());
        System.out.println("Valor da multa R$ " + boleto.calcularMulta());
        System.out.println("---------------------------------------------");

        return boleto;
    }
}
