package exercicios.poo05.q04;

public class ContaImposto {

    private String numero;
    private double saldo;
    
    public ContaImposto(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double valorCredito) {
        saldo += valorCredito;
    }

    public void debitar(double valorDebito) {
        double novoValorDebito = retemImposto(valorDebito);
        saldo -= novoValorDebito;
    }

    private double retemImposto(double valorDebito) {
        double impostoRetido = valorDebito * (0.38/100);
        valorDebito -= impostoRetido;

        return valorDebito;
    }

}