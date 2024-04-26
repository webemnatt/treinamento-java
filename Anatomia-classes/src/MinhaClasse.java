public class MinhaClasse {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");

    MinhaClasse mc = new MinhaClasse();
    System.out.println(mc.nomeCompleto("Ana", "Souza"));
  }

  String nomeCompleto(String prenome, String sobrenome) {
    return prenome.concat(" ").concat(sobrenome);
  }
}
