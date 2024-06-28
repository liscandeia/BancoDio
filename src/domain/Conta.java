package domain;

import exceptions.SaldoException;

public abstract class Conta implements IConta{
    private static final int agencia_default = 7;
    private static int gerador = 1;
    protected int agencia;
    protected int conta;
    protected double saldo;
    protected CLiente cliente; 
    protected Banco banco;
    protected String tipo;
    protected int taxa;

    public Conta(CLiente cliente,Banco banco) {
        this.agencia = Conta.agencia_default;
        this.conta = Conta.gerador++;
        this.cliente = cliente;
        this.banco = banco;
        this.banco.adicionarConta(this);
    }

    @Override
    public void sacar(double valor) throws SaldoException {
        if (valor > saldo){
            throw new SaldoException("Saldo Indisponível para saque, saldo atual: " + saldo);
       }
       saldo -= valor;
       System.out.println("Saque realizado com sucesso!");
    }
    

    @Override
    public void depositar(double valor) {
       saldo += valor;
    }

    @Override
    public void saldo() {
        get_info_conta();
    }

    @Override
    public void transferir(double valor, IConta conta_destino) throws SaldoException{
        if (valor > saldo){
            throw new SaldoException("Saldo Indisponível para tranferência, saldo atual: " + saldo);
       }
       saldo -= valor;
       conta_destino.depositar(valor);
       System.out.println("Transgerência realizada com sucesso!");
    }

    protected void get_info_conta(){
        System.out.println("Bem Vindo ao Banco: " + banco.getNome());
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Tipo de Conta: " + tipo);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.conta);
        System.out.println("Saldo: " + this.saldo);
    }

    @Override
    public void taxa(double valor, Banco banco) throws SaldoException {
        this.banco.depositarTaxa(valor);
        saldo -= valor;
    }

    public String toString() {
        return "Titular: " + this.cliente.getNome() + ", Tipo de Conta: " + this.tipo;
    }
}
