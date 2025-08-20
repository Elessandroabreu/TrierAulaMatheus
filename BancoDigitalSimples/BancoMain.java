package BancoDigitalSimples;

import java.util.Scanner;

public class BancoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA BANCÁRIO BÁSICO ===\n");

        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Santos", "987.654.321-00");

        // Criando contas
        ContaCorrente cc1 = new ContaCorrente(cliente1, 1001);
        ContaPoupanca cp1 = new ContaPoupanca(cliente2, 2001);

        System.out.println("Contas criadas com sucesso!");
        System.out.println("- Conta Corrente " + cc1.getNumero() + " - " + cliente1.getNome());
        System.out.println("- Conta Poupança " + cp1.getNumero() + " - " + cliente2.getNome());

        // Menu básico
        int opcao;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Depositar na Conta Corrente");
            System.out.println("2. Depositar na Conta Poupança");
            System.out.println("3. Sacar da Conta Corrente");
            System.out.println("4. Sacar da Conta Poupança");
            System.out.println("5. Transferir CC -> CP");
            System.out.println("6. Transferir CP -> CC");
            System.out.println("7. Consultar saldo CC");
            System.out.println("8. Consultar saldo CP");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depositar na Conta Corrente: R$ ");
                    double valor1 = scanner.nextDouble();
                    cc1.depositar(valor1);
                    break;

                case 2:
                    System.out.print("Valor para depositar na Conta Poupança: R$ ");
                    double valor2 = scanner.nextDouble();
                    cp1.depositar(valor2);
                    break;

                case 3:
                    System.out.print("Valor para sacar da Conta Corrente: R$ ");
                    double valor3 = scanner.nextDouble();
                    cc1.sacar(valor3);
                    break;

                case 4:
                    System.out.print("Valor para sacar da Conta Poupança: R$ ");
                    double valor4 = scanner.nextDouble();
                    cp1.sacar(valor4);
                    break;

                case 5:
                    System.out.print("Valor para transferir CC -> CP: R$ ");
                    double valor5 = scanner.nextDouble();
                    cc1.transferir(cp1, valor5);
                    break;

                case 6:
                    System.out.print("Valor para transferir CP -> CC: R$ ");
                    double valor6 = scanner.nextDouble();
                    cp1.transferir(cc1, valor6);
                    break;

                case 7:
                    cc1.consultarSaldo();
                    break;

                case 8:
                    cp1.consultarSaldo();
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
        System.out.println("Sistema encerrado com sucesso!");
    }
}