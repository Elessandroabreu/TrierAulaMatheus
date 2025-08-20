package BancoDigitalPro;

import java.util.ArrayList;

abstract class Conta {

    protected Cliente cliente;
    protected int numero;
    protected double saldo;
    protected ArrayList<String> extrato;
    protected boolean ativa;
    protected int diasNegativo;


    public Conta(Cliente cliente, int numero) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = 0.0;
        this.extrato = new ArrayList<>();
        this.ativa = true;
        this.diasNegativo = 0;
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

    public boolean isAtiva() {
        return ativa;
    }


    public void depositar(double valor) {
        if (valor > 0 && ativa) {
            saldo += valor;
            extrato.add("DEPÓSITO: +R$ " + String.format("%.2f", valor));
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) +
                    " realizado. Saldo: R$ " + String.format("%.2f", saldo));
        } else {
            System.out.println("Valor inválido ou conta inativa!");
        }
    }


    public abstract boolean sacar(double valor);


    public void transferir(Conta contaDestino, double valor) {
        System.out.println("Transferindo R$ " + String.format("%.2f", valor) +
                " para conta " + contaDestino.getNumero() + "...");
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada!");
        } else {
            System.out.println("Transferência falhou!");
        }
    }


    public void mostrarExtrato() {
        System.out.println("\n=== EXTRATO CONTA " + numero + " ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Movimentações:");
        if (extrato.isEmpty()) {
            System.out.println("Nenhuma movimentação.");
        } else {
            for (String movimento : extrato) {
                System.out.println(movimento);
            }
        }
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
        System.out.println("Status: " + (ativa ? "ATIVA" : "BLOQUEADA"));
        System.out.println("===============================\n");
    }


    public void verificarBloqueio() {
        if (saldo < 0) {
            diasNegativo++;
            if (diasNegativo >= 30) {
                ativa = false;
                System.out.println("CONTA " + numero + " BLOQUEADA - Saldo negativo por 30 dias!");
            }
        } else {
            diasNegativo = 0;
        }
    }
}