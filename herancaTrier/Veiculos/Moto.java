package herancaTrier.Veiculos;

public class Moto extends Veiculo{
    void empinar(){
        System.out.println("A moto está empinando...");
    }

    @Override
        void acelerar(){
        System.out.println("\nA moto está acelerando e empinando..\n");
            };

    @Override
    void frear(){
        System.out.println("A moto esta fazendo e empinando ao contrario\n");
    }

}
