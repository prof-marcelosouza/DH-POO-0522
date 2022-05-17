import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n1, n2;
        float f1, f2;
        boolean pgto;
        short idade;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor de n1: ");
        n1 = ler.nextInt();
        System.out.print("Digite o valor de n2: ");
        n2 = ler.nextInt();

        System.out.print("Digite se o valor está pago: ");
        pgto = ler.nextBoolean();

        System.out.print("Digite o valor de idade: ");
        idade = ler.nextShort();

        System.out.print("Digite o valor de f1: ");
        f1 = ler.nextFloat();
        System.out.print("Digite o valor de f2: ");
        f2 = ler.nextFloat();

        // CTRL + d
        System.out.println("Valor digitado para n1: " + n1);
        System.out.println("Valor digitado para n2: " + n2);

        System.out.println("Valor digitado para f1: " + f1);
        System.out.println("Valor digitado para f2: " + f2);

        int soma, subtracao, mult, divisao;

        soma = n1 + n2;
        System.out.println("Soma de n1 + n2: " + soma);
        subtracao = n1 - n2;
        System.out.println("Subtração de n1 - n2: " + subtracao);
        mult = n1 * n2;
        System.out.println("Multiplicação de n1 * n2: " + mult);
        divisao = n1 / n2;
        System.out.println("Divisão de n1 \\ n2: " + divisao);

        ler.close();

    }

}
