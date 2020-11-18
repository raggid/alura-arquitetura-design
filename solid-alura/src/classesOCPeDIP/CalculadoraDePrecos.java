public class CalculadoraDePrecos {

    private TabelaPreco tabela;
    private Transportadora transportadora;

    public CalculadoraDePrecos(TabelaPreco tabela, Transportadora transportadora) {
		// TODO Auto-generated constructor stub
        this.tabela = tabela;
        this.transportadora = transportadora;
    }

    public double calcula(Compra produto) {

        double desconto = tabela.descontoPara(produto.getValor());
        double frete = transportadora.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}

