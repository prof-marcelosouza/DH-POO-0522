import entities.Conta;
import entities.ContaPF;
import entities.ContaPJ;

public class Program {

    public static void main(String[] args) {

        Conta c1 = new Conta(21444, "Pedro Alves", 100.0);
        System.out.println(c1);

        ContaPF cPF1 = new ContaPF(25544, "Maria Silveira", 1000.0, "222.541.452-95");
        System.out.println(cPF1);

        cPF1.depositar(500.0);

        cPF1.sacar(2000.0);

        ContaPJ cPJ1 = new ContaPJ(55412, "DH Brasil", 2000.0, "22.541.214/0001-05");
        System.out.println(cPJ1);
    }

}
