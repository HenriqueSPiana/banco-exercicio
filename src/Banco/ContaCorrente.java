package Banco;

public class ContaCorrente extends ContaBancaria{


    public ContaCorrente(String dono, double saldo, TipoConta tipoConta) {
        super(dono, saldo, tipoConta);
    }

    public void depositar(double valor){
        this.saldo = saldo+valor;
    }


}
