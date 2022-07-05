package entities;

public class PedidoBazar extends Pedido {

    private String descricao;

    public PedidoBazar(double valor) {
        super(valor);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double calcFreteComum() {
        return getValor() * 0.08;
    }

    @Override
    public double calcFreteExpresso() throws Exception {
        throw new Exception("MODALIDADE DE FRETE INDISPONÍVEL.");
    }
}
