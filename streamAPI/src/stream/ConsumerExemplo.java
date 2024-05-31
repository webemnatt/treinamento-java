package stream;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerExemplo {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 8, 45, 36, 78, 5);

    // maneira tradicional
    for (Integer numero : numeros) {
      System.out.println(numero);
    }

    // Consumer é uma interface funcional que recebe um argumento e não retorna nada
    Consumer<Integer> consumer = (n) -> System.out.println(n);
    numeros.forEach(consumer);

    System.out.println("-----imprimindo apenas pares---------");
    numeros.forEach((Consumer<Integer>) numero -> {
      if (numero % 2 == 0) {
        System.out.println(numero);
      }
    });

    System.out.println("-------Instância nominal de Consumer(declarado fora)--------------------");
    //Consumer precisa de argumento
    Consumer<Integer> exibirNumerosPares = (Consumer<Integer>) numero -> {
      if (numero % 2 == 0) {
        System.out.println(numero);
      }
    };
    numeros.stream().forEach(exibirNumerosPares);

    System.out
        .println("--------Instância anônima de Consumer, sobrescrevendo seu único método abstrato:--------------");
    numeros.stream().forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer t) {
        if (t % 2 == 0) {
          System.out.println(t);
        }
      };
    });
    System.out.println("--------utilizando a função lâmbida dentro do forEach para simplificar:--------------");
    numeros.stream().forEach(numero -> {
      if (numero % 2 == 0) {
        System.out.println(numero);
      }
    });

  }
}
