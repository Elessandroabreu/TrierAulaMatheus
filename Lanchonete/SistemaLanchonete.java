package Lanchonete;

import java.util.Scanner;

public class SistemaLanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();

        System.out.println("=== SISTEMA DE LANCHONETE ===");
        System.out.println("Bem-vindo à nossa lanchonete!");

        int opcao;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Ver cardápio");
            System.out.println("2. Fazer pedido");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cardapio.mostrarCardapio();
                    break;

                case 2:
                    fazerPedido(scanner, cardapio);
                    break;

                case 0:
                    System.out.println("Obrigado por usar nosso sistema!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    // Método para fazer um pedido
    public static void fazerPedido(Scanner scanner, Cardapio cardapio) {
        Pedido pedido = new Pedido();

        System.out.println("\n=== NOVO PEDIDO ===");
        cardapio.mostrarCardapio();

        String continuar;
        do {
            System.out.print("Digite o número do item (1 a " + cardapio.getTotalItens() + "): ");
            int numeroItem = scanner.nextInt();

            Produto itemEscolhido = cardapio.buscarItem(numeroItem);

            if (itemEscolhido != null) {
                System.out.print("Digite a quantidade: ");
                int quantidade = scanner.nextInt();

                if (quantidade > 0) {
                    pedido.adicionarItem(itemEscolhido, quantidade);
                } else {
                    System.out.println("Quantidade deve ser maior que zero!");
                }
            } else {
                System.out.println("Item inválido!");
            }

            System.out.print("Deseja adicionar mais itens? (s/n): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar resumo e confirmar pedido
        System.out.println("\n=== RESUMO DO PEDIDO ===");
        pedido.gerarRecibo();

        System.out.print("Confirmar pedido? (s/n): ");
        String confirmar = scanner.next();

        if (confirmar.equalsIgnoreCase("s")) {
            System.out.println("Pedido confirmado! Obrigado pela preferência!");
            System.out.println("Aguarde, estamos preparando seu pedido...");
        } else {
            System.out.println("Pedido cancelado.");
        }
    }
}