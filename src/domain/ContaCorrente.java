package domain;

import exceptions.SaldoException;

public class ContaCorrente extends Conta   {
    
    public ContaCorrente(CLiente cliente, Banco banco) {
        super(cliente, banco);
        this.tipo = "Conta Corrente";
        this.taxa = 2;
    }

    @Override
    public void sacar(double valor) throws SaldoException {
        if (valor + taxa > saldo){
            throw new SaldoException("Saldo Indisponível pois valor da operação + taxa supera o saldo atual:  " + saldo);
        }
        super.sacar(valor);
        this.taxa(taxa,this.banco);
    }

    @Override
    public void transferir(double valor, IConta conta_destino) throws SaldoException {
        if (valor + taxa > saldo){
            throw new SaldoException("Saldo Indisponível pois valor da operação + taxa supera o saldo atual:  " + saldo);
        }
        super.transferir(valor, conta_destino);
        this.taxa(taxa,this.banco);
    } 
     

}
