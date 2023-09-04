package exercicio;

import java.util.Date;

public class Boleto {

    private int codigo;
    private Date data;
    private double valorPago;

    public Boleto(int codigo, Date data, double valorPago) {

        this.codigo = codigo;
        this.data = data;
        this.valorPago = valorPago;

    }

    public double getValorPago() {

        return this.valorPago;

    }
    
}
