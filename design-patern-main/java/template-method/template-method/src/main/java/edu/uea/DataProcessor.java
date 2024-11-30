package edu.uea;

// Classe abstrata definindo o template
abstract class DataProcessor {
    // Template method
    public final void processData() {
        readData();
        processDataImplementation();
        saveData();
    }

    // Passos concretos
    protected void readData() {
        System.out.println("Lendo dados...");
    }

    protected void saveData() {
        System.out.println("Salvando dados...");
    }

    // Passo abstrato que será implementado pelas subclasses
    protected abstract void processDataImplementation();
}