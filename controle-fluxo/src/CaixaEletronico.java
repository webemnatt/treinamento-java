public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 100.0;
    double limite = 1_000.0;
    double saque = 5_000.0;

    if (saque < saldo) {
      saldo = saldo - saque;
      System.out.println(saldo);
    } else if (saque > saldo && saque < limite) {
      limite = limite - saque;
      saldo = saldo - limite;
      System.out.println("Saldo atual: ".concat(String.valueOf(saldo)));
      System.out.println("Você ainda tem limite de: ".concat(String.valueOf(limite)));
    } else {
      System.out.println("Saldo insuficiente:".concat(String.valueOf(saldo)));
      System.out.println("Saque acima do limite: ".concat(String.valueOf(limite)));
    }
  }
}
