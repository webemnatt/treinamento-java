import java.text.NumberFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploFor {

  public static void main(String[] args) {
    String[] listaNomes = { "Alice", "Bob", "Carol", "David", "Eva", "Fran",
        "Gina", "Hector", "Ana", "João" };

    exibeCadaAlunoDeUmaListaFor(listaNomes);

    procuroPelaPessoaForEach(listaNomes);

    avisarTodaVezQueEncontrarMultiploFor();

    gastarMesadaEmDocesWhile();

    eParEImparFor();

    simulandoLigacao();

  }

  private static void simulandoLigacao() {
    System.out.println("Discando...");

    do {
      System.out.println("Telefone tocando...");
    } while (tocando());
    System.out.println("Alô?");
  }

  private static boolean tocando() {
    // se entre os valores de 1 e 3 for igual a 1, então, atendeu
    // 1 é true
    boolean atendeu = new Random().nextInt(3) == 1;
    System.out.println("Atendeu? " + atendeu);

    // 1 é true, por isso a saída é negação de true para o método.
    // Continuar tocando? Se atendeu (true), não toque mais (retorna falso)
    return !atendeu;

  }

  private static void exibeCadaAlunoDeUmaListaFor(String alunos[]) {
    for (int i = 0; i < alunos.length; i++) {
      System.out.println("Aluno no índice ".concat(String.valueOf(i)).concat(" é ").concat(alunos[i]));
    }
    System.out.println("Total de alunos igual a ".concat(String.valueOf(alunos.length)));
  }

  private static void eParEImparFor() {
    for (int i = 0; i <= 10; i++) {
      if (i % 2 == 0) {
        System.out.println(i + " é par");
        continue;
      }
      System.out.println(i + " é ímpar");
    }
  }

  private static void procuroPelaPessoaForEach(String[] listaNomes) {
    for (String nome : listaNomes) {
      if (nome == "Fran") {
        System.out.println("Fran foi encontrada!");
        break;
      }
      System.out.format("%s, você viu a Fran?\n", nome);
    }
  }

  private static void avisarTodaVezQueEncontrarMultiploFor() {
    for (int i = 0; i <= 10; i++) {
      if (i % 3 == 0) {
        System.out.println("Múltiplo de 3 encontrado!");
        continue;
      }
      System.out.println(i);
    }
  }

  private static void gastarMesadaEmDocesWhile() {
    double mesada = 50.0;

    while (mesada > 0) {
      Double valorDoce = gerarValorNumaFaixaEntre(2, 8);

      if (valorDoce > mesada) {
        break;
      }

      System.out.println("Doce no valor de " + formatarValorParaMoedaLocal(valorDoce) + " adicionado ao carrinho.");
      mesada = mesada - valorDoce;
    }

    if (mesada == 0.0) {
      System.out.println("Juca gastou toda sua mesada em doces.");
    } else {
      System.out.println("Da mesada sobrou: " + formatarValorParaMoedaLocal(mesada));
    }
  }

  private static double gerarValorNumaFaixaEntre(int valorMinimo, int valorMaximos) {
    return ThreadLocalRandom.current().nextDouble(valorMinimo, valorMaximos);
  }

  private static String formatarValorParaMoedaLocal(double value) {
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String productFormat = currency.format(value);
    return productFormat;
  }

}
