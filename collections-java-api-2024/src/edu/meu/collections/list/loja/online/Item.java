package edu.meu.collections.list.loja.online;

/**
 * Classe com atributos privados <strong>nome</strong>,<strong>preco</strong>, e <strong>quantidade</strong>.
 * Possui construtor com parâmetros, getters e setters.
 * Sobrescreve o método toString para exibir o objeto desta classe e seus respectivos atributos e valores.
 * @author webemnatt
 * @version 1.0.0
 * @since 05/16/24
 */
public class Item {
  private String nome;
  private double preco;
  private int quantidade;

  public Item(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  @Override
  public String toString() {
    return "Item [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
  }

}
