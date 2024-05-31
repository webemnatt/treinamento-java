package stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExemplo {

  public static void main(String[] args) {
    List<String> palavras = Arrays.asList("Java", "Kotlin", "Javascript", "C#");

    Predicate<String> palavrasCincoLetrasOuMais = palavra -> palavra.length() > 5;
    Predicate<String> palavrasComLetraA = palavra -> palavra.contains("ava");

    System.out.println("------Palavras com cinco letras ou mais ------------------");
    palavras.stream().filter(palavrasCincoLetrasOuMais).forEach(System.out::println);

    System.out.println("------Palavras com cinco a letra A ------------------");

    palavras.stream().filter(palavrasComLetraA).forEach(System.out::println);

    System.out.println("------Palavras com letra o ------------------");
    Stream.of("Jupiter", "Saturno", "Terra", "Marte", "Urano", "Mercúrio", "Venus", "Plutao")
        .filter(palavra -> palavra.contains("o")).forEach(System.out::println);

  }
}
