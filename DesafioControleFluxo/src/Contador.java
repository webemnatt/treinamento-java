import java.util.Scanner;

/**
 * Classe <strong>Contador</strong> faz a contagem progressiva em uma unidade,
 * começando pelo número um e tendo como limite a diferença entre dois números,
 * solicitados ao usuário.
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 07/05/24
 */
public class Contador {

  public static void main(String[] args) throws Exception {
    System.out.println("-----------Início do programa Contador---------------");
    System.out.println();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite dois números sem ponto nem vírgula");
    System.out.println();

    int numero1 = validarEntrada(scanner, "Digite o primeiro número:");
    int numero2 = validarEntrada(scanner, "Digite o segundo número:");

    scanner.close();
    System.out.println();

    try {
      contar(numero1, numero2);
    } catch (ParametrosInvalidosException e) {
      System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
    System.out.println();
    System.out.println("-----------Fim do programa Contador---------------");

  }

  /**
   * Este método valida a entrada dos dados.
   * Caso o usuário informe dado que não seja um número inteiro, será orientado a
   * fazê-lo.
   * 
   * @param scanner  o método de entrada se dá via java.util.Scanner
   * @param mensagem uma String dizendo como preencher o campo
   * @return um inteiro para ser armazenado numa variável
   */
  private static int validarEntrada(Scanner scanner, String mensagem) {
    System.out.print(mensagem + "\t");
    int numero;
    while (true) {
      if (scanner.hasNextInt()) {
        numero = scanner.nextInt();
        scanner.hasNextLine();
        break;
      } else {
        System.out.print("O parâmetro deve ser um número inteiro:\t");
        scanner.nextLine();
      }
    }
    return numero;
  }

  /**
   * Método que itera sobre a diferença de dois números, começando a contagem no
   * número 1, avançando de um em um.
   * Se o usuário informar o primeiro parâmetro com valor maior que o segundo,
   * uma exceção customizada é lançada, devendo ser tratada quando este método é
   * chamado.
   * 
   * @param numero1 primeiro parâmetro do tipo inteiro
   * @param numero2 segundo parâmetro do tipo inteiro
   * @throws ParametrosInvalidosException exceção customizada que estende
   *                                      RuntimeException
   */
  private static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
    int contagem = numero2 - numero1;
    if (contagem <= 0) {
      throw new ParametrosInvalidosException();
    }

    for (int i = 1; i < contagem + 1; i++) {
      System.out.printf("imprimindo o número %d\n", i);
    }
  }
}
