package encapsulamentoTrier;

import java.util.ArrayList;

public class Hamburguer {

    private ArrayList<String> ingredientes = new ArrayList<>();

    public void adicionarIngrediente(String ingrediente) {
        if (ingredientes != null && !ingrediente.isEmpty()) {
            ingredientes.add(ingrediente);
        } else {
            System.out.println("Erro ao adicionar ingrediente!\n Não pode ser" + "null ou vazio");
        }
    }


        public void mostrarHamburguer() {
            System.out.printf("Hamburguer com %s \n", ingredientes);
        }
    }

