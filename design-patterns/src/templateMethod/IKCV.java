package templateMethod;

public class IKCV extends TemplateImposto{

    private boolean itemComValorSuperiorACem(Orcamento orcamento) {
        for (Item item : orcamento.getItens()){
            if (item.getValor() > 100.0) return true;
        }
        return false;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500.0 && itemComValorSuperiorACem(orcamento);
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }


}
