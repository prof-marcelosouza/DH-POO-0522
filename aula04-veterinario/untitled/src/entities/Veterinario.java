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
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
