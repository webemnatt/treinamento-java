package edu.meu.collections.loja.online;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um carrinho de compras online.com atributo privado
 * <strong>listaDeItens</strong>, que é um List do
 * tipo Item.
 * Possui construtor sem parâmetros que inicializa o atributo como uma
 * ArrayList.
 * Possui métodos <strong>adicionarItem</strong>,
 * <strong>removerItem</strong>,<strong>calcularValorTotal</strong> e
 * <strong>exibirItens</strong>
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/16/24
 */
public class CarrinhoDeCompras {
  /**
   * Atributo privado que armazena uma lista de itens de um carrinho de compras
   * online.
   */
  private List<Item> listaDeItens;

  /**
   * Construtor sem parâmetros que inicializa o atributo privado para que a lista
   * retorne vazia e não null caso não tenha sido adicionado nenhum item à ela.
   */
  public CarrinhoDeCompras() {
    listaDeItens = new ArrayList<>();
  }

  /**
   * Este método vazio <strong>adiciona</strong> adiciona um Item à lista de
   * itens.
   * A cada vez que este método é chamado, um novo item é adicionado à lista
   * 
   * @param nome       do tipo String
   * @param preco      do tipo double
   * @param quantidade do tipo int
   */
  public void adicionarItem(String nome, double preco, int quantidade) {
    listaDeItens.add(new Item(nome, preco, quantidade));
  }

  /**
   * Este método vazio <strong>remove o item</strong> do carrinho com base no seu
   * nome.
   * Mesmo que haja mais do mesmo cadastrado no carrinho, a cada chamada deste
   * método remove apenas um daquela ocorrência.
   * 
   * @param nome espera um valor do tipo String com o nome do item a ser removido
   */
  public void removerItem(String nome) {
    List<Item> listaItemARemover = new ArrayList<>();
    boolean itemEncontrado = false;
    if (!listaDeItens.isEmpty()) {
      for (Item item : listaDeItens) {
        if (item.getNome().equalsIgnoreCase(nome)) {
          listaItemARemover.add(item);
          System.out.println("item removido: " + nome);
          listaDeItens.removeAll(listaItemARemover);
          itemEncontrado = true;
          break;
        }
      }
    }

    if (!itemEncontrado) {
      System.out.println("Item não encontrado:" + nome);
    }
  }

  /**
   * Este método calcula e retorna o valor total do carrinho, multiplicando
   * a quantidade pelo seu preço, retornando um double. Se a lista estiver vazia,
   * retorna zero.
   */
  public double calcularValorTotal() {
    double valorTotal = 0;
    if (!listaDeItens.isEmpty()) {
      for (Item item : listaDeItens) {
        valorTotal += item.getPreco() * item.getQuantidade();
      }
    }
    return valorTotal;
  }

  /**
   * Este método vazio exibe o nome, o preço e a quantidade de cada item presente
   * no carrinho.
   * Se a lista estiver vazia exibe a mensagem "Carrinho vazio."
   */
  public void exibirItens() {
    if (!listaDeItens.isEmpty()) {
      for (Item item : listaDeItens) {
        System.out.println(item);
      }
    } else {
      System.out.println("Carrinho vazio.");
    }
  }
}
