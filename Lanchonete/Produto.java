package Lanchonete;

abstract class Produto {
    // Atributos protegidos (encapsulamento)
    protected String nome;
    protected double preco;
    protected String categoria;

    // Construtor
    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    // Métodos para acessar dados (getters)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }


    public abstract void mostrarInfo();
}