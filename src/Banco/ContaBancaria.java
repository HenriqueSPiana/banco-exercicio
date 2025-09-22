package Banco;

public abstract class ContaBancaria implements Conta{

    public String dono;
    public double saldo;
    public TipoConta tipoConta;


    @Override
    public void consultarSaldo() {
        System.out.println("voce, "+ this.dono+" tem um total de R$:" + this.saldo);
    }

    @Override
    public void depositar(double valor) {
    }

    public ContaBancaria(String dono, double saldo, TipoConta tipoConta) {
        this.dono = dono;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }
}
