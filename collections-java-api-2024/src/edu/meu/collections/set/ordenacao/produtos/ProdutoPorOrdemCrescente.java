package edu.meu.collections.set.ordenacao.produtos;

import java.util.Comparator;

/**
 * Classe auxiliar específica para comparar e ordenar o Produto por ordem
 * crescente de
 * preço. Para tanto, a classe implementa um Comparator com Produto como
 * generics e sobrescreve <strong>compare</strong>
 */
public class ProdutoPorOrdemCrescente implements Comparator<Produto> {

  @Override
  public int compare(Produto produto1, Produto produto2) {
    if (produto1.getPreco() > produto2.getPreco()) {
      return 1;
    } else if (produto1.getPreco() < produto2.getPreco()) {
      return -1;
    } else {
      return 0;
    }
  }

}
