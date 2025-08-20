package Lanchonete;

import java.util.ArrayList;

class Cardapio {
    private ArrayList<Produto> itens;

    // Construtor
    public Cardapio() {
        this.itens = new ArrayList<>();
        criarCardapioInicial();
    }

    // Criar cardápio inicial com alguns itens
    private void criarCardapioInicial() {
        // Lanches
        itens.add(new Lanche("X-Burger", 12.50, "Pão, hambúrguer, queijo, alface"));
        itens.add(new Lanche("X-Bacon", 15.00, "Pão, hambúrguer, queijo, bacon"));
        itens.add(new Lanche("X-Tudo", 18.50, "Pão, hambúrguer, queijo, bacon, ovo, salada"));

        // Bebidas
        itens.add(new Bebida("Coca-Cola", 5.00, "350ml"));
        itens.add(new Bebida("Suco de Laranja", 6.50, "300ml"));
        itens.add(new Bebida("Água", 2.50, "500ml"));

        // Sobremesas
        itens.add(new Sobremesa("Sorvete", 8.00, "Chocolate"));
        itens.add(new Sobremesa("Torta", 10.00, "Morango"));
        itens.add(new Sobremesa("Pudim", 7.50, "Leite condensado"));
    }

    // Mostrar cardápio completo
    public void mostrarCardapio() {
        System.out.println("\n========== CARDÁPIO ==========");

        System.out.println("\n--- LANCHES ---");
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getCategoria().equals("LANCHE")) {
                System.out.print((i + 1) + ". ");
                itens.get(i).mostrarInfo();
            }
        }

        System.out.println("\n--- BEBIDAS ---");
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getCategoria().equals("BEBIDA")) {
                System.out.print((i + 1) + ". ");
                itens.get(i).mostrarInfo();
            }
        }

        System.out.println("\n--- SOBREMESAS ---");
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getCategoria().equals("SOBREMESA")) {
                System.out.print((i + 1) + ". ");
                itens.get(i).mostrarInfo();
            }
        }
        System.out.println("==============================\n");
    }

    // Buscar item por número
    public Produto buscarItem(int numero) {
        if (numero >= 1 && numero <= itens.size()) {
            return itens.get(numero - 1);
        }
        return null;
    }

    public int getTotalItens() {
        return itens.size();
    }
}