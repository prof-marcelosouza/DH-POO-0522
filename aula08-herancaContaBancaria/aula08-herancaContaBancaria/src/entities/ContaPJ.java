package entities;

public class ContaPJ extends Conta {

    private String cnpj;

    public ContaPJ(int nro, String nome, double valor, String cnpj) {
        super(nro, nome, valor);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", " +
                "cnpj='" + cnpj + '\'' +
                '}';
    }
}
