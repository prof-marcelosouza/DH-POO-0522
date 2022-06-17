package entities;

public class EmpregadoContratado extends Empregado {

    private double valorPorHora;
    private double imposto;

    public EmpregadoContratado() {
    }

    public EmpregadoContratado(String nome, String sobrenome, String arquivo, double valorPorHora, double imposto) {
        super(nome, sobrenome, arquivo);
        this.valorPorHora = valorPorHora;
        this.imposto = imposto;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public double calcularSalario(int dias) {
        return ((this.valorPorHora * 8) * dias) * (1 - this.imposto);
    }

    @Override
    public String toString() {
        return super.toString() +
                "EmpregadoContratado{" +
                "valorPorHora=" + valorPorHora +
                ", imposto=" + imposto +
                '}';
    }
}
