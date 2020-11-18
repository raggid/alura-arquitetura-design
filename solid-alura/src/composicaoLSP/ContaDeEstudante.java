package composicaoLSP;

public class ContaDeEstudante implements ContaNaoRentavel{

    private int milhas;
    private ManipuladorDeConta manipuladorDeConta;

    public ContaDeEstudante(ManipuladorDeConta manipuladorDeConta) {
        this.manipuladorDeConta = manipuladorDeConta;
    }

    public void deposita(double valor) {
        manipuladorDeConta.deposita(valor);
        milhas += (int) valor;
    }

    @Override
    public void saca(double valor) {
        manipuladorDeConta.saca(valor);
    }

    @Override
    public double getSaldo() {
        return manipuladorDeConta.getSaldo();
    }

    public int getMilhas() {
        return milhas;
    }
}
