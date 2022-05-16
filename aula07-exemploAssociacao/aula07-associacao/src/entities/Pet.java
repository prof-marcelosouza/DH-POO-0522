package entities;

public class Pet {

    private String raca;

    public Pet(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return "Pet { " +
                "raca='" + raca + '\'' +
                '}';
    }
}
