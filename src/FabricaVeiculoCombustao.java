public class FabricaVeiculoCombustao extends FabricaVeiculo {

    @Override
    public Carro createCarro() {
        return new CarroCombustao();
    }

    @Override
    public Moto createMoto() {
        return new MotoCombustao();
    }


}
