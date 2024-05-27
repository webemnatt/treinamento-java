import com.banco.conta.*;

import com.banco.cliente.Cliente;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente ana = new Cliente("Ana", "242.124.212-00");

        Conta cc = new ContaCorrente(ana);
        cc.depositar(500);

        Conta cp = new ContaPoupanca(ana);
        cp.depositar(450);
        System.out.println();
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        System.out.println();
        System.out.println(
                "----------------------------------------------transferir 200------------------------------------------------");
        cc.transferir(cp, 200);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        System.out.println(
                "---------------------------------------------sacar 400 cp-----------------------------------------------");
        cp.sacar(400);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println(
                "---------------------------------------------Banco criado: -----------------------------------------------");
        Banco banco = new Banco();

        System.out.println("-----------------------------------conta corrente Ana-----------------------------------");
        banco.abrirConta(cc);
        System.out.println("-----------------------------------conta poupança Ana-----------------------------------");
        banco.abrirConta(cp);

        System.out.println(
                "-----------------------------------imprimindo todas as contas abertas-----------------------------------");
        System.out.println(banco.getContas());
        System.out.println(
                "-----------------------------------obtendo o nome do banco-----------------------------------");

        System.out.println(banco.getNome());

        System.out.println(
                "----------------------------------Saldo da tesouraria do banco------------------------------------");
        System.out.println(banco.consultarSaldoTesouraria());

        System.out.println(
                "----------------------------------------abrindo cc paula---------------------------------------");
        banco.abrirConta(new ContaCorrente(new Cliente("Paula", "122.422.123-04")));

        System.out.println("------------------------------abrindo cc paula mesmo cpf-----------------------------");
        banco.abrirConta(new ContaCorrente(new Cliente("Paula", "122.422.123-04")));

        System.out.println(
                "----------------------------------------abrindo cp paula---------------------------------------");
        banco.abrirConta(new ContaPoupanca(new Cliente("Livia", "789.422.321-84")));

        System.out.println(
                "-----------------------------------------transferir 150 através do banco-------------------------------------------");
        banco.transferenciaEntreContas(2, 5, 150);

        System.out.println(
                "---Total contas corrente: " + banco.obterTotalContasCorrente());
        System.out.println(
                "---Total contas poupança: " + banco.obterTotalContasPoupanca());
        System.out.println(
                "-------------------------------------------listando todas as contas--------------------------------------------");
        banco.getContas().forEach(System.out::println);

        System.out.println(
                "-----------------------------------------Encerrando conta pelo número da conta-------------------------------------------");
        banco.encerrarConta(3);
        System.out
                .println("------------------Encerrando conta já encerrada-------------------------------------------");
        banco.encerrarConta(3);
        System.out.println(
                "-----------------------------------------contas encerradas-------------------------------------------");
        System.out.println(banco.listarContasEncerradas());

        System.out.println(
                "-----------------------------------------contas por cpf-------------------------------------------");

        System.out.println(banco.pesquisarPorCpf("242.124.212-00"));

    }
}
