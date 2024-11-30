package edu.uea;

public class Singleton {
	// Instância privada e estática da própria classe
	private static Singleton instance;

	// Construtor privado para impedir a criação de novos objetos fora da classe
	private Singleton() {
	}

	// Método público e estático para obter a instância única
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			// Cria a instância caso ainda não exista
			instance = new Singleton();
		}
		return instance;
	}

	// Exemplo de método que pode ser acessado pela instância Singleton
	public void showMessage(String mensage) {
		System.out.println(mensage);
	}

}
