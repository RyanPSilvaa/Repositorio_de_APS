import factory.FabricaVeiculo;
import factory.Veiculo;

public class Cliente {
    public static void main(String[] args) {
        Veiculo v1 = FabricaVeiculo.criarVeiculo("Bicicleta");
        v1.iniciarRota();
        v1.buscarCliente();

        Veiculo v2 = FabricaVeiculo.criarVeiculo("Carro");
        v2.iniciarRota();
        v2.buscarCliente();

        Veiculo v3 = FabricaVeiculo.criarVeiculo("Motocicleta");
        v3.iniciarRota();
        v3.buscarCliente();

        Veiculo v4 = FabricaVeiculo.criarVeiculo("Onibus");

    }
}
