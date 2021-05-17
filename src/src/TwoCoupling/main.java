package src.TwoCoupling;

import src.TwoCoupling.actions.EnviadorDeEmail;
import src.TwoCoupling.actions.GeradorDeNotaFiscal;
import src.TwoCoupling.actions.NotaFiscalDao;
import src.TwoCoupling.entities.Fatura;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        GeradorDeNotaFiscal geradorDeNotaFiscal = new GeradorDeNotaFiscal(
                Arrays.asList(new EnviadorDeEmail(), new NotaFiscalDao())
        );


        Fatura fatura = new Fatura(500.69, "Matheus");

        geradorDeNotaFiscal.gera(fatura);
    }

}
