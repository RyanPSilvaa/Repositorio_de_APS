public class Logger {
    // Atributo estático que mantém a instância única
    private static Logger instance;

    // Construtor privado para evitar a criação de novas instâncias
    private Logger() {
        System.out.println("Instância única do Logger criada!");
    }

    // Método para obter a instância única
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
