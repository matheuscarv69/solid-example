package src.FourEncapsulation.entities;

import src.FourEncapsulation.entities.enums.MeioDePagamento;

public class Pagamento {
    private double valor;
    private MeioDePagamento forma;

    public Pagamento(double valor, MeioDePagamento forma) {
        this.valor = valor;
        this.forma = forma;
    }

    public double getValor() {
        return valor;
    }

    public MeioDePagamento getForma() {
        return forma;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pagamento)) {
            return false;
        }
        Pagamento outro = (Pagamento) obj;
        if (forma != outro.forma
                || Double.doubleToLongBits(valor) != Double
                .doubleToLongBits(outro.valor)) {
            return false;
        }

        return true;
    }
}
