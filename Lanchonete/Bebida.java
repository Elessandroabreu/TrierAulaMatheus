package Lanchonete;

class Bebida extends Produto {
    private String tamanho;

    // Construtor
    public Bebida(String nome, double preco, String tamanho) {
        super(nome, preco, "BEBIDA"); // chama construtor da classe pai
        this.tamanho = tamanho;
    }

    // Sobrescreve método da classe pai
    @Override
    public void mostrarInfo() {
        System.out.println(nome + " - R$ " + String.format("%.2f", preco) +
                " (" + tamanho + ")");
    }

    public String getTamanho() {
        return tamanho;
    }

}