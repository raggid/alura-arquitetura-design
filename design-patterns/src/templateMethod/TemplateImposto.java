package templateMethod;

public abstract class TemplateImposto implements Imposto {

    @Override
    public final double calcula(Orcamento orcamento) {
        if (condicional(orcamento)){
            return taxacaoSeCondicionalVerdadeira(orcamento);
        } else {
            return taxacaoSeCondicionalFalsa(orcamento);
        }
    }

    protected abstract boolean condicional(Orcamento orcamento);
    protected abstract double taxacaoSeCondicionalVerdadeira(Orcamento orcamento);
    protected abstract double taxacaoSeCondicionalFalsa(Orcamento orcamento);
}
