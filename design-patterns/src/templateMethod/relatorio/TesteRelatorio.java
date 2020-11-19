package templateMethod.relatorio;

import java.util.Arrays;

public class TesteRelatorio {
    public static void main(String[] args) {
        Conta c1 = new Conta("titular1", "031", "456789", 100.1);
        Conta c2 = new Conta("titular2", "047", "745212", 610.1);

        Banco b1 = new Banco("Banco ARST", "Endereco do banco", "3212-8000",
                "email@mail.com", Arrays.asList(c1, c2));

        TemplateRelatorio simples = new RelatorioSimples();
        TemplateRelatorio complexo = new RelatorioComplexo();

        simples.imprimeRelatorio(b1);
        complexo.imprimeRelatorio(b1);
    }
}
