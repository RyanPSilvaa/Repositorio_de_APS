package factory.method;


//Produto abstrato
interface Transporte {
 void dirigir();
}

//Produtos concretos
class Carro implements Transporte {
 @Override
 public void dirigir() {
     System.out.println("Dirigindo um carro.");
 }
}

class Bicicleta implements Transporte {
 @Override
 public void dirigir() {
     System.out.println("Pedalando uma bicicleta.");
 }
}

//Fábrica
class TransporteFactory {
 public Transporte criarTransporte(String tipo) {
     if (tipo.equalsIgnoreCase("carro")) {
         return new Carro();
     } else if (tipo.equalsIgnoreCase("bicicleta")) {
         return new Bicicleta();
     } else {
         throw new IllegalArgumentException("Tipo de transporte desconhecido.");
     }
 }
}

public class Main {
    public static void main(String[] args) {
        TransporteFactory fabrica = new TransporteFactory();

        String tipoTransporte = "carro";  // Troque para "bicicleta" para testar a outra opção
        Transporte transporte = fabrica.criarTransporte(tipoTransporte);

        transporte.dirigir();
    }
}