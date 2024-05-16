package edu.meu.collections.pesquisa;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe serve para criar um catálogo de livros,possui uma lista de
 * objetos do tipo Livro como atributo.
 * Tem como métodos <strong>adicionarLivro</strong>,
 * <strong>pesquisarPorAutor</strong>,
 * <strong>pesquisarPorIntervaloAnos</strong> e
 * <strong>pesquisarPorTitulo</strong>
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/16/24
 */
public class CatalogoLivros {
  private List<Livro> listaDeLivros;

  public List<Livro> getListaDeLivros() {
    return listaDeLivros;
  }

  public void setListaDeLivros(List<Livro> listaDeLivros) {
    this.listaDeLivros = listaDeLivros;
  }

  /**
   * Construtor sem parâmetros, apenas para inicializar a lista e não retornar
   * null caso nenhum livro for adicionado à ela
   */
  public CatalogoLivros() {
    listaDeLivros = new ArrayList<>();
  }

  /**
   * Método que adiciona um livro à lista de livros.
   * Cada vez que for chamado, adiciona um novo livro.
   * Impede que o livro de mesmo título, autor e ano de publicação seja cadastrado
   * em duplicidade
   * 
   * @param titulo        espera uma String como entrada
   * @param autor         espera uma String como entrada
   * @param anoPublicacao espera um int como entrada
   */
  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    boolean livroCadastrado = false;
    for (Livro livro : listaDeLivros) {
      if (livro.getTitulo().equals(titulo)
          && livro.getAutor().equals(autor)
          && livro.getAnoPublicacao() == anoPublicacao) {
        livroCadastrado = true;
        System.out.println("Livro já cadastrado");
      }
    }

    if (!livroCadastrado) {
      listaDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

  }

  /**
   * Este método pesquisa por autor e retorna uma lista de todos os livros
   * encontrados deste autor.
   * 
   * @param autor espera um valor do tipo String
   * @return uma lista do tipo Livro
   */
  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosDoMesmoAutor = new ArrayList<>();
    if (!listaDeLivros.isEmpty()) {
      for (Livro livro : listaDeLivros) {
        if (livro.getAutor().equals(autor)) {
          livrosDoMesmoAutor.add(livro);
        }
      }
    } else {
      System.out.println("Catálogo vazio. Não foi possível fazer pesquisa por autor.");
    }
    return livrosDoMesmoAutor;
  }

  /**
   * Este método faz a pesquisa por livros publicados em um determinado intervalo
   * de anos e retorna uma lista de todos livros encontrados do autor pesquisado.
   * 
   * @param anoInicial espera uma entrada de valor int
   * @param anoFinal   espera uma entrada de valor int
   * @return uma lista do tipo Livro
   */
  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosDoIntervalo = new ArrayList<>();
    boolean livroEncontrado = false;

    if (!listaDeLivros.isEmpty()) {
      for (Livro livro : listaDeLivros) {
        if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
          livrosDoIntervalo.add(livro);
          livroEncontrado = true;
        }
      }
      if (!livroEncontrado) {
        System.out.printf("Livro não encontrado para o período %d e %d\n", anoInicial, anoFinal);
      }
    } else {
      System.out.println("Catálogo vazio. Não foi possível fazer a pesquisa por intervalo de anos");
    }
    return livrosDoIntervalo;
  }

  /**
   * Este método livros por título e retorna o primeiro livro encontrado.
   * O método retorna <strong>null</strong> quando a lista está vazia ou quando o
   * livro não é encontrado.
   * 
   * @param titulo espera uma entrada do tipo String
   * @return um objeto do tipo Livro
   */
  public Livro pesquisarPorTitulo(String titulo) {
    if (listaDeLivros.isEmpty()) {
      System.out.println("Catálogo vazio. Não foi possível fazer pesquisa por título.");
      return null; // Retorna null quando a lista está vazia
    }

    for (Livro livro : listaDeLivros) {
      if (livro.getTitulo().equals(titulo)) {
        return livro;
      }
    }

    System.out.println("Livro não encontrado de título: " + titulo);
    return null; // Retorna null quando o livro não é encontrado
  }

}
