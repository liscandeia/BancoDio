
import domain.Banco;
import domain.CLiente;
import domain.ContaCorrente;
import domain.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        CLiente cLiente = new CLiente("Lis", "055", 24);
        Banco banco = new Banco("Flor de Lis");
        ContaCorrente cc = new ContaCorrente(cLiente, banco);
        ContaPoupanca cd = new ContaPoupanca(cLiente, banco);
        cd.depositar(1000);
        cc.depositar(1000);
        cc.sacar(998);
        cd.sacar(1000);
        cd.depositar(1000);
        cc.depositar(1000);
        cc.transferir(998, cd);
        cd.transferir(1000, cc);
        cc.saldo();
        cd.saldo();
        System.out.println("Lucro das operações: " + banco.getLucroTaxa());
        System.out.println(banco);
    }
}
