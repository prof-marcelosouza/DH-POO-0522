import entities.ImpressoraCannon;
import entities.ImpressoraEpson;

import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {

        ImpressoraEpson epson = new ImpressoraEpson(
                "LX-3000", "USB", LocalDate.now(),
                5, 20.0);
        System.out.println(epson);
        epson.imprimir();

        ImpressoraCannon cannon = new ImpressoraCannon(
                "SX-5000", "USB/Wireless", LocalDate.now(),
                15, 5.00);
        System.out.println(cannon);
        cannon.imprimir();
    }

}
