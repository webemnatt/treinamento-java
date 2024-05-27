public class App {
    public static void main(String[] args) throws Exception {

        Cliente ana = new Cliente();
        ana.setNome("Ana");

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
    }
}
