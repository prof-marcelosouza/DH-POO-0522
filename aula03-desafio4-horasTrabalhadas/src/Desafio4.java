import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de horas trabalhadas");
        int horas = scanner.nextInt();
        scanner.nextLine();

        float saldoSemanal = 0;
        if(horas > 40) {
            saldoSemanal += (horas - 40) * (875 + (875 * 0.5));
            saldoSemanal += 40 * 875;
        }
        else {
            saldoSemanal += horas * 875;
        }
        System.out.println("O saldo semanal é de: $" +saldoSemanal);

        scanner.close();
    }
}