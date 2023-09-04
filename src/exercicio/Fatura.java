package exercicio;

import java.util.Date;

public class Fatura {
    
    private Date data;
    private double valorTotal;
    private String nomeCliente;
    private boolean statusPaga = false;

    public Fatura(Date data, double valorTotal, String nomeCliente) {

        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;

    }

    public double getValorTotal() {

        return this.valorTotal;

    }

    public boolean getStatusPaga() {

        return this.statusPaga;

    }

    public void setStatusPaga(boolean statusPaga) {

        this.statusPaga = statusPaga;

    }

}
