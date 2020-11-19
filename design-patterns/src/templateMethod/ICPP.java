package templateMethod;

public class ICPP extends TemplateImposto {

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() < 500.0;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }
}
