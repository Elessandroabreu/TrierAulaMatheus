package Lanchonete;

class Sobremesa extends Produto {
    private String sabor;

    // Construtor
    public Sobremesa(String nome, double preco, String sabor) {
        super(nome, preco, "SOBREMESA"); // chama construtor da classe pai
        this.sabor = sabor;
    }

    // Sobrescreve método da classe pai
    @Override
    public void mostrarInfo() {
        System.out.println(nome + " - R$ " + String.format("%.2f", preco) +
                " (" + sabor + ")");
    }

    public String getSabor() {
        return sabor;
    }
}