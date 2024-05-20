package edu.meu.collections.map.operacoesBasicas.pesquisa.estoque;

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
 * @version 1.0.1
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
   * Método auxiliar para encontrar o produto procurado.
   * Se é pelo maior preço, armazena o produto com maior preço.
   * Senão, armazena o de menor preço.
   * 
   * @param produtoProcurado do tipo produto
   * @param peloMaiorPreco   do tipo boolean
   * @return
   */
  private Produto procurarProduto(Produto produtoProcurado, boolean peloMaiorPreco) {
    double valorMinimo = Double.MIN_VALUE;
    double valorMaximo = Double.MAX_VALUE;

    if (!estoque.isEmpty()) {
      for (Produto p : estoque.values()) {
        if (peloMaiorPreco) {
          if (p.getPreco() > valorMinimo) {
            produtoProcurado = p;
            valorMinimo = p.getPreco();
          }
        } else {
          if (p.getPreco() < valorMaximo) {
            produtoProcurado = p;
            valorMaximo = p.getPreco();
          }
        }
      }
    }
    return produtoProcurado;
  }

  /**
   * Retorna o produto com o maior preço.
   * 
   * @return o Produto mais caro
   */
  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    produtoMaisCaro = procurarProduto(produtoMaisCaro, true);
    return produtoMaisCaro;
  }

  /**
   * Retorna o produto com o menor preço.
   *
   * @return o Produto mais barato
   */
  public Produto obterProdutoMaisBarato() {
    Produto produtoMaisBArato = null;
    produtoMaisBArato = procurarProduto(produtoMaisBArato, false);
    return produtoMaisBArato;
  }

  /**
   * Método compara valores totais (quantidade * preço) entre produtos e retorna o
   * PRIMEIRO PRODUTO mais valioso do estoque, mesmo que haja outros produtos de
   * mesmo valor
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
