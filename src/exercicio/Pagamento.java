package exercicio;

import java.util.Date;

public class Pagamento {

    private double valorPago;
    private Date data;
    private TipoPagamento tipoPagamento;

    public Pagamento(double valorPago, Date data, TipoPagamento tipoPagamento) {

        this.valorPago = valorPago;
        this.data = data;
        this.tipoPagamento = tipoPagamento;

    }
    
}
