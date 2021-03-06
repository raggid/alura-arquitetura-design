package templateMethod;

public class TesteDeCalculo {
    public static void main(String[] args) {
        Imposto icms = new ICMS();
        Imposto iss = new ISS();

        Imposto icpp = new ICPP();
        Imposto ikcv = new IKCV();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();

        /*
        No padrão Strategy, o método de calculo é passado como parametro, o que me permite
        ter mais de uma forma de calcular impostos sem precisar fazer comparações com
        IF ou SWITCH.
        Nesse exemplo, a CalculadoraDeImposto recebe o Orcamento com um valor e um Imposto
        que deve obrigatoriamente implemetar o método CALCULA, usado pela calculadora.
         */
        calculadoraDeImposto.realizaCalculo(orcamento, icms);
        calculadoraDeImposto.realizaCalculo(orcamento, iss);

        /*
        Usando impostos implementados com TemplateMethod como estrategia do padrão Strategy
         */
        calculadoraDeImposto.realizaCalculo(orcamento, icpp);
        calculadoraDeImposto.realizaCalculo(orcamento, ikcv);
    }
}
