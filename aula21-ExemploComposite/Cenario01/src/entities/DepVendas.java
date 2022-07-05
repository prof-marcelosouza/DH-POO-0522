package entities;

public class DepVendas implements Departamento {

    private int id;
    private String nome;

    public DepVendas(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public void getName() {
        System.out.println(getClass().getSimpleName());
    }
}
