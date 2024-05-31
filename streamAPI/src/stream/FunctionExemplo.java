package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Recebe um tipo e converte em outro.
 * Comumente usado dentro de um stream.map()
 */
public class FunctionExemplo {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

    // Function<Integer, Double> dobrar = numero -> (double) numero * 2;
    // List<Double> numerosDobrados = numeros.stream().map(dobrar).toList();

    List<Double> numerosDobrados = numeros.stream().map(
        new Function<Integer, Double>() {
          @Override
          public Double apply(Integer numero) {
            return (double) numero * 2;
          }
        })
        .toList();

    numerosDobrados.forEach(System.out::println);

    System.out.println("---------------diretamente do Stream------------------");
    Stream.of(9, 5, 1, 7, 8, 2).map(numero -> (double) numero * 2).forEach(System.out::println);
  }
}
