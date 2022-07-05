import entities.Equipe;
import entities.Jogador;

public class Programa {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador(1, 13, "Alisson (Liverpool)", true, true);
        Jogador jogador2 = new Jogador(2, 2, "Thiago Silva (Chelsea)", true, true);
        Jogador jogador3 = new Jogador(3, 17, "Daniel Alves (Barcelona)", false, true);
        Jogador jogador4 = new Jogador(4, 15, "Fred (Manchester United)", false, true);
        Jogador jogador5 = new Jogador(5, 11, "Gabriel Jesus (Manchester City)", false, true);

        Equipe equipe = new Equipe(1, "Brasil");

        equipe.adicionarJogador(jogador1);
        equipe.adicionarJogador(jogador2);
        equipe.adicionarJogador(jogador3);
        equipe.adicionarJogador(jogador4);
        equipe.adicionarJogador(jogador5);

        System.out.println("");
        System.out.println("Jogadores titulares: ");
        equipe.mostrarJogadoresTitulares();

        System.out.println("");
        System.out.print("Jogadores lesionados: ");
        System.out.print(equipe.getQuantidadeJogadoresLesionados());

    }

}
