# lambda em Java

Uma expressão lambda em Java é composta por três partes principais:

**Argumentos**: Uma lista de argumentos separados por vírgulas, que especifica os parâmetros que a expressão lambda recebe. Esses parâmetros podem ter tipos explícitos ou podem ser inferidos pelo compilador.

**Setas**: O operador `->` separa os argumentos da expressão lambda do corpo da função.

**Corpo**: O corpo da função contém a expressão que define a ação a ser realizada pela função. Esse corpo pode ser uma única expressão **ou** um bloco de código encapsulado em chaves "{}".

> (x, y) -> x + y

### Sobre o método criarObjetosViaSupplier()

> public static List<Pessoa> criarObjetosViaSupplier(Supplier<Pessoa>... pessoasFornecedoras) {\
    List<Pessoa> listaPessoas = new ArrayList<>();
    for (Supplier<Pessoa> personSupplier : pessoasFornecedoras) {
      listaPessoas.add(personSupplier.get());
    }
    return listaPessoas;
  }

- O método `criarObjetosViaSupplier` é responsável por criar as pessoas que serão utilizadas no teste. Ele recebe como parâmetro um `Supplier<Pessoa>` retorna uma `List<Pessoas>`.

A principal vantagem de usar um `Supplier<Pessoa>` neste caso é a flexibilidade e a reutilização de código.

+ **Flexibilidade**: Ao usar um Supplier<Pessoa>, você pode facilmente criar diferentes tipos de pessoas, com diferentes nomes e idades, sem precisar modificar o código que cria a lista de pessoas. Basta passar um `Supplier<Pessoa>` diferente para o método `criarObjetosViaSupplier`.
> () -> new Pessoa("Jorge",18)

+ **Reutilização de código**: O método `criarObjetosViaSupplier` pode ser reutilizado para criar listas de qualquer tipo de objeto, não apenas Pessoa. Basta passar um Supplier adequado para o tipo de objeto que você deseja criar.
**Encapsulamento**: O `Supplier<Pessoa>` encapsula a lógica de criação de uma Pessoa, separando-a do código que cria a lista de pessoas. Isso torna o código mais modular e fácil de manter.
**Testabilidade**: Ao usar um `Supplier<Pessoa>`, você pode facilmente criar stubs ou mocks para testes unitários, substituindo o Supplier real por um que retorna objetos Pessoa pré-definidos.
**Lazy Initialization**: O `Supplier<Pessoa>` só cria uma nova Pessoa *quando o método get() é chamado*. Isso pode ser útil em situações em que a criação de uma Pessoa é uma operação cara e *só cria as pessoas quando elas forem realmente necessárias*.

# Abordagem funcional

## Interface funcional

Uma interface funcional é uma interface que define *um único método abstrato*. Essa interface pode ser definida pelo próprio programador ou pode ser uma das interfaces funcionais pré-definidas em Java, como a interface "java.util.function.**Consumer**" ou "java.util.function.**Predicate**".

## Evolução do código
Pela **abordagem imperativa**, para imprimir cada objeto String de uma **List\<String>** faz-se o uso do for-loop tradicional:

> for(String pessoa: listaPessoas){\
System.out.println(pessoa);\
}

### Consumer

Desde o Java 8, é possível iterar uma List<> usando o <ins>método `forEach`, que recebe como parâmetro um **Consumer\<T>**</ins>.

Três notações são possíveis para imprimir cada Objeto de uma lista, sendo a última a mais curta:
1. **Classe anônima** implementa a interface Consumer<String>. Precisa sobrescrever o método accept() que é chamado para cada elemento da List.
>listaPessoas.forEach(new Consumer\<String>\() {\
>        @Override
>      public void accept(String pessoa) {
>        System.out.println(pessoa);
>      }
>    });

2. **Função lambda** ou anônima: A saída é o objeto em formato de String, desde que o método `toString()` tenha sido sobrescrito na classe Pessoa.
> listaPessoas.forEach(pessoa->System.out.println(pessoa));
3. **O método reference** é uma referência a um método estático ou instanciado.Ele é usado para referenciar um método.
> listaPessoas.forEach(System.out::println);

### Supplier

