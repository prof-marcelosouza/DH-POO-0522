package entities;

public class Veterinario {

    // Atributos
    private String nome;
    private String sobrenome;
    private String registro;
    private double salario;

    // Construtor padrão
    public Veterinario() {
    }

    // Construtor com argumentos
    public Veterinario(String nome, String sobrenome, String registro, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.registro = registro;
        this.salario = salario;
    }

    // Métodos Getters and Setters


}
