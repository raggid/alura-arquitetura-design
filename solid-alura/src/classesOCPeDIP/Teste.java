public class Teste {
    public static void main(String[] args) {
        CalculadoraDePrecos calc = new CalculadoraDePrecos(new TabelaDePrecoPadrao(), new Frete());

        System.out.println(calc.calcula(new Compra(100, "Manaus")));
    }
}
