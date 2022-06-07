import entities.ContaCorrente;

public class Programa {

    public static void main(String[] args) {

        ContaCorrente cr1 = new ContaCorrente(0.0, 1000.0);

        System.out.println("Saldo: " + cr1.informarSaldo());
        cr1.depositar(1600.0);
        cr1.sacar(1000.0, 10);
        System.out.println("Saldo atualizado: " + cr1.informarSaldo());

    }

}
