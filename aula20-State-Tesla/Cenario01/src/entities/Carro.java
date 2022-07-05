package entities;

public class Carro {

    private int velocidadeAtual = 0;
    private int combustivelAtual = 0;
    private EstadoCarro estadoAtual;

    // Construtor
    public Carro(int combustivelAtual) {
        this.setCombustivelAtual(combustivelAtual);
        this.setEstadoAtual(new Desligado(this));
        System.out.println("O carro está Desligado.");
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getCombustivelAtual() {
        return combustivelAtual;
    }

    public void setCombustivelAtual(int combustivelAtual) {
        this.combustivelAtual = combustivelAtual;
    }

    public EstadoCarro getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(EstadoCarro estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void ligar() {
        getEstadoAtual().ligar();
    }

    public void acelerar() {
        getEstadoAtual().acelerar();
        System.out.println("Velocidade atual " + getVelocidadeAtual());
        System.out.println("Combustível restante : " + getCombustivelAtual());
    }

    public void freiar() {
        getEstadoAtual().freiar();
    }

    public void modificarVelocidade(int kmh) {
        setVelocidadeAtual(getVelocidadeAtual() + kmh);
    }

    public void modificarCombustivel(int litros) {
        setCombustivelAtual(getCombustivelAtual() + litros);
    }
}
