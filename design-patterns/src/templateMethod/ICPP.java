package templateMethod;

public class ICPP extends TemplateImposto {

    @Override
    protected boolean condicional(Orcamento orcamento) {
        return orcamento.getValor() < 500.0;
    }

    @Override
    protected double taxacaoSeCondicionalVerdadeira(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    protected double taxacaoSeCondicionalFalsa(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }
}
