package entities;

import java.time.LocalDate;

public class ImpressoraCannon extends Impressora {

    public ImpressoraCannon(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double percTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, percTinta);
    }

    @Override
    public void imprimir() {
        if (temPapel() && !precisaTinta()) {
            setFolhasDisponiveis(getFolhasDisponiveis() - 1);
            setPercTinta(getPercTinta() - 0.01);
            System.out.println("Imprimindo com a impressora Cannon ...");
        } else if (temPapel() && precisaTinta()) {
            System.out.println("Você precisa adicionar tinta.");
        } else if (!temPapel() && precisaTinta()) {
            System.out.println("Você precisa de tinta e de papel.");
        } else {
            System.out.println("Você está sem papel.");
        }
    }
}
