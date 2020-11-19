package templateMethod.relatorio;

public class Conta {

    private String titular;
    private String agencia;
    private String conta;
    private double saldo;

    public Conta(String titular, String agencia, String conta, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}
