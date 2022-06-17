import entities.BancoDH;
import entities.BoletoSimpleFactory;

public class Programa {

    public static void main(String[] args) throws Exception {

        BoletoSimpleFactory boletoSimpleFactory = new BoletoSimpleFactory();

        BancoDH dh = new BancoDH(boletoSimpleFactory);

        dh.gerarBoleto(10, 1000.0);
        dh.gerarBoleto(30, 1000.0);
        dh.gerarBoleto(60, 1000.0);
        //dh.gerarBoleto(90, 1000.0);

    }
}
