package composicaoLSP;

public interface ContaNaoRentavel {

    public void deposita(double valor);

    public void saca(double valor);

    public double getSaldo();

    public int getMilhas();
}