Representa uma operação sem argumentos e retorna um resultado do tipo T. Seu único método abstrato a ser sobrescrito é o **get()**.
É comumente usado como **argumento** do método `Stream.generate(Supplier<T> supplier).limit(10).forEach(System.out::println)` 
Lembrando que `generate(Supplier<T> supplier)`**precisa** do `limit(quantidade)` para não entrar em loop infinito quando há `forEach(System.out::println)`

1. **Classe anônima**
> Stream.generate((
        new Supplier<Integer>() {
          @Override
          public Integer get() {
            return (int) (Math.random() * 100);
          }
        })).limit(5).forEach(System.out::println);

2. **Declarando fora** e chamando dentro do generate()
> Supplier<Integer> supplier = () -> (int) (Math.random() * 100);
  Stream.generate(supplier).limit(5).forEach(System.out::println);

3. **Função lambda**
>  Stream.generate(() -> (int) (Math.random() * 100)).limit(5).forEach(System.out::println);

### Function

É uma interface usada dentro do método intermediário **.map()** do **Stream**.
*Recebe* um tipo e *retorna* o mesmo (ou outro) que passou por alguma transformação - ambos como generics

1. **Classe anônima**
>List<Double> numerosDobrados = numerosList.stream().map(
>new Function<Integer, Double>() {
    @Override
    public Double apply(Integer numero) {
      return (double) numero * 2;
    }
  });

2. **Declarando fora** e chamando dentro do map
> Function<Integer, Double> dobrar = numero -> (double) numero * 2;
  List<Double> numerosDobrados = numeros.stream().map(dobrar).toList();
  numerosDobrados.forEach(System.out::println);

3. **Função lambda**
> Stream.of(9, 5, 1, 7, 8, 2).map(numero -> (double) numero * 2).forEach(System.out::println);

### Predicate

É usado dentro do método intermediário **.filter()** do **Stream**.
*Recebe* um tipo como generics e *retorna* um **boolean** 

1. **Classe anônima**
> List<Integer> numerosPares = numerosList.stream().filter(
  >new Predicate<Integer>() {
    @Override
    public boolean test(Integer numero) {
      return numero % 2 == 0;
      }
    }
  }).toList();

2. **Função à parte**
> Predicate<Integer> par = numero -> numero % 2 == 0;
List<Integer> numerosPares = numerosList.stream().filter(par).toList();

3. **Função lambda**
  > List<Integer> numerosPares = numerosList.stream().filter(numero -> numero % 2 == 0).toList();

Para mostrar o resultado do filtro:

> numerosPares.forEach(System.out::println)

Ou diretamente:
> numerosList.stream().filter(numero -> numero % 2 == 0).forEach(System.out::println)

### BinaryOperator
É usado dentro do método intermediário **.reduce()** do **Stream**.
*Recebe* um tipo como generics e *retorna* o mesmo tipo.

>List<String> letras = Arrays.asList("a","b","r","i","d","o","r");
    System.out.println(letras.stream().reduce("", (a, b) -> a + b));

No método **reduce(acumulador,binaryOperator)** o acumulador é valor inicial, tal como na forma imperativa, será zero:

> List<Integer> numerosList = Arrays.asList(1,6,9,4,5,1);
int acumulador = 0;
for(Integer numero: numerosList){
  acumulador += numero;
}
System.out.printLn(acumulador);

1. **Classe anônima**
Seu método **apply** precisa de dois argumentos, o acumulador (valor inicial zero) e o número.
> Integer soma = numerosList.stream().reduce(
  >new BinaryOperator<Integer>() {
    @Override
    public Integer apply(Integer acumulador, Integer numero) {
      return acumulador + numero;
      }
    }
  ).get();

2. **Função à parte**
> BinaryOperator<Integer> soma = (acumulador, numero) -> acumulador + numero;
Integer soma = numerosList.stream().reduce(soma).get();
> Integer soma = numerosList.stream().reduce(soma, 0);


3. **Função Lambda**
> Integer soma = numerosList.stream().reduce((acumulador, numero) -> acumulador + numero).get();

4. Imprimindo diretamente um binaryOperator com um bloco de instrução:

> System.out.println(numerosList.stream().reduce(0, (valorInicial, elemento) -> {
  System.out.println("valorInicial: " + valorInicial);
  System.out.println("elemento: " + elemento);
  int resultado = valorInicial + elemento;
  System.out.println("resultado: "+resultado);
  return resultado; 
}));

4. **method reference**
> Integer soma = numerosList.stream().reduce(0, Integer::sum);

