package src.TwoCoupling.actions;

import src.TwoCoupling.entities.Fatura;
import src.TwoCoupling.entities.NotaFiscal;
import src.TwoCoupling.solid.AcoesAposGeracaoNF;

import java.util.List;

public class GeradorDeNotaFiscal {

    private List<AcoesAposGeracaoNF> acoesAposGeracaoNFList;

    public GeradorDeNotaFiscal(List<AcoesAposGeracaoNF> acoesAposGeracaoNFList) {
        this.acoesAposGeracaoNFList = acoesAposGeracaoNFList;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        acoesAposGeracaoNFList.forEach(acao -> acao.executa(nf));

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}
