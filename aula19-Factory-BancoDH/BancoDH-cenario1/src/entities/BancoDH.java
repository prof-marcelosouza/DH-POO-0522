package entities;

public class BancoDH {

    public BancoDH() {
    }

    public Boleto gerarBoleto(int vencimento, double valor) throws Exception {

        Boleto boleto;

        switch (vencimento) {
            case 10:
                boleto = new Boleto10d(valor);
                break;
            case 30:
                boleto = new Boleto30d(valor);
                break;
            case 60:
                boleto = new Boleto60d(valor);
                break;
            default:
                throw new Exception("Vencimento indisponível.");
        }

        System.out.println("Valor do boleto gerado R$ " + valor);
        System.out.println("Valor do juro R$ " + boleto.calcularJuro());
        System.out.println("Valor do desconto R$ " + boleto.calcularDesconto());
        System.out.println("Valor da multa R$ " + boleto.calcularMulta());
        System.out.println("---------------------------------------------");

        return boleto;
    }
}
