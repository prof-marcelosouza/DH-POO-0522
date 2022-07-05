import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, divisao;

        try {
            System.out.print("Digite o número 1: ");
            num1 = sc.nextInt();
            System.out.print("Digite o número 2: ");
            num2 = sc.nextInt();
            divisao = num1 / num2;
            System.out.println("Resultado da divisão: " + divisao);
        }
        catch (InputMismatchException e) {
            System.err.println("Erro na entrada de dados: tente mais tarde.");
        }
        catch (ArithmeticException e) {
            System.err.println("Erro na divisão: O denominador não pode ser zero.");
        }
        finally {
            System.out.println("Finalizando o bloco Try/Catch/Finally...");
            sc.close();
        }

    }
}
