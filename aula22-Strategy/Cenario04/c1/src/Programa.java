import entities.Pedido;
import entities.PedidoBazar;
import entities.PedidoEletro;
import entities.fretes.FreteComum;
import entities.fretes.FreteExpresso;
import entities.fretes.FretePJ;
import entities.fretes.FretePrime;

public class Programa {

    public static void main(String[] args) throws Exception {

        FreteComum freteComum = new FreteComum();
        FreteExpresso freteExpresso = new FreteExpresso();
        FretePrime fretePrime = new FretePrime();
        FretePJ fretePJ = new FretePJ();

        Pedido pe = new PedidoEletro(1000.0);
        System.out.println("Pedido - ELETRO:");

        pe.setTipoFrete(freteComum);
        System.out.println("Frete comum: " + pe.calculaFrete());

        pe.setTipoFrete(freteExpresso);
        System.out.println("Frete expresso: " + pe.calculaFrete());

        pe.setTipoFrete(fretePrime);
        System.out.println("Frete prime: " + pe.calculaFrete());

        pe.setTipoFrete(fretePJ);
        System.out.println("Frete PJ: " + pe.calculaFrete());

    }

}
