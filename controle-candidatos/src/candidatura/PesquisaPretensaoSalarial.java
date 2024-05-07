package candidatura;

import java.util.Scanner;

public class PesquisaPretensaoSalarial {

  public static void perguntarValor(int vezes, double salarioBase) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Processo seletivo");

    for (int i = 0; i <= vezes; i++)
      analisarCandidato(scanner, salarioBase);

    scanner.close();
  }

  private static void analisarCandidato(Scanner scanner, double salarioBase) {
    System.out.print("Digite a pretensão salarial:\t");

    // se usuário digitar num formato inválido, pede para digitar corretamente até o
    // fazer.
    while (true) {
      if (scanner.hasNextDouble()) {
        double salarioPretendido = scanner.nextDouble();
        exibirMensagem(salarioBase, salarioPretendido);
        break; // faz encerrar o while se o dado de entrada está correto
      } else {
        System.out.print("Por favor, digite o valor sem centavos:");
      }
      scanner.nextLine(); // quebra o loop do else e faz aguardar o dado no formato correto.
    }

  }

  public static void exibirMensagem(double salarioBase, double salarioPretendido) {
    if (salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("Ligar para o candidato com contraproposta.");
    } else {
      System.out.println("Aguardando resultado dos demais candidatos.");
    }
  }

}
