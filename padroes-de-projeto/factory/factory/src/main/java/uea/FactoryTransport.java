package uea;

public class FactoryTransport {
    public Transport criarTransporte(String tipo){
        if (tipo.equalsIgnoreCase("carro")){
            return new Carro();
            
        } else if (tipo.equalsIgnoreCase("bike")){
            return new Bike();

        }
        else if (tipo.equalsIgnoreCase("motocicleta")){
            return new Motocycle();

        } else {
            throw new IllegalArgumentException("Tipo de Transporte não suportado");
        }
    }
}
