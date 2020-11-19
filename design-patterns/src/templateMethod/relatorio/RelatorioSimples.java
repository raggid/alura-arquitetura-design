package templateMethod.relatorio;

import java.util.ArrayList;
import java.util.List;

public class RelatorioSimples extends TemplateRelatorio{
    List<String> dados = new ArrayList<String>();
    @Override
    protected List<String> pegaDadosCabecalho(Banco banco) {
        dados.clear();
        dados.add(banco.getNome());
        return dados;
    }

    @Override
    protected List<String> pegaDadosCorpo(Banco banco) {
        dados.clear();
        for(Conta conta : banco.getContas()){
            dados.add(String.format("Titular: %s \nSaldo: %.2f", conta.getTitular(), conta.getSaldo()));
        }
        return dados;
    }

    @Override
    protected List<String> pegaDadosRodape(Banco banco) {
        dados.clear();
        dados.add(banco.getTelefone());
        return dados;
    }
}
