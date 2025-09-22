package Banco;

public class ContaPoupanca extends ContaBancaria{


    public void depositar(double valor){

        this.saldo = saldo+ (valor * 0.99);
        System.out.println("Foi retido 1% do valor que voce depositou por ser uma conta poupança");


    }

    public ContaPoupanca(String dono, double saldo, TipoConta tipoConta) {
        super(dono, saldo, tipoConta);
    }
}
