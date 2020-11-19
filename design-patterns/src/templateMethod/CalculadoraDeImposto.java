package templateMethod;

public class CalculadoraDeImposto {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto){
        System.out.println(imposto.calcula(orcamento));
    }
}
