# HashSet

É uma coleção que implementa interface Set - não ordenada e não indexada - **bastante eficiente** quanto à **busca** e **adição** de elementos.

O HashSet é útil quando você precisa **armazenar** elementos de forma eficiente, sem duplicatas, e sem ordem de armazenamento. 

Ele é comumente usado em cenários que envolvem verificação de pertencimento e operações de conjunto (união, interseção, diferença).

## Impedindo a adição de elementos duplicados

Ao tentar adicionar um elemento que já está presente no TreeSet, ele não será adicionado. Isso acontece porque o TreeSet utiliza o método equals() para comparar os elementos. Se o método equals() retornar true, o elemento já está presente no TreeSet e, portanto, não será adicionado.

Para que não permita elementos duplicados ou nulos sejam adicionados, é preciso sobrescrever na classe os métodos **hashcode** e **equals**

Ele é comumente usado em cenários que envolvem pesquisa, classificação e manipulação de conjuntos de dados.

**OBS.:** para ordenação, faça uso de **TreeSet**


