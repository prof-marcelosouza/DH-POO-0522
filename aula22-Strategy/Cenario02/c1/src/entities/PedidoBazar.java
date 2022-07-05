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
}
