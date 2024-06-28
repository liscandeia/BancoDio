package domain;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;

    private List<Conta> contas;
    private double lucroTaxa;

    public double getLucroTaxa() {
        return lucroTaxa;
    }
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    } 

    protected double depositarTaxa(double valor){
        return lucroTaxa += valor;
    }
    public void adicionarConta(Conta conta) {
        this.contas.add(conta); 
    }
    @Override
    public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Banco: ").append(nome).append("\n");
            sb.append("Contas: ").append(contas.size()).append("\n");
            for (Conta conta : contas) {
                sb.append(conta.toString()).append("\n");
            }
            return sb.toString();
    }

}
