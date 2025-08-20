package encapsulamentoTrier;

public class SuperMercadoMain {

    public static void main(String[] args) {

        Caixa caixa = new Caixa();

        caixa.adicionarCompra(10.50);
        caixa.adicionarCompra(5.20);
        System.out.printf("Total da compra R$ %.2f%n", caixa.getTotalCompra());
    }
}
