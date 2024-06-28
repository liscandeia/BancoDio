package domain;

import exceptions.SaldoException;

public class ContaPoupanca extends Conta {
   

    public ContaPoupanca(CLiente cliente, Banco banco) {
        super(cliente, banco);
        this.tipo = "Conta Poupança";
        this.taxa = 5;
    }

    private int saques = 0;
 
    public int getSaques() {
        return saques;
    }

    @Override
    public void sacar(double valor) throws SaldoException {
        if(saques >= 4) {
            if (valor + taxa > saldo){
                throw new SaldoException("Saldo Indisponível pois valor da operação + taxa supera o saldo atual:  " + saldo);
            } 
            this.taxa(taxa,this.banco);
        } 
        saques ++;
        super.sacar(valor);
    }
 }  

        



