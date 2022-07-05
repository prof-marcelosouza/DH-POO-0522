package entities;

public class EmMovimento implements EstadoCarro {

    private final int VELOCIDADEMAXIMA = 200;
    private Carro v;

    public EmMovimento(Carro v) {
        this.v = v;
    }

    @Override
    public void ligar() {
        System.out.println("O carro não pode ser ligado/desligado em movimento.");
    }

    @Override
    public void acelerar() {
        if (v.getCombustivelAtual() > 0) {
            if (v.getVelocidadeAtual() >= VELOCIDADEMAXIMA) {
                System.out.println("O carro já está na velocidade máxima.");
                v.modificarVelocidade(-10);
                v.modificarCombustivel(-1);
            } else {
                v.modificarVelocidade(10);
                v.modificarCombustivel(-1);
            }
        } else {
            v.setEstadoAtual(new SemGasolina(v));
            System.out.println("O veículo está sem gasolina.");
        }
    }

    @Override
    public void freiar() {
        v.modificarVelocidade(-10);
        if (v.getVelocidadeAtual() == 0) {
            v.setEstadoAtual(new Parado(v));
            System.out.println("O veículo está parado agora.");
        }
    }
}
