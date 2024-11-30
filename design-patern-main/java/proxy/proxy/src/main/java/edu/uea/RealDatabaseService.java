package edu.uea;

// Implementação real do serviço
public class RealDatabaseService implements DatabaseService {
    @Override
    public void requestData() {
        System.out.println("Obtendo dados do banco de dados real...");
    }

}
