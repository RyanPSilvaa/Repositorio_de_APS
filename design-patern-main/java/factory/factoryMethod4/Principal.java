public class Principal {
    public static void main(String[] args) {
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos(FactoryLogPrinter.getLogPrinter("CONSOLE"));
        calculadora.calcular(1000);
    }
}
