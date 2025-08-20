package BancoDigitalSimples;

abstract class Conta {

    protected Cliente cliente;
    protected int numero;
    protected double saldo;


    public Conta(Cliente cliente, int numero) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = 0.0;
    }


    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) +
                    " realizado. Saldo: R$ " + String.format("%.2f", saldo));
        } else {
            System.out.println("Valor inválido! Deve ser maior que zero.");
        }
    }


    public abstract boolean sacar(double valor);


    public void transferir(Conta contaDestino, double valor) {
        System.out.println("Transferindo R$ " + String.format("%.2f", valor) +
                " para conta " + contaDestino.getNumero() + "...");
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Transferência falhou!");
        }
    }


    public void consultarSaldo() {
        System.out.println("=== CONSULTA DE SALDO ===");
        System.out.println("Conta: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
        System.out.println("========================");
    }
}