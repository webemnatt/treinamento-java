# List

O List é uma interface no Java que representa uma coleção ordenada de elementos.

## ArrayList 

O ArrayList é uma implementação do List.

- **Ordem**: Os elementos no ArrayList são armazenados em uma ordem específica, que é mantida durante as operações de adição, remoção e acesso.
- **Duplicatas**: O ArrayList permite a adição de elementos duplicados.
- **Acesso por índice**: Você pode acessar e modificar elementos específicos do ArrayList usando seus índices.
- **Tamanho dinâmico**: O tamanho do ArrayList pode ser alterado dinamicamente, adicionando ou removendo elementos.

Operações comuns:

- Adicionar elementos: list.**add**(elemento), list.add(índice, elemento);
- Remover elementos: list.**remove**(elemento), list.remove(índice);
- Acessar elementos: list.**get**(índice);
- Modificar elementos: list.**set**(índice, novoElemento);
- Iterar sobre os elementos: **for** (Tipo elemento : list) { ... }.

**OBS.:** Se precisa de uma coleção sem entradas duplicadas, fazer uso de classes que implementam a interface **Set**, como **HashSet**(não ordenado) ou **TreeSet**(ordenado)
