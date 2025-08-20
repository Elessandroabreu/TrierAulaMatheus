package Lanchonete;

import java.util.ArrayList;

class Pedido {
    private ArrayList<ItemPedido> itens;
    private int numeroPedido;
    private static int contadorPedidos = 1000; // para gerar números únicos

    // Construtor
    public Pedido() {
        this.itens = new ArrayList<>();
        this.numeroPedido = ++contadorPedidos;
    }

    // Adicionar item ao pedido
    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido itemPedido = new ItemPedido(produto, quantidade);
        itens.add(itemPedido);
        System.out.println("Item adicionado: " + quantidade + "x " + produto.getNome());
    }

    // Calcular valor total do pedido
    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido itemPedido : itens) {
            total += itemPedido.getSubtotal();
        }
        return total;
    }

    // Gerar recibo detalhado
    public void gerarRecibo() {
        System.out.println("\n========== RECIBO ==========");
        System.out.println("Pedido #" + numeroPedido);
        System.out.println("---------------------------");

        for (ItemPedido itemPedido : itens) {
            itemPedido.mostrarItemPedido();
        }

        System.out.println("---------------------------");
        System.out.println("TOTAL: R$ " + String.format("%.2f", calcularTotal()));
        System.out.println("============================\n");
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }
}