package exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProcessadorBoletoTest {

    @DisplayName("Testa criação de pagamentos")
    @Test
    public void testCriacaoPagamentos() {

        ProcessadorBoleto processador = new ProcessadorBoleto();

        Fatura fatura = new Fatura(new Date(), 1500.00, "Fulano");
        List<Boleto> listaBoletos = Arrays.asList(
            new Boleto(1, new Date(), 500.00),
            new Boleto(2, new Date(), 400.00),
            new Boleto(3, new Date(), 600.00)
        );

        List<Pagamento> listaPagamentos = processador.processar(listaBoletos, fatura);
        Assertions.assertEquals(3, listaPagamentos.size());

    }
    @DisplayName("Testa se a fatura foi paga")
    @Test
    public void testPagamentoFatura() {

        ProcessadorBoleto processador = new ProcessadorBoleto();

        Fatura fatura = new Fatura(new Date(), 1500.00, "Fulano");
        List<Boleto> listaBoletos = Arrays.asList(
            new Boleto(1, new Date(), 500.00),
            new Boleto(2, new Date(), 400.00),
            new Boleto(3, new Date(), 600.00)
        );

        List<Pagamento> listaPagamentos = processador.processar(listaBoletos, fatura);
        Assertions.assertTrue(fatura.getStatusPaga());

    }

}