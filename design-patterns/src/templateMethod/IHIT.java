package templateMethod;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateImposto{

    @Override
    protected boolean condicional(Orcamento orcamento) {
        List<String> noOrcamento = new ArrayList<String>();
        for(Item item : orcamento.getItens()){
            if(noOrcamento.contains(item.getNome())) return true;
            else noOrcamento.add(item.getNome());
        };
        return false;
    }

    @Override
    protected double taxacaoSeCondicionalVerdadeira(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100.0;
    }

    @Override
    protected double taxacaoSeCondicionalFalsa(Orcamento orcamento) {
        return orcamento.getValor() * (0.01 * orcamento.getItens().size());
    }
}
