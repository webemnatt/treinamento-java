package excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Classe <strong>AboutMe</strong>
 */
public class AboutMe {

  public static void main(String[] args) throws Exception {
    preencherMeusDados();
  }

  /**
   * Método que recebe informações (via scanner) de um usuário que queira gerar
   * uma mensagem de apresentação. Os campos são: <strong>nome, sobrenome, idade e
   * altura</strong>. Ao final, é gerada uma mensagem com os dados fornecidos. O
   * programa espera pelo menos nome ou sobrenome, então, se não forem fornecidos,
   * a mensagem será de recomendação. <br>
   * O programa aguarda a entrada de cada dado apenas uma vez.
   * O programa tem tratamento para as exceções a seguir:
   * 
   * @throws InputMismatchException
   * @throws NumberFormatException
   */
  public static void preencherMeusDados() throws InputMismatchException, NumberFormatException {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    String nome = "";
    String sobrenome = "";
    int idade = 0;
    double altura = 0.0;

    System.out.print("Digite o seu nome: \t");
    nome = scanner.nextLine();
    System.out.print("Digite o seu sobrenome: \t");
    sobrenome = scanner.nextLine();
    idade = tratarIdade(idade, scanner);
    altura = tratarAltura(altura, scanner);

    scanner.close();

    exibirResultado(nome, sobrenome, idade, altura);
  }

  /**
   * Método que exibe o <strong>resultado</strong> da interação.
   * Quanto mais dados preenchidos, mais informações serão exibidas.
   * Requisito mínimo é nome ou sobrenome.
   * Os demais campos são opcionais.
   * Se nem nome ou sobrenome for preenchido, orienta preenchê-lo.
   * 
   * @param nome      espera um dado em String
   * @param sobrenome espera um dado em String
   * @param idade     espera um dado int
   * @param altura    espera um dado double
   */
  private static void exibirResultado(String nome, String sobrenome, int idade, double altura) {
    if (nome != "" || sobrenome != "") {
      System.out.format("Olá, meu nome é %s %s",
          nome, sobrenome);
      if (idade != 0) {
        System.out.format(", tenho %d anos",
            idade);
      }
      if (altura != 0.0) {
        System.out.format(" e minha altura é %.2f",
            altura);
      }
    } else {
      System.out.println("Preencha os dados solicitados.");
    }
    System.out.println(".");
  }

  /**
   * O método trata o dado para <strong>altura</strong>
   * Caso informada em formato inválido, exibe a mensagem de erro e a variável
   * permanece com valor default.
   * 
   * @param altura é uma variável que aguarda valor double
   * @return a altura.
   */
  private static double tratarAltura(double altura, Scanner scanner) {
    try {
      String input = lerEntrada("Digite a sua altura: \t", scanner);
      altura = informarAlturaOuDeixarVazio(altura, input);
    } catch (InputMismatchException | NumberFormatException e) {
      System.out.println("Altura em números. Exemplo: 1.40");
    }
    return altura;
  }

  /**
   * O método trata a <strong>idade</strong>.
   * Caso informada em formato inválido, exibe a mensagem de erro e a variável
   * permanece com valor default.
   * 
   * @param idade é uma variável que aguarda receber valor int
   * @return a idade
   */
  private static int tratarIdade(int idade, Scanner scanner) {
    try {
      String input = lerEntrada("Digite a sua idade: \t", scanner);
      idade = informarIdadeOuDeixarVazio(idade, input);
    } catch (InputMismatchException | NumberFormatException e) {
      System.out.println("Idade em números. Exemplo: 18.");
    }
    return idade;
  }

  /**
   * Método para tratar campo vazio
   * Se o usuário informar um dado, este será convertido em double.
   * Senão, exibe mensagem.
   * @param altura espera receber dado do tipo double
   * @param input  é a entrada, o que o usuário digitar
   * @return retorna a altura preenchida ou a altura default.
   */
  private static double informarAlturaOuDeixarVazio(double altura, String input) {
    if (!input.isEmpty()) {
      altura = Double.parseDouble(input);
    } else {
      System.out.println("Você não forneceu a altura.");
    }
    return altura;
  }

  /**
   * Método criado para o caso de o usuário deixar este campo sem preenchimento.
   * Caso receba um dado, converte em int
   * Caso não, exibe mensagem.
   * @param idade espera receber dado do tipo int
   * @param input é a entrada sem espaço
   * @return a idade fornecida ou a idade default.
   */
  private static int informarIdadeOuDeixarVazio(int idade, String input) {
    if (!input.isEmpty()) {
      idade = Integer.parseInt(input); 
    } else {
      System.out.println("Você não forneceu a idade.");
    }
    return idade;
  }

  /**
   * Esse método lê o que o usuário digitou, removendo espaço em branco.
   * 
   * @param pergunta de orientação de preenchimento
   * @return a entrada é capturada no próximo método
   */
  private static String lerEntrada(String pergunta, Scanner scanner) {
    System.out.print(pergunta);
    String input = scanner.nextLine().trim();
    return input;
  }

}
