package entities;

public class Vendedor extends Empregado {

    private int comissao;
    private double totalVendas;

    public Vendedor(int id, String nome, String arquivo, double salario, double desconto) {
        super(id, nome, arquivo, salario, desconto);
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularSalario() {
        return salario + (totalVendas / 100 * comissao) - desconto;
    }

    @Override
    public double calcularSalario(double premio) {
        return salario + premio + (totalVendas / 100 * comissao) - desconto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Vendedor{" +
                "comissao=" + comissao +
                ", totalVendas=" + totalVendas +
                '}';
    }
}
