public class FabricaVeiculo {
        public static Veiculo criarVeiculo(String tipo) {
            if (tipo.equals("Bicicleta")) {
                return new Bicicleta();
            } else if (tipo.equals("Motocicleta")) {
                return new Motocicleta();
            } else if (tipo.equals("Carro")) {
                return new Carro();
            } else {
                throw new IllegalArgumentException("Tipo de veículo desconhecido: " + tipo);
            }
        }
    
}
