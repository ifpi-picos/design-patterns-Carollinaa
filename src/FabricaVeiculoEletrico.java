public class FabricaVeiculoEletrico extends FabricaVeiculo{

    @Override
    public Carro createCarro() {
        return new CarroEletrico();
    }

    @Override
    public Moto createMoto() {
        return new MotoEletrica();
    }
    
   
}
