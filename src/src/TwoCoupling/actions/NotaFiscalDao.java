package src.TwoCoupling.actions;

import src.TwoCoupling.entities.NotaFiscal;
import src.TwoCoupling.solid.AcoesAposGeracaoNF;

public class NotaFiscalDao implements AcoesAposGeracaoNF {

    public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }

}
