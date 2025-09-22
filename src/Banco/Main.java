package Banco;

public class Main {
    public static void main(String[] args) {



        ContaCorrente conta1 = new ContaCorrente("Henrique",999.00,TipoConta.CORRENTE);
        ContaPoupanca conta2 = new ContaPoupanca("Joana", 100D ,TipoConta.POUPANCA);



        conta1.consultarSaldo();
        conta1.depositar(30D);
        conta1.consultarSaldo();

        conta2.consultarSaldo();
        conta2.depositar(100D);
        conta2.consultarSaldo();


    }
}
