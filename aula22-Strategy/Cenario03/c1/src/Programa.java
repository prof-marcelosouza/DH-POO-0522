import entities.Pedido;
import entities.PedidoBazar;
import entities.PedidoEletro;

public class Programa {

    public static void main(String[] args) throws Exception {

        Pedido pe = new PedidoEletro(1000.0);
        System.out.println("Pedido - ELETRO:");
        System.out.println("Frete comum: " + pe.calcFreteComum());
        System.out.println("Frete expresso: " + pe.calcFreteExpresso());

        Pedido pb = new PedidoBazar(1000.0);
        System.out.println("Pedido - BAZAR:");
        System.out.println("Frete comum: " + pb.calcFreteComum());
        System.out.println("Frete expresso: " + pb.calcFreteExpresso());

    }

}
