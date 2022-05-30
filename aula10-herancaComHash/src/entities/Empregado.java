package entities;

public class Empregado {

    private int id;
    private String nome;
    private String arquivo;
    protected double salario;
    protected double desconto;

    // Construtor padrão
    public Empregado() {
    }

    // Contrutor com sobrecarga
    public Empregado(int id, String nome, String arquivo) {
        this.id = id;
        this.nome = nome;
        this.arquivo = arquivo;
    }

    public Empregado(int id, String nome, String arquivo, double salario, double desconto) {
        this.id = id;
        this.nome = nome;
        this.arquivo = arquivo;
        this.salario = salario;
        this.desconto = desconto;
    }

    // Métodos Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    // Métodos para calcular o salário
    public double calcularSalario() {
        return salario - desconto;
    }

    public double calcularSalario(double premio) {
        return salario + premio - desconto;
    }

    // Métodos que serão sobreescritos da superclass Object
    @Override
    public boolean equals(Object obj) {
        // Verificação se o obj é do tipo Empregado
        if (obj == null || this.getClass() != obj.getClass()) {
            System.out.println("Objeto diferente de Empregado.");
            return false; // Retorna ao método main
        } // Se não executar este bloco If segue abaixo.

        // casting de Object para Empregado
        Empregado emp = (Empregado)obj;

        if (this.getId() == emp.getId() &&
           this.getNome() == emp.getNome() &&
           this.getArquivo() == emp.getArquivo() &&
           this.getSalario() == emp.getSalario() &&
           this.getDesconto() == emp.getDesconto()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = hash * nome.hashCode();
        hash = hash * arquivo.hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", arquivo='" + arquivo + '\'' +
                ", salario=" + salario +
                ", desconto=" + desconto +
                '}';
    }
}
