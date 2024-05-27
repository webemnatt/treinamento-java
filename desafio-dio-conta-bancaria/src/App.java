import com.banco.conta.*;
import com.banco.cliente.Cliente;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente ana = new Cliente("Ana", "242.124.212-00");

        Conta cc = new ContaCorrente(ana);
        cc.depositar(500);

        Conta cp = new ContaPoupanca(ana);
        cp.depositar(450);
        cc.transferir(cp, 200);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cp.sacar(400);
        cc.imprimirExtrato();
        cp.imprimirExtrato();



        Banco banco = new Banco();

        banco.abrirConta(cc);
        banco.abrirConta(cp);

        System.out.println(banco.getContas());
        System.out.println(banco.getNome());

        System.out.println("---Saldo da tesouraria-----");
        System.out.println(banco.consultarSaldoTesouraria());

        System.out.println("-----cc paula----");
        banco.abrirConta(new ContaCorrente(new Cliente("Paula", "122.422.123-04")));
        System.out.println("-----cc paula mesmo cpf----");
        banco.abrirConta(new ContaCorrente(new Cliente("Paula", "122.422.123-04")));
        System.out.println("---Total contas corrente-----");
        System.out.println(banco.obterTotalContasCorrente());
        System.out.println("---Total contas poupança-----");
        System.out.println(banco.obterTotalContasPoupanca());
        System.out.println("-----listando todas as contas------");
        System.out.println(banco.getContas());

        System.out.println("---Encerrando conta pelo número da conta-----");
        banco.encerrarConta(3);
        System.out.println("---Encerrando conta já encerrada-----");
        banco.encerrarConta(3);
        System.out.println("---contas encerradas-----");
        System.out.println(banco.listarContasEncerradas());

    }
}
