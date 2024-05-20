package edu.meu.collections.map.ordenacao.livraria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/**
 * Classe que representa uma livraria online.
 * Possui os métodos:
 * <strong>adicionarLivro</strong>,
 * <strong>removerLivro</strong>,
 * <strong>exibirLivrosOrdenadosPorPreco</strong>,
 * <strong>pesquisarLivrosPorAutor</strong> e
 * <strong>obterLivroMaisCaro</strong>.
 */
public class LivrariaOnline {
  Map<String, Livro> livros;

  public LivrariaOnline() {
    livros = new HashMap<>();
  }

  /**
   * Adiciona um livro como valor. Sua chave é o link do livro na Amazon
   * 
   * @param link   do tipo String
   * @param titulo do tipo String
   * @param autor  do tipo String
   * @param preco  do tipo double
   */
  public void adicionarLivro(String link, String titulo, String autor, double preco) {
    livros.put(link, new Livro(titulo, autor, preco));
  }

  /**
   * Método que remove o livro pelo seu titulo.
   * 
   * @param titulo
   */
  public void removerLivro(String titulo) {
    boolean encontrou = false;
    if (!livros.isEmpty()) {
      for (Map.Entry<String, Livro> entrada : livros.entrySet()) {
        if (entrada.getValue().getTitulo().equals(titulo)) {
          livros.remove(entrada.getKey());
          encontrou = true;
          break;
        }
      }
      if (!encontrou) {
        System.out.println("Título não encontrado.");
      }
    }
  }

  /**
   * Método que exibe todos os livros cadastrados em ordem crescente de preço
   */
  public void exibirLivrosOrdenadosPorPreco() {
    if (!livros.isEmpty()) {
      TreeSet<Livro> livrosOrdenadosPorPreco = new TreeSet<>(livros.values());
      for (Livro livro : livrosOrdenadosPorPreco) {
        System.out.println(livro);
      }
    }
  }

  /**
   * Retorna uma lista de todos os livros escritos por um determinado autor.
   * 
   * @param autor
   * @return
   */
  public List<Livro> pesquisarLivrosPorAutor(String autor) {
    List<Livro> livrosEncontrados = new ArrayList<>();
    if (!livros.isEmpty()) {
      for (Livro livro : livros.values()) {
        if (livro.getAutor().equals(autor)) {
          livrosEncontrados.add(livro);
        }
      }
    }
    return livrosEncontrados;
  }

  /**
   * Método que retorna o objeto Livro com o maior preço
   * 
   * @return
   */
  public Livro obterLivroMaisCaro() {
    Livro livroMaisCaro = null;
    TreeSet<Livro> livrosOrdenadosPorPreco = new TreeSet<>(livros.values());
    for (Livro livro : livrosOrdenadosPorPreco) {
      if (livroMaisCaro == null) {
        livroMaisCaro = livro;
      } else {
        if (livroMaisCaro.getPreco() < livro.getPreco()) {
          livroMaisCaro = livro;
        }
      }
    }
    return livroMaisCaro;
  }

}
