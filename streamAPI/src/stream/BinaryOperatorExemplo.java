package stream;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class BinaryOperatorExemplo {
  public static void main(String[] args) {
    List<Integer> numerosList = Arrays.asList(1, 6, 9, 4, 5, 1);
    BinaryOperator<Integer> operadorBinario = (num1, num2) -> num1 + num2;
    System.out.println((numerosList.stream().reduce(0, operadorBinario)));

    System.out.println(numerosList.stream().reduce(0, (a, b) -> a + b));
    System.out.println(numerosList.stream().reduce(0, Integer::sum));
    // redundante
    System.out.println(numerosList.stream().reduce(0, (a, b) -> a + b, (a, b) -> a + b));
    System.out.println(numerosList.stream().reduce(0, Integer::sum, (a, b) -> a + b));
    
    System.out.println("------=========");
    System.out.println(numerosList.stream().reduce(0, (valorInicial, elemento) -> {
      System.out.println("valorInicial: " + valorInicial);
      System.out.println("elemento: " + elemento);
      int resultado = valorInicial + elemento;
      System.out.println("resultado: "+resultado);
      return resultado;
    }));

    System.out.println("---------------fim-----------");

    List<String> caracteres = Arrays.asList("A", "B", "A", "A", "C", "A", "A");
    Long contadorDeLetraA = caracteres.stream().reduce(
        0L,
        (acumulador, elemento) -> elemento.charAt(0) == 'A' ? acumulador + 1 : acumulador,
        (acumulador, elemento) -> {
          System.out.println(acumulador + " " + elemento);
          return Long.sum(acumulador, elemento);
        });
    System.out.println(contadorDeLetraA); // imprime apenas o que acumulou

    System.out.println("-----------------");
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    int sumOfSquares = numbers.stream()
        .map(n -> n * n)
        .reduce(
            0,
            Integer::sum,
            (a, b) -> {
              System.out.println("Combining " + a + " and " + b);
              return a + b;
            });

    System.out.println("Sum of squares: " + sumOfSquares);

    System.out.println("----testando-----------");
    Integer x = numbers.stream().reduce(0, (a, b) -> a + b, (a, b) -> a + b);
    Integer z = numbers.stream().reduce(0, (a, b) -> a + b);
    Integer k = numbers.stream().reduce(0, Integer::sum);
    System.out.println(x);
    System.out.println(z);
    System.out.println(k);

    System.out.println("--concatenando----");

    List<String> letras = Arrays.asList("a","b","r","i","d","o","r");
    System.out.println(letras.stream().reduce("", (a, b) -> a + b));

    Optional<String> reduce = Stream.of("b","i","n","a","r","y").reduce((letra1,letra2)->letra1+letra2);
    System.out.println(reduce);

  }
}
