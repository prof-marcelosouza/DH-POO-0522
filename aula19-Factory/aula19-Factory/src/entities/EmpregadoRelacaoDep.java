package entities;

public class EmpregadoRelacaoDep extends Empregado {

    private double salarioMensal;

    public EmpregadoRelacaoDep() {
    }

    public EmpregadoRelacaoDep(String nome, String sobrenome, String arquivo, double salarioMensal) {
        super(nome, sobrenome, arquivo);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario(int dias) {
        return (this.salarioMensal / 30) * dias;
    }

    @Override
    public String toString() {
        return super.toString() +
                "EmpregadoRelacaoDep{" +
                "salarioMensal=" + salarioMensal +
                '}';
    }
}
