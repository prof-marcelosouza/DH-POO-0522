package entities;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String cnpj;
    private List<Empregado> listaEmpregado = new ArrayList<>();

    public Empresa(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double calcularSalarioTotal(int dias) {
        double total = 0;
        for (Empregado emp : listaEmpregado) {
            total += emp.calcularSalario(dias);
        }
        return total;
    }

    public void addEmpregado(Empregado e) {
        listaEmpregado.add(e);
    }

    public void listEmpregado() {
        for (Object lista : listaEmpregado) {
            System.out.println((Empregado)lista);
        }
    }
}
