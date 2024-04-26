# Nomenclatura:
## Classes:
+ primeira letra : Maíuscula
+ se nome composto: camelCase
+ o nome da classe obrigatoriamente o mesmo do arquivo.
+ Arquivo: extensão .java
+ Se é uma classe executável: deve conter um método main padrão

## Atributos:
+ **nomes legíveis/inteligíveis**
+ Primeira letra : minúscula
+ Se nome composto: camelCase
``` 
String nomeComposto = "Maria Carolina da Silva"; 
```
+ Se valor *estático* (nunca será alterado):
  + escrito tudo em maiúsculo
  + se nome composto, separado por sublinhado
  + começa com a palavra reservada *final*
  ```
  final double PI = 3.14;
  final int ANO_2000 = 2000;
  ```
+ Símbolos permitidos: `_` e `$`
+ Números somente após uma letra/palavra;

# Declarando variáveis e métodos

## Variáveis

```
tipo nomeBemDefinido = valor com tipagem correta;
```

A **declaração** é a seguinte:
+ precisa de um tipo da variável
+ precisa de um nome
+ precisa do ponto-e-vírgula no final da linha
```
String name;
```

A **inicialização**
Pode ser feita na mesma linha da declaração ou em momento posterior.
+ sinal de igualdade
+ o valor ou a manipulação
+ se na mesma linha:
```
String name = "John";
```
+ se posteriormente:
```
name = "John";
```

## Métodos

```
TipoRetorno ObjetivoNoInfinitivo (parâmetros){
  return algo;
}
```

+ o escopo, se não informado, é *package*
+ o **tipo** do retorno, que valor sairá deste método
  + se não retorna nada, precisa explicitar com *void*
+ **nome** do método, o que ele faz no infinitivo
+ 0 ou mais parâmetros entre os **parênteses**
  + os **parâmetros** são inicializações, portanto precisam de:
    * Informe o tipo
    * Informe o nome do parâmetro
    * Se mais de um, separe com vírgulas
    * Se único parâmetro, não insira `;`
+ **chaves** após o fechamento dos parênteses
  + dentro deste bloco de código, informe o que será feito
  + retorne com **return** o valor de saída;

Exemplo:

```
int somar(int numero1, int numero2){
  return int numero1 + int numero2
}
```
Outro exemplo:
```
String nomeCompleto(String prenome, String sobrenome) {
  return prenome.concat(" ").concat(sobrenome);
}
```

