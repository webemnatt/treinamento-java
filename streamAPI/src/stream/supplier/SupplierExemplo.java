package stream.supplier;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierExemplo {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    // não recebe argumento.
    Supplier<String> saudacao = () -> "Hello World";
    System.out.println(saudacao.get());
    // outro exemplo de uso do Supplier:
    // gerando um número aleatório inteiro usando Math.random()
    Supplier<Integer> supplier2 = () -> (int) (Math.random() * 10);
    System.out.println(supplier2.get());

    // usando o Supplier com o Stream
    List<String> nomes = List.of("João", "Maria", "Pedro", "Ana");
    Supplier<String> supplier3 = () -> {
      String joao = nomes.stream().findFirst().get();
      return "Olá, " + joao;
    };
    // imprime apenas a saudação com o primeiro nome
    System.out.println(supplier3.get());
    // iterando por cada nome para gerar uma saudação customizada:
    nomes.forEach(nome -> {
      Supplier<String> saudacaoCustomizada = () -> "Olá, " + nome;
      System.out.println(saudacaoCustomizada.get());
    });
    List<String> saudacaoUnica = Stream.generate(saudacao).limit(5).collect(Collectors.toList());
    System.out.println(saudacaoUnica);

    System.out.println("------saudação aleatoria-------");

    // Criando um Supplier<String> que gera saudações personalizadas
    Supplier<String> saudacaoPessoal = () -> "Olá, " + nomes.get((int) (Math.random() * nomes.size()));

    // Gerando uma lista de saudações personalizadas
    List<String> saudacoesAleatorias = Stream.generate(saudacaoPessoal)
        .limit(10)
        .collect(Collectors.toList());

    // Imprimindo a lista de saudações
    saudacoesAleatorias.forEach(System.out::println);
    System.out.println(saudacoesAleatorias);

    System.out.println("-----nomes em caixa alta-------------");
    // Criando um fluxo a partir da lista de nomes
    // Usando o método toList() para converter o fluxo em uma lista
    List<String> nomesUpperCase = nomes.stream()
        .map(String::toUpperCase)
        .toList();

    // Imprimindo a nova lista
    nomesUpperCase.forEach(nome -> System.out.println(nome));
    nomesUpperCase.forEach(System.out::println);

    // adicionando 4 pessoas diferentes:
    List<Pessoa> pessoas = Arrays.asList(
        new Pessoa("João", 30),
        new Pessoa("Paulo", 58),
        new Pessoa("Carolina", 28),
        new Pessoa("Barbara", 60));
    pessoas.forEach(new Consumer<Pessoa>() {
      @Override
      public void accept(Pessoa pessoa) {
        System.out.println(pessoa);
      }
    });

    // Usando o supplier:
    for (Pessoa pessoa : pessoas) {
      Supplier<String> bomDiaFulano = () -> String.format("Bom dia, %s.", pessoa.getNome());
      System.out.println(bomDiaFulano.get());
    }

    System.out.println("-------------supllier em classe customizada--------------");
    List<Pessoa> pessoasSupplier = criarObjetosViaSupplier(
        () -> new Pessoa("Ricardo", 25),
        () -> new Pessoa("Pedro", 48));
    pessoasSupplier.forEach(System.out::println);

    System.out.println("---streamando a lista-----");

    System.out.println("Pessoas criadas com o Supplier: " + (pessoasSupplier.stream().count()));

    // classe anônima
    Stream.generate((new Supplier<Integer>() {
      @Override
      public Integer get() {
        return (int) (Math.random() * 100);
      }
    })).limit(5).forEach(System.out::println);

    Supplier<Integer> supplier = () -> (int) (Math.random() * 100);
    Stream.generate(supplier).limit(5).forEach(System.out::println);

    System.out.println("----supplier implementado em classe-----");
    // Gera uma sequência de Fibonacci
    Stream<BigInteger> fibonacciSequence = Stream.generate(new FibonacciSupplier());

    // Imprime os primeiros 10 números da sequência de Fibonacci
    fibonacciSequence.limit(10).forEach(System.out::println);

  }// fim do main

  static class FibonacciSupplier implements Supplier<BigInteger> {
    private BigInteger a = BigInteger.ZERO;
    private BigInteger b = BigInteger.ONE;

    @Override
    public BigInteger get() {
      BigInteger temp = b;
      b = a.add(b);
      a = temp;
      return a;
    }
  }

  @SuppressWarnings("unchecked")
  public static List<Pessoa> criarObjetosViaSupplier(Supplier<Pessoa>... pessoasFornecedoras) {
    List<Pessoa> listaPessoas = new ArrayList<>();
    for (Supplier<Pessoa> personSupplier : pessoasFornecedoras) {
      listaPessoas.add(personSupplier.get());
    }
    return listaPessoas;
  }

}
