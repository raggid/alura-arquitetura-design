package builder;

public class Main {
    public static void main(String[] args) {
        NotaFiscal nf = new NotaFiscalBuilder().comCNPJ("456-985-8874/111")
                .comRazaoSocial("Grupo ARST")
                .naDataAtual()
                .comItem(new ItemDaNota("item1", 200.0))
                .comItem(new ItemDaNota("item 2", 500.0))
                .comObservacao("Teste")
                .build();

        System.out.println(" " + nf.getValorBruto() + " " + nf.getImpostos());
    }
}
