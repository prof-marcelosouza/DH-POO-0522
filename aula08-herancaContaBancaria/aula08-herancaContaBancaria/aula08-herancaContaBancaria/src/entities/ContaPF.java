package entities;

public class ContaPF extends Conta {

    private String cpf;

    public ContaPF(int nro, String nome, double valor, String cpf) {
        super(nro, nome, valor);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", " +
                "cpf='" + cpf + '\'' +
                '}';
    }
}