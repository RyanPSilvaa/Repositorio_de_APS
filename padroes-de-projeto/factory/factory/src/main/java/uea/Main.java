package uea;

public class Main {
    public static void main(String[] args) {
        FactoryTransport factory = new FactoryTransport();

        Transport transport  = factory.criarTransporte(tipo:"carro")
        
        Transport.dirigir();
    }
}