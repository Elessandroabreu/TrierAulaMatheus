package BancoDigitalSimples;

class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente, int numero) {
        super(cliente, numero);
    }


    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) +
                    " realizado. Saldo: R$ " + String.format("%.2f", saldo));
            return true;
        } else {
            System.out.println("Não é possível sacar! Saldo insuficiente ou valor inválido.");
            return false;
        }
    }
}