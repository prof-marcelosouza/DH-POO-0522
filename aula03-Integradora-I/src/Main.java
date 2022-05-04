import java.util.Locale;
import java.util.Scanner;

public class Main {

    // Tipo de retorno inteiro
    public static int quantosPacotes(float qtde) { // Escopo local = 5

        Scanner entrada = new Scanner(System.in);
        float kilo = 0.0f;
        int pacote = 0;

        while(kilo < qtde) {
            System.out.print("Digite o peso do pacote: ");
            float peso = entrada.nextFloat();
            kilo = kilo + peso; // kilo += peso; 1 3
            pacote = pacote + 1; // 1 2
        }
        entrada.close();

        return pacote;
    }
    // Sempre que o tipo de retorno for diferente de void
    // precisamos utilizar o "return".

    public static void main(String[] args) {

        // Escopo global
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do cachorro: ");
        String nome = ler.nextLine();
        System.out.print("Digite a quantidade de ração: ");
        float quantidade = ler.nextFloat();

        int valor = quantosPacotes(quantidade); // 5
        System.out.printf("Seu cachorro precisará de %d pacotes.", valor);

        ler.close();
    }
}
