package Lanchonete;

class ItemPedido {
    private Produto produto;
    private int quantidade;

    // Construtor
    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    // Getters
    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Calcula o subtotal do item
    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }

    // Mostra informações do item no pedido
    public void mostrarItemPedido() {
        System.out.println(quantidade + "x " + produto.getNome() +
                " - R$ " + String.format("%.2f", produto.getPreco()) +
                " cada = R$ " + String.format("%.2f", getSubtotal()));
    }
}
