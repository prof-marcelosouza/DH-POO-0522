package entities;

public abstract class Pedido {

    private double valor;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double calcFreteComum();

    public abstract double calcFreteExpresso() throws Exception;
}
