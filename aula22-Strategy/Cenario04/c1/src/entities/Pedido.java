package entities;

public abstract class Pedido {

    private double valor;
    private Frete tipoFrete;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTipoFrete(Frete frete) {
        this.tipoFrete = frete;
    }

    public double calculaFrete() {
        return this.tipoFrete.calcular(this.valor);
    }
}
