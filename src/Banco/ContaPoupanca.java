package Banco;

public class ContaPoupanca extends ContaBancaria{


    public void depositar(double valor){

        this.saldo = saldo+ (valor - (valor * 0.01));


    }

    public ContaPoupanca(String dono, double saldo, TipoConta tipoConta) {
        super(dono, saldo, tipoConta);
    }
}
