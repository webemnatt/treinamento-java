package edu.meu.collections.map.ordenacao.livraria;

public class Livro implements Comparable<Livro> {
  // título, autor e preço
  private String titulo;
  private String autor;
  private double preco;

  public Livro(String titulo, String autor, double preco) {
    this.titulo = titulo;
    this.autor = autor;
    this.preco = preco;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public double getPreco() {
    return preco;
  }

  @Override
  public String toString() {
    return "Livro [titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
  }
  @Override
  public int compareTo(Livro livro) {
    if (this.preco > livro.getPreco()) {
      return 1;
    } else if (this.preco < livro.getPreco()) {
      return -1;
    } else {
      return 0;
    }
  }

}
