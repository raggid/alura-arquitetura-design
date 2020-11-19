package chainOfResponsibility;

public class DescontoPorMaisDeCincoItens implements Desconto {

    private Desconto proximo;

    public DescontoPorMaisDeCincoItens(Desconto proximo) {
        this.proximo = proximo;
    }

    public DescontoPorMaisDeCincoItens() {
        this.proximo = null;
    }

    public double desconta(Orcamento orcamento) {
        if(orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        }
        else if (proximo != null) {
            return proximo.desconta(orcamento);
        }
        else{
            return 0;
        }
    }
}
