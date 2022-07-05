package entities;

public class DepFinanceiro implements Departamento {

    private int id;
    private String nome;

    public DepFinanceiro(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public void getName() {
        System.out.println(getClass().getSimpleName());
    }
}
