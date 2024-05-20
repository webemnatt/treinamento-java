package edu.meu.collections.map.operacoesBasicas.pesquisa;

/**
 * Cada produto possui um código como chave e um objeto Produto como valor,
 * contendo nome, quantidade e preço.
 */
public class Produto {
  
  // private long codigo;
  private String nome;
  private int quantidade;
  private double preco;
  
  public Produto(String nome, int quantidade, double preco) {
    // this.codigo = codigo;
    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
  }

  // public long getCodigo() {
  //   return codigo;
  // }

  public String getNome() {
    return nome;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public double getPreco() {
    return preco;
  }

  @Override
  public String toString() {
    return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
  }


  

}
