package src.ThreeOcpAndDip;

import src.ThreeOcpAndDip.actions.CalculadoraDePrecos;
import src.ThreeOcpAndDip.entities.Compra;
import src.ThreeOcpAndDip.entities.Frete;
import src.ThreeOcpAndDip.entities.TabelaDePrecoPadrao;

public class main {

    public static void main(String[] args) {

        Compra compra = new Compra(579.99, "Boa Vista");

        CalculadoraDePrecos calculadoraDePrecos = new CalculadoraDePrecos(
                new TabelaDePrecoPadrao(), new Frete()
        );

        double valorCompra = calculadoraDePrecos.calcula(compra);
        System.out.println("Valor da Compra com frete: " + valorCompra);

    }


}
