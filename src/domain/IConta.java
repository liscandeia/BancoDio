package domain;

import exceptions.SaldoException;

public interface IConta {
    void sacar(double valor) throws SaldoException;
    void depositar(double valor);
    void saldo();
    void transferir(double valor, IConta conta_destino)throws SaldoException;
    void taxa(double valor, Banco banco)throws SaldoException;
    
} 

