package composicaoLSP;

public class ContaComum implements ContaRentavel {

    private ManipuladorDeConta manipuladorDeConta;

    public ContaComum(ManipuladorDeConta manipuladorDeConta) {
        this.manipuladorDeConta = manipuladorDeConta;
    }

    public void deposita(double valor){
        manipuladorDeConta.deposita(valor);
    }

    public void saca(double valor){
        manipuladorDeConta.saca(valor);
    }

    public void rende(double taxa) {
        manipuladorDeConta.rende(taxa);
    }

    public double getSaldo(){
        return manipuladorDeConta.getSaldo();
    }


}
