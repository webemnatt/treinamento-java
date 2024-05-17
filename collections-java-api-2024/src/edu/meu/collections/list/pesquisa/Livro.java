package edu.meu.collections.list.pesquisa;

/**
 * Esta classe tem como atributos titulo, autor e ano de publicação.
 * O único método é o <strong>toString</strong> sobrescrito para exibir cada um
 * de seus objetos como String
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/16/24
 */

public class Livro {
  private String titulo;
  private String autor;
  private int anoPublicacao;

  public Livro(String titulo, String autor, int anoPublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getAnoPublicacao() {
    return anoPublicacao;
  }

  @Override
  public String toString() {
    return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
  }

}
