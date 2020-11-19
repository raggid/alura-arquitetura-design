package chainOfResponsibility;



public class CalculadorDeDescontos {
    public double calcula(Orcamento orcamento) {

        Desconto desconto = new DescontoPorMaisDeCincoItens(new DescontoPorMaisDeQuinhentosReais());

        return desconto.desconta(orcamento);
    }
}

