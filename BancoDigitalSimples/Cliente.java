package BancoDigitalSimples;

class Cliente {
    // Atributos privados (encapsulamento)
    private String nome;
    private String cpf;

    // Construtor
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Métodos para acessar os dados (getters)
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}