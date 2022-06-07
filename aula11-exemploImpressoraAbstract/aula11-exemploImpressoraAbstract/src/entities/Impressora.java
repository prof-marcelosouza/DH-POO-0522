package entities;

import java.time.LocalDate;

public abstract class Impressora {

    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;
    private double percTinta;

    public Impressora() {
    }

    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double percTinta) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
        this.percTinta = percTinta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public double getPercTinta() {
        return percTinta;
    }

    public void setPercTinta(double percTinta) {
        this.percTinta = percTinta;
    }

    // Métodos
    public boolean temPapel() {
        if (this.folhasDisponiveis != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean precisaTinta() {
        if (this.percTinta == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Método abstrato
    public abstract void imprimir();

    @Override
    public String toString() {
        return "Impressora{" +
                "modelo='" + modelo + '\'' +
                ", tipoConexao='" + tipoConexao + '\'' +
                ", dataFabricacao=" + dataFabricacao +
                ", folhasDisponiveis=" + folhasDisponiveis +
                ", percTinta=" + percTinta +
                '}';
    }
}
