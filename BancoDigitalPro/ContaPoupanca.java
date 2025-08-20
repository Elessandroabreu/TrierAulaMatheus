package BancoDigitalPro;


class ContaPoupanca extends Conta {



    public ContaPoupanca(Cliente cliente, int numero) {
        super(cliente, numero); // chama construtor da classe pai
    }


    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo && ativa) {
            saldo -= valor;
            extrato.add("SAQUE: -R$ " + String.format("%.2f", valor));
            System.out.println("Saque de R$ " + String.format("%.2f", valor) +
                    " realizado. Saldo: R$ " + String.format("%.2f", saldo));
            return true;
        } else {
            System.out.println("Saldo insuficiente, valor inválido ou conta inativa!");
            return false;
        }
    }


    public void aplicarRendimento() {
        if (saldo > 0) {
            double rendimento = saldo * 0.005; // 0.5% ao mês
            saldo += rendimento;
            extrato.add("RENDIMENTO: +R$ " + String.format("%.2f", rendimento));
            System.out.println("Rendimento aplicado: R$ " + String.format("%.2f", rendimento));
        }
    }
}