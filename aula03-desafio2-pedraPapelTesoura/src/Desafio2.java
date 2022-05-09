import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        comecarJogo();
    }

    public static void comecarJogo() {
        String nomeJogador1 = "";
        int pontosJogador1 = 0;
        String nomeJogador2 = "";
        int pontosJogador2 = 0;

        Scanner scanner = new Scanner(System.in);
        //Solicita os nomes dos jogadores
        System.out.print("Digite o nome do primeiro jogador: ");
        nomeJogador1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo jogador: ");
        nomeJogador2 = scanner.nextLine();

        //Os jogadores escolhem seus movimentos
        String opcao1 = "";
        String opcao2 = "";
        while(!opcao1.equals("*")) {
            System.out.println("O jogador 1 escolhe sua jogada:");
            System.out.println("1 -> pedra");
            System.out.println("2 -> papel");
            System.out.println("3 -> tesoura");
            System.out.println("* -> terminar o jogo");
            opcao1 = scanner.nextLine();
            if(!opcao1.equals("*")) {
                System.out.println("O jogador 2 escolhe sua jogada:");
                System.out.println("1 -> pedra");
                System.out.println("2 -> papel");
                System.out.println("3 -> tesoura");
                opcao2 = scanner.nextLine();

                if(quemGanha(opcao1, opcao2) == 1) {
                    System.out.println("O jogador 1 venceu esta rodada.");
                    pontosJogador1++;
                }
                else if(quemGanha(opcao1, opcao2) == 2) {
                    System.out.println("O jogador 2 venceu esta rodada.");
                    pontosJogador2++;
                }
                else {
                    System.out.println("Empate nesta rodada");
                }
            }

        }

        elegerGanhador(nomeJogador1,nomeJogador2,pontosJogador1,pontosJogador2);
    }

    private static int quemGanha(String opcao1, String opcao2) {
        //Jogador 1 vence
        if(opcao1.equals("1") && opcao2.equals("3")) {
            return 1;
        }
        else if(opcao1.equals("2") && opcao2.equals("1")) {
            return 1;
        }
        else if(opcao1.equals("3") && opcao2.equals("2")) {
            return 1;
        }

        //Jogador 2 vence
        if(opcao2.equals("1") && opcao1.equals("3")) {
            return 2;
        }
        else if(opcao2.equals("2") && opcao1.equals("1")) {
            return 2;
        }
        else if(opcao2.equals("3") && opcao1.equals("2")) {
            return 2;
        }

        //Empate
        return 0;
    }

    private static void elegerGanhador(String nomeJogador1, String nomeJogador2, int pontosJogador1, int pontosJogador2) {
        if(pontosJogador1 > pontosJogador2) {
            System.out.println("O jogador ganha" + nomeJogador1 + " a partida!");
        }
        else if(pontosJogador1 < pontosJogador2) {
            System.out.println("O jogador ganha" + nomeJogador2 + " a partida");
        }
        else {
            System.out.println(" A partida terminou empatada");
        }
    }
}