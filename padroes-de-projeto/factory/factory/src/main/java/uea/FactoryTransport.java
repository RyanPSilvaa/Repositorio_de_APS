package uea;

public class FactoryTransport {
    public criarTransporte(String tipo){
        if (tipo.equalsIgnoreCase(anotherString:"carro")){
            return new Carro();
            
        } else if (tipo.equalsIgnoreCase(anotherString:"bike")){
            return new Bike();

        }
        else if (tipo.equalsIgnoreCase(anotherString:"motocicleta")){
            return new Motocycle();

        } else {
            throw IllegalArgumentException("Tipo de Transporte não suportado");
        }
    }
}
