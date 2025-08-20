package BancoDigitalPro;

import java.util.Scanner;

public class BancoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA BANCÁRIO ===\n");

        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Santos", "987.654.321-00");

        // Criando contas
        ContaCorrente cc1 = new ContaCorrente(cliente1, 1001, 500.0); // limite R$ 500
        ContaPoupanca cp1 = new ContaPoupanca(cliente2, 2001);

        System.out.println("Contas criadas:");
        System.out.println("- Conta Corrente " + cc1.getNumero() + " - " + cliente1.getNome());
        System.out.println("- Conta Poupança " + cp1.getNumero() + " - " + cliente2.getNome());

        // Menu simples
        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Depositar em CC");
            System.out.println("2. Depositar em CP");
            System.out.println("3. Sacar de CC");
            System.out.println("4. Sacar de CP");
            System.out.println("5. Transferir CC -> CP");
            System.out.println("6. Extrato CC");
            System.out.println("7. Extrato CP");
            System.out.println("8. Aplicar rendimento CP");
            System.out.println("9. Verificar bloqueios");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depositar em CC: R$ ");
                    double valor1 = scanner.nextDouble();
                    cc1.depositar(valor1);
                    break;

                case 2:
                    System.out.print("Valor para depositar em CP: R$ ");
                    double valor2 = scanner.nextDouble();
                    cp1.depositar(valor2);
                    break;

                case 3:
                    System.out.print("Valor para sacar de CC: R$ ");
                    double valor3 = scanner.nextDouble();
                    cc1.sacar(valor3);
                    break;

                case 4:
                    System.out.print("Valor para sacar de CP: R$ ");
                    double valor4 = scanner.nextDouble();
                    cp1.sacar(valor4);
                    break;

                case 5:
                    System.out.print("Valor para transferir CC -> CP: R$ ");
                    double valor5 = scanner.nextDouble();
                    cc1.transferir(cp1, valor5);
                    break;

                case 6:
                    cc1.mostrarExtrato();
                    break;

                case 7:
                    cp1.mostrarExtrato();
                    break;

                case 8:
                    cp1.aplicarRendimento();
                    break;

                case 9:
                    cc1.verificarBloqueio();
                    cp1.verificarBloqueio();
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
        System.out.println("Sistema encerrado!");
    }
}