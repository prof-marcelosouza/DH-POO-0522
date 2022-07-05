package entities;

public class PedidoEletro extends Pedido {

    private String descricao;

    public PedidoEletro(double valor) {
        super(valor);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
