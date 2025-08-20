package Lanchonete;

class Lanche extends Produto {
    private String ingredientes;

    // Construtor
    public Lanche(String nome, double preco, String ingredientes) {
        super(nome, preco, "LANCHE"); // chama construtor da classe pai
        this.ingredientes = ingredientes;
    }

    // Sobrescreve método da classe pai
    @Override
    public void mostrarInfo() {
        System.out.println(nome + " - R$ " + String.format("%.2f", preco) +
                " (" + ingredientes + ")");
    }

    public String getIngredientes() {
        return ingredientes;
    }
}