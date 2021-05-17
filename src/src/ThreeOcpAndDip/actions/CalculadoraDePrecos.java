package src.ThreeOcpAndDip.actions;

import src.ThreeOcpAndDip.entities.Compra;
import src.ThreeOcpAndDip.solid.TabelaDePreco;
import src.ThreeOcpAndDip.solid.Transportadora;

public class CalculadoraDePrecos {

    private TabelaDePreco tabelaDePreco;
    private Transportadora transportadora;

    public CalculadoraDePrecos(TabelaDePreco tabelaDePreco, Transportadora transportadora) {
        this.tabelaDePreco = tabelaDePreco;
        this.transportadora = transportadora;
    }

    public double calcula(Compra produto) {

        double desconto = tabelaDePreco.descontoPara(produto.getValor());
        double frete = transportadora.para(produto.getCidade());

        return produto.getValor() * (1 - desconto) + frete;
    }


}

