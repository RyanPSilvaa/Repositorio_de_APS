package edu.uea;

// Classe para testar o padrão Proxy
public class Main {
    public static void main(String[] args) {
        DatabaseService dbService = new DatabaseServiceProxy();
        dbService.requestData(); // Primeira chamada, vai para o banco de dados real
        dbService.requestData(); // Segunda chamada, usa o cache
    }
}