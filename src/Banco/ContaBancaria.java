package Banco;

public abstract class ContaBancaria implements Conta{

    public String dono;
    public double saldo;
    public TipoConta tipoConta;


    @Override
    public void consultarSaldo() {

    }

    @Override
    public void depositar(double valor) {

    }
}
