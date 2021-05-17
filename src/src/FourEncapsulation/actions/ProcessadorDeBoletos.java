package src.FourEncapsulation.actions;

import src.FourEncapsulation.entities.Boleto;
import src.FourEncapsulation.entities.Fatura;
import src.FourEncapsulation.entities.Pagamento;
import src.FourEncapsulation.entities.enums.MeioDePagamento;

import java.util.List;

public class ProcessadorDeBoletos {

    public void processa(List<Boleto> boletos, Fatura fatura) {
        for (Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
            fatura.adicionarPagamento(pagamento);
        }
    }


}
