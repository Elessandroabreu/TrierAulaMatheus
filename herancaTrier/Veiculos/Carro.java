package herancaTrier.Veiculos;

public class Carro extends Veiculo {
    int portas;

    void abrirPortaMalas(){
        System.out.println("Abrindo porta malas...\n");
    }

    @Override
    void acelerar(){
        System.out.printf("\n O carro está acelerando de porta malas aberto...");
    }

    @Override
    void frear(){
        System.out.printf("O carro esta freando com o porta malas aberto\n", this.portas );
    }
}
