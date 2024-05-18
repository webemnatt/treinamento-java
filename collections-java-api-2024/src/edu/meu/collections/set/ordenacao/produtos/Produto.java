package edu.meu.collections.set.ordenacao.produtos;

/**
 * Classe responsável pela criação de um produto. possui atributos
 * <strong>nome</strong>, <strong>cod</strong>, <strong>preco</strong> e
 * <strong>quantidade</strong>
 * O construtor da classe inicializa todos os atributos.
 * Não será permitido criar um objeto de mesmo cod.
 * A classe implementa Comparable e seu método é sobrescrito para que o nome
 * seja ordenável por ordem alfabética
 */
public class Produto implements Comparable<Produto> {

  private String nome;
  private long cod;
  private double preco;
  private int quantidade;

  public Produto(long cod, String nome, double preco, int quantidade) {
    this.nome = nome;
    this.cod = cod;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  @Override
  public int compareTo(Produto produto) {
    return this.nome.compareToIgnoreCase(produto.nome);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (cod ^ (cod >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Produto other = (Produto) obj;
    if (cod != other.cod)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Produto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", quantidade=" + quantidade + "]";
  }

  public String getNome() {
    return nome;
  }

  public long getCod() {
    return cod;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

}
