package exercicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProcessadorBoleto {
    
    public List<Pagamento> processar(List<Boleto> listaBoletos, Fatura fatura) {

        List<Pagamento> listaPagamentos = new ArrayList<Pagamento>();

        for (Boleto boleto : listaBoletos) {

            listaPagamentos.add(new Pagamento(boleto.getValorPago(), new Date(), TipoPagamento.BOLETO));
            
        }

        if (listaBoletos.stream().map(b -> b.getValorPago()).mapToDouble(Double::doubleValue).sum() >= fatura.getValorTotal()) {

            fatura.setStatusPaga(true);

        }

        return listaPagamentos;

    }

}
