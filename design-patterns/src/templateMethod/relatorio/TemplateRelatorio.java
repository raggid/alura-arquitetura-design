package templateMethod.relatorio;

import java.util.Collections;
import java.util.List;

public abstract class TemplateRelatorio implements Relatorio {

    @Override
    public void imprimeRelatorio(Banco banco) {
        imprimeArea(pegaDadosCabecalho(banco));
        System.out.println(String.join("", Collections.nCopies(10, "-")));
        imprimeArea(pegaDadosCorpo(banco));
        System.out.println(String.join("", Collections.nCopies(10, "-")));
        imprimeArea(pegaDadosRodape(banco));

    }

    private void imprimeArea(List<String> dados) {
        for(String dado: dados){
            System.out.println(dado);
        }
    }

    protected abstract List<String> pegaDadosCabecalho(Banco banco);
    protected abstract List<String> pegaDadosCorpo(Banco banco);
    protected abstract List<String> pegaDadosRodape(Banco banco);
}
