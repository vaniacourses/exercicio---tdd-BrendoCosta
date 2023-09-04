package exercicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProcessadorBoleto {
    
    public List<Pagamento> processar(List<Boleto> listaBoletos, Fatura fatura) {

        List<Pagamento> listaPagamentos = new ArrayList<Pagamento>();

        for (Boleto boleto : listaBoletos) {

            listaPagamentos.add(new Pagamento(0, new Date(), TipoPagamento.BOLETO));
            
        }

        return listaPagamentos;

    }

}
