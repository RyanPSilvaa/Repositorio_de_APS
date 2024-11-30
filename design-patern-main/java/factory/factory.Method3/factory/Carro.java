public class Carro implements Veiculo {
    @Override
    public void iniciarRota() {
        System.out.println("Iniciando a rota de carro.");
    }
    @Override
    public void buscarCliente() {
        System.out.println("Buscando cliente de carro.");
    }
}
