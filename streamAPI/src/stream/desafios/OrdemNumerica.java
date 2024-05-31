package stream.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class OrdemNumerica {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    System.out.println("Os números ordenas em ordem crescente: " + ordenarNumerosCrescente(numeros));

    somarPares(numeros);

    verificarSeTodosOsNumerosSaoPositivos(numeros);

    System.out.println("a lista de números pares é: " + gerarListaNumerosPares(numeros));

    System.out.println(
        "média dos números acima de cinco da lista é igual a: " + calcularMediaNumerosMaioresQueCinco(numeros));

    System.out.println("Há números maiores que dez? " + verificarNumeroMaiorQueDez(numeros));

    encontrarSegundoMaiorNumero(numeros);

    somarTodosDigitosDosNumerosDaLista(numeros);

    System.out.println("Tem número repetido? " + verificarSeAListaPossuiNumerosDistintos(numeros));

    agruparValoresMultiplos3ou5(numeros);

    exibirASomaDosQuadradosDosNumeros(numeros);

    exibirProdutoDosNumeros(numeros);

    exibirNumerosIntervalo(5, 10, numeros);

    encontrarMaiorNumeroPrimo(numeros);

    contemPeloMenosUmNumeroNegativo(numeros);

  }

  /**
   * verifique se a lista contém pelo menos um número negativo e exiba o resultado
   * no console
   * 
   * @param numeros
   */
  public static void contemPeloMenosUmNumeroNegativo(List<Integer> numeros) {
    Predicate<Integer> numeroNegativo = numero -> numero < 0;
    boolean resultado = numeros.stream().anyMatch(numeroNegativo);
    System.out.println("A lista contém pelo menos um número negativo? " + resultado);
  }

  /**
   * Encontra o maior número primo da lista e exiba o resultado no console
   * Se não encontrar retorna zero.
   * 
   * @param numeros do tipo List<Integer>
   */
  public static void encontrarMaiorNumeroPrimo(List<Integer> numeros) {
    Predicate<Integer> ePrimo = numero -> {
      for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
          return false;
        }
      }
      return true;
    };
    System.out.println(encontrarMaiorNumero(numeros).filter(ePrimo).findFirst().orElse(0));
  }

  /**
   * Filtra os números que estão dentro de um intervalo específico (por exemplo,
   * entre 5 e 10) e exiba o resultado no console.
   * 
   * @param inicio
   * @param fim
   * @param numeros
   */
  public static void exibirNumerosIntervalo(int inicio, int fim, List<Integer> numeros) {
    List<Integer> numerosIntervalo = numeros.stream().filter(n -> {
      return n >= inicio && n <= fim;
    }).toList();
    System.out.println(numerosIntervalo);
  }

  /**
   * Método que exibe o produto de todos os números da lista.
   * 
   * @param numeros
   */
  public static void exibirProdutoDosNumeros(List<Integer> numeros) {
    System.out.println(numeros.stream().reduce(1, (a, b) -> a * b));
  }

  /**
   * Método que exibe a soma todos os quadrados de cada elemento da lista e exibe
   * seu resultado.
   * 
   * @param numeros
   */
  public static void exibirASomaDosQuadradosDosNumeros(List<Integer> numeros) {
    System.out.println(numeros.stream().map(numero -> numero * numero).reduce(0, (a, b) -> a + b));
  }

  /**
   * Método exibe numa lista de elementos os múltiplos de 3 ou 5
   * 
   * @param numeros
   */
  public static void agruparValoresMultiplos3ou5(List<Integer> numeros) {
    List<Integer> multiplosDe3ou5 = numeros.stream()
        .filter(n -> n % 3 == 0 || n % 5 == 0)
        .toList();
    System.out.println(multiplosDe3ou5);
  }

  /**
   * O método verifica se há números repetidos na lista.
   * Para isso, ele gera um fluxo que recebe o método de remover elementos
   * repetidos e faz uma contagem desse fluxo final.
   * Se essa contagem for diferente do tamanho original da lista, é porque na
   * lista contém números repetidos.
   * 
   * @param numeros do tipo List<Integer>
   * @return um boolean
   */
  public static boolean verificarSeAListaPossuiNumerosDistintos(List<Integer> numeros) {
    return numeros.stream().distinct().count() != numeros.size();
  }

  /**
   * Método que exibe a soma dos dígitos de todos os números de uma lista
   * 
   * @param numeros
   */
  public static void somarTodosDigitosDosNumerosDaLista(List<Integer> numeros) {
    Integer somaTodosOsNumeros = numeros.stream()
        .mapToInt(Integer::intValue)
        .sum();
    Integer somaDosDigitos = somarDigitos(somaTodosOsNumeros);
    System.out.printf("Soma de todos os números: %d; soma dos seus dígitos: %d\n", somaTodosOsNumeros, somaDosDigitos);
  }

  /*
   * Método auxiliar que recebe um número e retorna a soma de seus dígitos
   * 1. Converte um int numa String via método .toString(),
   * 2. que é convertida em um fluxo de caracteres, onde cada caractere é
   * representado por seu valor Unicode - via método .chars(),
   * 3. depois converte cada caractere (que representa um dígito) em seu valor
   * numérico correspondente, via .map(c -> c - '0'),
   * 4. Calcula a soma de todos os valores numéricos dos dígitos.
   */
  private static int somarDigitos(int numero) {
    return String.valueOf(numero)
        .chars()
        .map(c -> c - '0')
        .sum();
  }

  /**
   * Verificar se a lista contém algum número maior que 10
   * 
   * @param numeros
   * @return
   */
  public static boolean verificarNumeroMaiorQueDez(List<Integer> numeros) {
    // boolean temNumeroMaiorQueDez = false;
    // for (Integer numero : numeros) {
    // if (numero > 10) {
    // temNumeroMaiorQueDez = true;
    // }
    // }
    // return temNumeroMaiorQueDez;
    return numeros.stream().anyMatch(n -> n > 10);
  }

  /**
   * Método para encontrar o segundo número maior da lista e exiba o resultado no
   * console.
   * O sorted() chama um o método reverseOrder do Comparator para inverter a ordem
   * natural dos elementos.
   * O skip() pula o primeiro dessa nova ordem e retorna uma nova stream().
   * O findFirst() é método do Optional para encontrar o primeiro elemento dessa
   * nova stream().
   * Caso não encontre, orElse() retorna o valor zero, para que não gere exceção
   * NullPointerException.
   * 
   * @param numeros
   */
  public static void encontrarSegundoMaiorNumero(List<Integer> numeros) {
    Integer segundoMaiorNumero = encontrarMaiorNumero(numeros)
        .skip(1)
        .findFirst()
        .orElse(0);
    System.out.println("O segundo maior número é: " + segundoMaiorNumero);
  }

  private static Stream<Integer> encontrarMaiorNumero(List<Integer> numeros) {
    return numeros.stream()
        .sorted(Comparator.reverseOrder());
  }

  /**
   * Método stream() para criar o fluxo de dados a partir da lista numeros.
   * O filter() seleciona apenas os números maiores que 5.
   * O mapToInt(Integer::intValue) converte os objetos de Integer para int.
   * O <strong>método average() calcula a média</strong> dos números
   * maiores que 5 com base no fluxo de valores int.
   * 
   * Caso a lista esteja vazia, o método average() retorna um
   * OptionalDouble vazio, então usamos o método orElse() para retornar 0.0
   * como valor padrão.
   * 
   * @param numeros do tipo List<Integer>
   * @return um double
   */
  private static double calcularMediaNumerosMaioresQueCinco(List<Integer> numeros) {
    // List<Integer> numerosMaioresQueCinco = numeros.stream().filter(numero ->
    // numero > 5).toList();
    // System.out.println(numerosMaioresQueCinco.stream().reduce(0,
    // (acumulador, elemento) -> (acumulador + elemento)) /
    // numerosMaioresQueCinco.size());
    Predicate<Integer> predicate = numero -> numero > 5;
    return numeros.stream()
        .filter(predicate)
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0.0);
  }

  /**
   * Remova todos os valores ímpares:
   * Como não se pode remover ímpares enquanto itera, então precisa criar uma nova
   * lista apenas com o que deseja manter
   * O map do stream foi desaconselhado porque ele faz algo com TODOS OS ELEMENTOS
   * da lista original.
   * O filter do stream ele filtra apenas os pares. Esses pares são posteriormente
   * armazenados numa nova lista através do comando toList
   * 
   * @param numeros
   */
  private static List<Integer> gerarListaNumerosPares(List<Integer> numeros) {
    Predicate<? super Integer> predicate = numero -> numero % 2 == 0;
    return (numeros.stream().filter(predicate).toList());
  }

  private static void verificarSeTodosOsNumerosSaoPositivos(List<Integer> numeros) {
    Predicate<? super Integer> predicate = n -> n > 0;
    boolean saoTodosPositivos = numeros.stream().allMatch(predicate);
    System.out.println("Todos os números da lista são positivos? " + saoTodosPositivos);
  }

  private static void somarPares(List<Integer> numeros) {
    BinaryOperator<Integer> funcaoReducao = (a, b) -> (b % 2 == 0) ? a + b : a;
    Integer resultado = numeros.stream().reduce(0, funcaoReducao);
    System.out.println("A soma de todos os números pares é igual a: " + resultado);
  }

  private static List<Integer> ordenarNumerosCrescente(List<Integer> numeros) {
    return numeros.stream().sorted().toList();
    // numeros.stream().sorted().toList().forEach(System.out::println);
  }
}
