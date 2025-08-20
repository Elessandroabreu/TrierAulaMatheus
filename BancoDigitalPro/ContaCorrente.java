package BancoDigitalPro;

class ContaCorrente extends Conta {
    private double limite; // limite especial

    // Construtor
    public ContaCorrente(Cliente cliente, int numero, double limite) {
        super(cliente, numero); // chama construtor da classe pai
        this.limite = limite;
    }

//     Sobrescreve o método sacar permite usar limite
    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limite) && ativa) {
            saldo -= valor;
            extrato.add("SAQUE: -R$ " + String.format("%.2f", valor));
            System.out.println("Saque de R$ " + String.format("%.2f", valor) +
                    " realizado. Saldo: R$ " + String.format("%.2f", saldo));
            return true;
        } else {
            System.out.println("Não é possível sacar! Limite excedido ou conta inativa.");
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }
}