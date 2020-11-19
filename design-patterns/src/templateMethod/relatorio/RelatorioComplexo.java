package templateMethod.relatorio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class RelatorioComplexo extends TemplateRelatorio {
    List<String> dados = new ArrayList<String>();
    @Override
    protected List<String> pegaDadosCabecalho(Banco banco) {
        dados.clear();
        dados.add(String.format("%s  %s  %s", banco.getNome(), banco.getEndereco(), banco.getTelefone()));
        return dados;
    }

    @Override
    protected List<String> pegaDadosCorpo(Banco banco) {
        dados.clear();
        for(Conta conta : banco.getContas()){
            dados.add(String.format("Titular: %s \n" +
                    "Agencia: %s\n" +
                    "Conta: %s \n" +
                    "Saldo: %.2f\n"
                    , conta.getTitular(), conta.getAgencia(), conta.getConta() ,conta.getSaldo()));
        }
        return dados;
    }

    @Override
    protected List<String> pegaDadosRodape(Banco banco) {
        dados.clear();
        dados.add(String.format("%s  %s", banco.getEmail(), Calendar.getInstance().getTime()));
        return dados;
    }
}
