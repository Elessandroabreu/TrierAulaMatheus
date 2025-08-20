package encapsulamentoTrier;

public class ContaBancariaMain {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("jude",1000000);
        conta.depositar(5000);
        conta.sacar(1000);
//        conta.saldo = 5000;

        System.out.printf("Titular: %s\n", conta.getTitular());
        System.out.printf("Saldo: R$ %.2f\n", conta.getSaldo());


    }
}
