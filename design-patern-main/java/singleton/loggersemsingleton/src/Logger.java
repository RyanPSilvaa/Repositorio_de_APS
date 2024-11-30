// Classe Logger sem Singleton
public class Logger {
    public Logger() {
        System.out.println("Nova instância do Logger criada!");
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
