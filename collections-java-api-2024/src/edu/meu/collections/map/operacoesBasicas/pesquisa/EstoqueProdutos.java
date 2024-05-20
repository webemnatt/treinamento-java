package edu.meu.collections.map.operacoesBasicas.pesquisa;

import java.util.Map;

/**
 * classe chamada "EstoqueProdutos" que utilize um Map para armazenar os
 * produtos, suas quantidades em estoque e seus respectivos preços.
 * Possui os métodos
 * <strong>adicionarProduto</strong>,
 * <strong>exibirProdutos</strong>,
 * <strong>obterProdutoMaisCaro</strong>,
 * <strong>obterProdutoMaisBarato</strong> e
 * <strong>obterProdutoMaiorQuantidadeValorTotalNoEstoque</strong>.
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/20/24
 */
public class EstoqueProdutos {

  private Map<Long, Produto> estoque;

  public EstoqueProdutos() {
    estoque = new java.util.HashMap<>();
  }

  /**
   * Adiciona um produto ao estoque, juntamente com a quantidade disponível e o
   * preço.
   * 
   * @param cod        do tipo long, é a chave
   * @param nome       do tipo String
   * @param quantidade do tipo int
   * @param preco      do tipo double
   */
  public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
    estoque.put(cod, new Produto(nome, quantidade, preco));
  }

  /**
   * Exibe todos os produtos, suas quantidades em estoque e preços.
   */
  public void exibirProdutos() {
    System.out.println(estoque);
  }

  /**
   * Calcula e retorna o valor total do estoque, considerando a quantidade e o
   * preço de cada produto.
   * 
   * @return um double
   */
  public double calcularValorTotalEstoque() {
    double valorTotal = 0.0;
    if (!estoque.isEmpty()) {
      for (Map.Entry<Long, Produto> entrada : estoque.entrySet()) {
        valorTotal += entrada.getValue().getQuantidade() * entrada.getValue().getPreco();
      }
    }
    return valorTotal;
  }

  /**
   * Método auxiliar que compara preços dentro do estoque:
   * 1. verifica se o conjunto tem elementos.
   * 2. itera o Map evidenciando cada entrada.
   * 3. se o elemento que será retornado estiver null, ele receberá o valor da
   * primeira entrada.
   * 4. Se o elemento já tiver um valor, então será comparado com o da próxima
   * entrada.
   * 5. o produto terá seu valor reatribuído de acordo com a comparação:
   * se falso, armazena o produto com maior preço, se true, armazena o produto com
   * menor preço.
   * 6. A saída será o Produto de maior/menor preço.
   * 
   * @param produto
   * @param precoAtualEMenorPreco boolean.
   * @return o Produto
   */
  private Produto comparaPreco(Produto produto, boolean maiorPreco) {
    if (!estoque.isEmpty()) {
      for (Map.Entry<Long, Produto> entrada : estoque.entrySet()) {
        if (produto == null) {
          produto = entrada.getValue();
        } else {
          if (maiorPreco) {
            if (produto.getPreco() < entrada.getValue().getPreco())
              produto = entrada.getValue();
          } else {
            if (produto.getPreco() > entrada.getValue().getPreco())
              produto = entrada.getValue();
          }
        }
      }
    }
    return produto;
  }

  /**
   * Retorna o produto com o maior preço.
   * 
   * @return o Produto mais caro
   */
  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    produtoMaisCaro = comparaPreco(produtoMaisCaro, true);
    return produtoMaisCaro;
  }

  /**
   * Retorna o produto com o menor preço.
   *
   * @return o Produto mais barato
   */
  public Produto obterProdutoMaisBarato() {
    Produto produtoMaisBArato = null;
    produtoMaisBArato = comparaPreco(produtoMaisBArato, false);
    return produtoMaisBArato;
  }

  /**
   * Método compara valores totais (quantidade * preço) entre produtos e retorna o
   * PRIMEIRO PRODUTO mais valioso do estoque, mesmo que haja outros produtos de mesmo valor
   * 
   * @return um Produto.
   */
  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produto produtoDeMaiorValorTotal = null;
    if (!estoque.isEmpty()) {
      for (Map.Entry<Long, Produto> entrada : estoque.entrySet()) {
        if (produtoDeMaiorValorTotal == null) {
          produtoDeMaiorValorTotal = entrada.getValue();
        } else {
          double valorTotalProduto = produtoDeMaiorValorTotal.getPreco() * produtoDeMaiorValorTotal.getQuantidade();
          double valorTotalEntrada = entrada.getValue().getPreco() * entrada.getValue().getQuantidade();
          if (valorTotalProduto < valorTotalEntrada) {
            produtoDeMaiorValorTotal = entrada.getValue();
          }
        }
      }
    }
    return produtoDeMaiorValorTotal;
  }
}
