package entities;

public class DepRH implements Departamento {

    private int id;
    private String nome;

    public DepRH(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public void getName() {
        System.out.println(getClass().getSimpleName());
    }
}
