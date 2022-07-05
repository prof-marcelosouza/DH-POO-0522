package entities;

public class Pedido {

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

    public double calcFreteComum() {
        return getValor() * 0.05;
    }

    public double calcFreteExpresso() {
        return getValor() * 0.1;
    }
}
