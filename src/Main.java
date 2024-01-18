public class Main {
    public static void main(String[] args){
        FabricaVeiculo fabricaEletrica = new FabricaVeiculoEletrico();
        Motorista clienteEletrico = new Motorista(fabricaEletrica);
        clienteEletrico.dirigir();

        System.out.println("\n----------------------\n");

        FabricaVeiculo fabricaCombustao = new FabricaVeiculoCombustao();
        Motorista clienteCombustao = new Motorista(fabricaCombustao);
        clienteCombustao.dirigir();
}
    }   
