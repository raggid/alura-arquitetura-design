package chainOfResponsibility;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

    private Desconto proximo;

    public DescontoPorMaisDeQuinhentosReais(Desconto proximo) {
        this.proximo = proximo;
    }

    public DescontoPorMaisDeQuinhentosReais() {
        this.proximo = null;
    }

    public double desconta(Orcamento orcamento) {
        if(orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        }
        else if (proximo != null) {
            return proximo.desconta(orcamento);
        }
        else{
            return 0;
        }
    }
}
