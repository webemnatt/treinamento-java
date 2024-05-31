package stream;

import java.util.Optional;

public class OptionalExemplo {
  public static void main(String[] args) {
    // of(value)
    // Optional<String> optionalValue = Optional.of(null);
    Optional<String> valorAtribuido = Optional.of("Hello");
    System.out.println(valorAtribuido.isPresent()); // java.lang.NullPointerException
    // System.out.println(optionalValue.get());//java.lang.NullPointerException

    // ofNullable(value)
    String nullableValue = null;
    Optional<String> valorNulo = Optional.ofNullable(nullableValue);
    System.out.println(valorNulo.isPresent());
    // System.out.println(valorNulo.get());//java.util.NoSuchElementException: No
    // value present

    // empty(): Retorna um Optional vazio (sem valor).
    Optional<String> valorVazio = Optional.empty();
    System.out.println(valorVazio.isPresent());

    System.out.println("----retornam boolean------");
    // isPresent(): Verifica se o Optional contém um valor não nulo.
    System.out.println("Optional com valor não nulo?? " + Optional.of(0).isPresent());

    // isEmpty() (A partir do Java 11): Verifica se o Optional está vazio (não
    // contém um valor não nulo).
    System.out.println("Optional está vazio?? " + Optional.of("").isEmpty());

    // get(): Obtém o valor contido no Optional. Se o valor for nulo, lançará uma
    // exceção NoSuchElementException.
    System.out.println(Optional.of("Obtém o valor contido no Optional").get());

    // orElse(defaultValue): Obtém o valor contido no Optional, ou retorna um valor
    // padrão se o Optional estiver vazio
    System.out.println("Se for null retorne Default: " + Optional.ofNullable(null).orElse("Default"));

    // orElseGet(supplier): Obtém o valor contido no Optional, ou retorna um valor
    // fornecido por um Supplier se o Optional estiver vazio.
    System.out.println("Se null, exibe valor decorrente do supplier: "
        + Optional.ofNullable(null).orElseGet(() -> "Value from Supplier"));

    // orElseThrow(exceptionSupplier): Obtém o valor contido no Optional, ou lança
    // uma exceção fornecida por um Supplier se o Optional estiver vazio.
    System.out.println("Se Optional for null, lança uma exceção: "
        + Optional.ofNullable("não é null").orElseThrow(() -> new RuntimeException("Value not present")));

    // ifPresent(consumer): Executa uma ação fornecida por um Consumer se o Optional
    // contiver um valor.
    Optional.of("Hello").ifPresent(value -> System.out.println("Valor presente: " + value));
  }
}
