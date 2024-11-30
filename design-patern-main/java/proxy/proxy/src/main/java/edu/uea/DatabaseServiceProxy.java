package edu.uea;

// Proxy que controla o acesso ao serviço real
public class DatabaseServiceProxy implements DatabaseService {
    private RealDatabaseService realDatabaseService;
    private boolean cacheValid = false;

    @Override
    public void requestData() {
        if (cacheValid) {
            System.out.println("Usando dados do cache...");
        } else {
            if (realDatabaseService == null) {
                realDatabaseService = new RealDatabaseService();
            }
            realDatabaseService.requestData();
            cacheValid = true;
            System.out.println("Dados armazenados no cache.");
        }
    }

}
