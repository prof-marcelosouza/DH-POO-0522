package entities;

public interface GravarImposto {

    void sacar(double valor, double perc);

    // quando está dentro de uma interface não precisamos declarar abstract
    public double imposto(double perc);

}
