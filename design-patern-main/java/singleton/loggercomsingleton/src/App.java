public class App {
    public static void main(String[] args) throws Exception {
        // Obtendo a mesma instância do Logger em cada chamada
        Logger logger1 = Logger.getInstance();
        logger1.log("Mensagem 1");

        Logger logger2 = Logger.getInstance();
        logger2.log("Mensagem 2");

        Logger logger3 = Logger.getInstance();
        logger3.log("Mensagem 3");
    }
}
