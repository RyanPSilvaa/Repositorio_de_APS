package edu.uea;

public class Main {
    public static void main(String[] args) {
        // Obtém a única instância do Singleton e chama o método
		Singleton singleton = Singleton.getInstance();
		singleton.showMessage("Olá mundo com Singleton!!!");
    }
}