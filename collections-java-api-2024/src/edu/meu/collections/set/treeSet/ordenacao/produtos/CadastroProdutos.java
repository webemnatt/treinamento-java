package edu.meu.collections.set.treeSet.ordenacao.produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Classe responsável por adicionar produtos.
 * Possui os métodos <strong>adicionarProduto</strong>,
 * <strong>exibirProdutosPorNome</strong> e
 * <strong>exibirProdutosPorPreco</strong>
 */
public class CadastroProdutos {

  Set<Produto> conjuntoDeProdutos;

  public CadastroProdutos() {
    conjuntoDeProdutos = new HashSet<>();
  }

  /**
   * Método que cadastra um produto.
   * Uma mensagem será exibida se o código do produto já existir, e o produto não
   * será cadastrado.
   * 
   * @param cod        do tipo long
   * @param nome       do tipo String
   * @param preco      do tipo double
   * @param quantidade do tipo int
   */
  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    if (!conjuntoDeProdutos.isEmpty()) {
      for (Produto produto : conjuntoDeProdutos) {
        if (produto.getCod() == cod) {
          System.out.println("produto já cadastrado.");
        }
      }
    }
    conjuntoDeProdutos.add(new Produto(cod, nome, preco, quantidade));
  }

  /**
   * Método que exibe o conjunto por ordem alfabética.
   * Faz uso do TreeSet para que seja possível organizar.
   * Dispensa uso de Collections porque o TreeSet já organiza o Set.
   */
  public void exibirProdutosPorNome() {
    Set<Produto> produtosPorOrdemAlfabetica = new TreeSet<>(conjuntoDeProdutos);

    System.out.println(produtosPorOrdemAlfabetica);
  }

  /**
   * Método que exibe o conjunto de produtos por ordem crescente de preços.
   * Faz a ordenação inicializando com Treeset recebendo como parâmetro a
   * instãncia de ProdutoPorOrdemCrescente.
   */
  public void exibirProdutosPorPreco() {
    Set<Produto> produtosPorOrdemPorPreco = new TreeSet<>(new ProdutoPorOrdemCrescente());
    produtosPorOrdemPorPreco.addAll(conjuntoDeProdutos);

    System.out.println(produtosPorOrdemPorPreco);
  }
}
