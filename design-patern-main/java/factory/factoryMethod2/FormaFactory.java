
// Simple Factory
public class FormaFactory {
    public static Forma criarForma(String tipo) {
        switch (tipo.toLowerCase()) {
            case "circulo":
                return new Circulo();
            case "quadrado":
                return new Quadrado();
            case "retangulo":
                return new Retangulo();
            default:
                throw new IllegalArgumentException("Tipo de forma desconhecido: " + tipo);
        }
    }
}