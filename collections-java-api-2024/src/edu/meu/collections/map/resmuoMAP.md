# Map
Enquanto List e Set recebem apenas um tipo de parâmetro genérico, Map é parametrizada com **dois tipos de parâmetros**: `Map<chave, valor>`, podendo ambos serem classes como String, Integer, Double, Boolean, ou uma classe Personalizada.

As razões principais para usar a interface `Map` em vez de `Set` ou `List` em Java:

1. **Associação chave-valor**:
   - A principal razão para usar `Map` é quando você precisa armazenar e acessar dados com base em uma chave única.
   - `Map` permite associar um valor a uma chave, o que é útil em muitos cenários, como cache, dicionários, configurações, etc.
   - `Set` e `List` não possuem essa associação chave-valor.

2. **Acesso rápido por chave**:
   - `Map` fornece acesso rápido aos valores armazenados, usando a chave como índice.
   - Isso é mais eficiente do que procurar em uma `List` ou `Set`, especialmente quando você precisa acessar elementos com base em uma chave.

3. **Unicidade de chaves**:
   - Em um `Map`, cada chave deve ser única, o que garante que não haja duplicatas.
   - Isso é útil quando você precisa garantir que cada elemento seja identificado de forma exclusiva.
   - `Set` também garante a unicidade, mas não possui a associação chave-valor.

4. **Organização de dados**:
   - `Map` é útil quando você precisa organizar e acessar dados de forma estruturada, com base em chaves.
   - Isso é especialmente útil em cenários onde você precisa recuperar, atualizar ou remover elementos com base em uma chave.

5. **Desempenho**:
   - Dependendo da implementação do `Map` (como `HashMap` ou `TreeMap`), o acesso, a inserção e a remoção de elementos podem ser muito eficientes, com complexidade de tempo constante ou logarítmica.
   - Isso os torna mais adequados do que `List` ou `Set` em determinadas situações que exigem alto desempenho.

Então, em resumo, use `Map` quando:

- Você precisa associar valores a chaves únicas.
- Você precisa de acesso rápido aos elementos com base em uma chave.
- Você precisa organizar e acessar dados de forma estruturada.
- O desempenho é uma preocupação importante.

Por outro lado, use `List` quando você precisa de uma coleção ordenada de elementos, e `Set` quando você precisa de uma coleção de elementos únicos, sem a necessidade de associação chave-valor.

