import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o nº de valores primos a ser impressos: ");
        int n = scanner.nextInt();
        //scanner.nextLine();

        //contador de números primos e variável i para usar como índice
        int contadorPrimos = 0;
        int i = 1;
        while(contadorPrimos < n) {
            int contadorDivisores = 1;

            //encontre os divisores do número
            for(int j = 2; j <= i; j++) {
                if(i % j == 0) {
                    contadorDivisores++;
                }
            }
            //ver se é primo ou não
            if(contadorDivisores == 2) {
                contadorPrimos++;
                System.out.println(i);
            }
            i++;
        }
    }
}

