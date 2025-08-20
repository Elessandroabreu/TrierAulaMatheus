package herancaTrier.Animal;

public class Cachorro extends Animal {

    @Override
    void dormir(){
        System.out.println("O animal esta dormindo...\n");
    }

    @Override
    void comer(){
        System.out.println("O animal esta comendo...\n");
    }

    @Override
    void andar(){
        System.out.println("O animal esta andando...\n");
    }
//    @Override
    void latir(){
        System.out.println("O animal esta latindo...\n");
    }
}
