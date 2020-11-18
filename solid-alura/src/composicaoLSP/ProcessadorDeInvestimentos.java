package composicaoLSP;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        contasRentaveisDoBanco().forEach( conta -> {
            conta.rende(1.1);
            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        });
    }

    private static List<ContaRentavel> contasRentaveisDoBanco() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150), umaContaCom(200));
    }

    private static ContaNaoRentavel contaDeEstudanteCom(double amount) {
        ManipuladorDeConta manipuladorDeConta = new ManipuladorDeConta();
        ContaDeEstudante c = new ContaDeEstudante(manipuladorDeConta);
        c.deposita(amount);
        return c;
    }

    private static ContaRentavel umaContaCom(double valor) {
        ManipuladorDeConta manipuladorDeConta = new ManipuladorDeConta();
        ContaRentavel c = new ContaComum(manipuladorDeConta);
        c.deposita(valor);
        return c;
    }
}

