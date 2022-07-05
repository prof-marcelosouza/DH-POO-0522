package entities.fretes;

import entities.Frete;

public class FreteComum implements Frete {

    @Override
    public double calcular(double valor) {
        return valor * 0.05;
    }
}
