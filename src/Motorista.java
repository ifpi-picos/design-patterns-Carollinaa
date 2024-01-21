public class Motorista {

    private FabricaVeiculo fabrica;
    private Carro carro;
    private Moto moto;

    public Motorista(FabricaVeiculo fabrica) {
        this.fabrica = fabrica;
        this.carro = this.fabrica.createCarro();
        this.moto = this.fabrica.createMoto();
    }

    public void dirigir() {
        carro.acelerar();
        moto.acelerar();
    }
}

