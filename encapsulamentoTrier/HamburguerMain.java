package encapsulamentoTrier;

public class HamburguerMain {
    public static void main(String[] args) {

        Hamburguer hamburguer = new Hamburguer();

        hamburguer.adicionarIngrediente("Pao");
        hamburguer.adicionarIngrediente("Queijo");
        hamburguer.adicionarIngrediente("Hamburguer");
        hamburguer.adicionarIngrediente("Coração");
        hamburguer.adicionarIngrediente("Barbecue");
        hamburguer.adicionarIngrediente("Cebola Caramelisada");

        hamburguer.mostrarHamburguer();

    }
}

