package herancaTrier.Animal;

public class AnimalMain {
    public static void main(String[] args) {

        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Jabuti jabuti = new Jabuti();

        System.out.println();

        gato.nome = "Garfield";
        gato.raca = "Persa";
        gato.peso = 100;
        gato.sexo = 'M';
        gato.comer();
        gato.dormir();
        gato.comer();

        System.out.println();

        cachorro.nome = "Vagner";
        cachorro.raca = "Viralata";
        cachorro.peso = 50;
        cachorro.sexo = 'M';

        cachorro.comer();
        cachorro.dormir();
        cachorro.latir();

        System.out.println();

        jabuti.nome = "Griselda";
        jabuti.raca = "Jabuti";
        jabuti.sexo = 'P';
        jabuti.peso = 1;

        jabuti.comer();
        jabuti.dormir();
        jabuti.viver();

    }
}
