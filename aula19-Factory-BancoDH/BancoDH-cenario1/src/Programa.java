import entities.BancoDH;

public class Programa {

    public static void main(String[] args) throws Exception {

        BancoDH dh = new BancoDH();

        dh.gerarBoleto(10, 1000.0);
        dh.gerarBoleto(30, 1000.0);
        dh.gerarBoleto(60, 1000.0);
        //dh.gerarBoleto(90, 1000.0);

    }
}
