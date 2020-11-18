package composicaoLSP;

public interface ContaRentavel {

    public void deposita(double valor);

    public void saca(double valor);

    public void rende(double taxa);

    public double getSaldo();
}
