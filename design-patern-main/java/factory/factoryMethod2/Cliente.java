
public class Cliente {
    public static void main(String[] args) {
        Forma forma1 = FormaFactory.criarForma("circulo");
        Forma forma2 = FormaFactory.criarForma("quadrado");
        Forma forma3 = FormaFactory.criarForma("retangulo");

        forma1.desenhar(); // Saída: Desenhando um círculo.
        forma2.desenhar(); // Saída: Desenhando um quadrado.
        forma3.desenhar(); // Saída: Desenhando um retângulo.
    }
}