Sobre o método com 3 argumentos:  **reduce(acumulador,funcaoReducao,funcaoCombinacao)**

O objetivo da **funcaoCombinacao** seja permitir a computação paralela e, portanto, meu palpite é que ela só será usada se a redução for realizada em paralelo. *Se for executado sequencialmente, não há necessidade de usar combiner*. 

>List\<String> caracteres = Arrays.asList("A", "B", "A", "A", "C", "A", "A");
    Long contadorDeLetraA = caracteres.stream().reduce(
        0L,
        (acumulador, elemento) -> elemento.charAt(0) == 'A' ? acumulador + 1 : acumulador,
        (acumulador, elemento) -> {
          System.out.println(acumulador + " " + elemento);
          return Long.sum(acumulador, elemento);
        });
    System.out.println(contadorDeLetraA);

Explicação do código:

1. O valor inicial do acumulador é 0L.
2. A função de redução (a, b) -> b.charAt(0) == 'A' ? a + 1 : a é aplicada a cada elemento da lista results:
- Para "A", o acumulador é incrementado de 0 para 1.
- Para "B", o acumulador permanece em 1.
- Para o próximo "A", o acumulador é incrementado de 1 para 2.
- E assim por diante, até o final da lista, quando o acumulador chega a 5.
3. A **função de combinação** `(a, b) -> { System.out.println(a + " " + b); return Long.sum(a, b); }` é chamada, mas **não é usada para calcular o resultado final**. Ela apenas imprime os valores dos acumuladores a e b, mas esses valores não são utilizados. Nada dele é impresso.
4. Finalmente, o valor final do acumulador, que é 5, é impresso no console.


# Optional

O **Optional** é uma classe que representa um valor opcional. Ele é usado para evitar NullPointerExceptions.

Métodos mais utilizados:
- **Optional.of()** - Cria um Optional com um valor não nulo.
Exemplo:
> 
- **Optional.empty()** - Cria um Optional vazio.
- **Optional.ofNullable()** - Cria um Optional com um valor nulo ou não nulo.
- **Optional.isPresent()** - Retorna true se o Optional possui um valor, caso contrário, retorna false.
- **Optional.get()** - Retorna o valor do Optional, caso contrário, lança uma NoSuchElementException.
- **Optional.orElse()** - Retorna o valor do Optional, caso contrário, retorna o valor fornecido como parâmetro.
- **Optional.orElseGet()** - Retorna o valor do Optional, caso contrário, retorna o valor fornecido como parâmetro,mas esse valor é calculado somente se o Optional for vazio.
- **Optional.orElseThrow()** - Retorna o valor do Optional, caso contrário, lança uma NoSuchElementException.
- **Optional.ifPresent()** - Executa uma ação se o Optional possui um valor, caso contrário, não faz nada.
- **Optional.map()** - Aplica uma função ao valor do Optional, caso contrário, retorna um Optional vazio.
- **Optional.filter()** - Filtra o valor do Optional, caso contrário, retorna um Optional vazio.
- **Optional.flatMap()** - Aplica uma função ao valor do Optional, caso contrário, retorna um Optional vazio.
- **Optional.stream()** - Retorna um Stream com o valor do Optional, caso contrário, retorna um Stream vazio.
- **Optional.parallelStream()** - Retorna um Stream paralelo com o valor do Optional, caso contrário, retorna um Stream vazio.
- **Optional.toArray()** - Retorna um array com o valor do Optional, caso contrário, retorna um array vazio.
- **Optional.toSet()** - Retorna um conjunto com o valor do Optional, caso contrário, retorna um conjunto vazio.
- **Optional.toMap()** - Retorna um mapa com o valor do Optional, caso contrário, retorna um mapa vazio.
- **Optional.toList()** - Retorna uma lista com o valor do Optional, caso contrário, retorna uma lista vazia.
- **Optional.toCollection()** - Retorna uma coleção com o valor do Optional, caso contrário, retorna uma coleção vazia.
- **Optional.toSortedSet()** - Retorna um conjunto ordenado com o valor do Optional, caso contrário, retorna um conjunto ordenado vazio.
- **Optional.toSortedMap()** - Retorna um mapa ordenado com o valor do Optional, caso contrário, retorna um mapa ordenado vazio.


# Repositório
https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java/tree/master/src/stream_api
