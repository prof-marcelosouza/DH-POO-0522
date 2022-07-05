import entities.Pedido;

public class Programa {

    public static void main(String[] args) {

        Pedido p1 = new Pedido(1000.0);
        System.out.println("Frete comum: " + p1.calcFreteComum());
        System.out.println("Frete expresso: " + p1.calcFreteExpresso());

    }

}
