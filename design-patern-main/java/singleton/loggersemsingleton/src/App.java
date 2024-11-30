
public class App {
    public static void main(String[] args) throws Exception {
        // Criando múltiplas instâncias de Logger
        Logger logger1 = new Logger();
        logger1.log("Mensagem 1");

        Logger logger2 = new Logger();
        logger2.log("Mensagem 2");

        Logger logger3 = new Logger();
        logger3.log("Mensagem 3");
    }
    
}
