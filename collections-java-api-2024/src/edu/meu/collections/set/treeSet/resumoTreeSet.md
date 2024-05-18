# TreeSet

É uma coleção que implementa a interface Set. **Armazena elementos de forma ordenada e eficiente.**

As operações mais comuns são:

- Adicionar elementos: treeSet.add(elemento);
- Remover elementos: treeSet.remove(elemento);
- Verificar se um elemento está presente: treeSet.contains(elemento);
- Obter o primeiro elemento: treeSet.first();
- Obter o último elemento: treeSet.last();
- Iterar sobre os elementos: for (Tipo elemento : treeSet) { ... }.

## Impedindo a adição de elementos duplicados

Porém, se você tentar adicionar um elemento que já está presente no TreeSet, ele não será adicionado. Isso acontece porque o TreeSet utiliza o método equals() para comparar os elementos. Se o método equals() retornar true, o elemento já está presente no TreeSet e, portanto, não será adicionado.

Para que não permita elementos duplicados ou nulos sejam adicionados, é preciso sobrescrever na classe os métodos **hashcode** e **equals**

Ele é comumente usado em cenários que envolvem pesquisa, classificação e manipulação de conjuntos de dados.

## Ordenação
O TreeSet é ordenado por padrão, mas é possível alterar a ordem de forma a ser crescente ou decrescente.
Para isso, é necessário sobrescrever o método **comparator** da classe TreeSet.

A **ordenação natural** necessita que a classe implemente **Comparable\<ObjetoDestaClasse>** e sobrescreve o método **compareTo** desta interface, de acordo com o parâmetro desejado, lembrando que a classe do Objeto só pode conter um tipo de ordenação - porque este será usado como a chave-valor: um elemento que não deve conter mais de um.

Para ordenação dos demais atributos, cria-se classes auxiliares implementando desta vez a interface **Comparator\<ObjetoDestaClasse>** e sobrescreve-se o seu método **compare** com o parâmetro e ordem desejada.

## Comparações
Para ordenar é preciso primeiro comparar os elementos entre si:

* se String: **compareTo** ou **compareToIgnoreCase**
* se Integer: **compareTo**
* se Double: **compareTo**
* se Date: **compareTo**
* se tipos primitivos, precisa explicitamente inserir a lógica:
  * se primeiro int menor que o segundo: retorna -1
  * se primeiro int maior que o segundo: retorna 1
  * senão, retorna zero.
  * o mesmo vale para outros tipos de números.


## Métodos próprios

Após a implementação de **Comparable** e, caso precise, **Comparator** - e sobrescritos seus respectivos métodos na classe principal, na classe que recebe esta classe como generics de Set é preciso criar os métodos, inicializando uma nova lista e declarando como sendo do tipo **TreeSet**.

Para **ordem natural**, basta fazer o TreeSet receber como parâmetro o atributo Set desta Classe.

Para ordenação de outros atributos do objeto, como parâmetro recebe-se a classe auxiliar com a referida ordenação.

E somente então o novo Set adiciona o conjunto desta classe.

**OBS.:** Para modificação dos elementos (adição, remoção), faça uso da classe **HashSet**.
