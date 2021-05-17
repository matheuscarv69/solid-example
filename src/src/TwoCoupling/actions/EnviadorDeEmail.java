package src.TwoCoupling.actions;

import src.TwoCoupling.entities.NotaFiscal;
import src.TwoCoupling.solid.AcoesAposGeracaoNF;

public class EnviadorDeEmail implements AcoesAposGeracaoNF {

    public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }

}
