package edu.meu.collections.list.pesquisa;

import java.util.List;

public class TesteCatalogoLivros {
  public static void main(String[] args) {
    CatalogoLivros listaLivros = new CatalogoLivros();
    System.out.println("---------------------Fazendo os testes iniciais-----------------------------");
    listaLivros.pesquisarPorAutor("null");
    listaLivros.pesquisarPorIntervaloAnos(0, 0);
    listaLivros.pesquisarPorTitulo("null");

    System.out.println("------adicionando o mesmo livro duas vezes-------------");
    // Autor 1
    listaLivros.adicionarLivro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 1954);
    listaLivros.adicionarLivro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 1954);

    System.out.println("------adicionando livros-------------");
    listaLivros.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);
    listaLivros.adicionarLivro("Silmarillion", "J.R.R. Tolkien", 1977);

    // Autor 2
    listaLivros.adicionarLivro("Harry Potter e a Pedra Filosofal", "J.K.Rowling", 1997);
    listaLivros.adicionarLivro("Harry Potter e a Câmara Secreta", "J.K. Rowling",
        1998);

    // Autor 3
    listaLivros.adicionarLivro("1984", "George Orwell", 1949);
    listaLivros.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);

    // Autor 4
    listaLivros.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry",
        1943);
    listaLivros.adicionarLivro("Voo Noturno", "Antoine de Saint-Exupéry", 1931);

    // Autor 5
    listaLivros.adicionarLivro("Orgulho e Preconceito", "Jane Austen", 1813);
    listaLivros.adicionarLivro("Razão e Sensibilidade", "Jane Austen", 1811);

    System.out.println("--------imprimindo todos os livros do catálogo:---------");
    List<Livro> lista = listaLivros.getListaDeLivros();
    for (Livro livro : lista) {
      System.out.println(livro);
    }

    System.out.println("------Pesquisando livros de Jane Austen------");
    List<Livro> pesquisarPorAutorAusten = listaLivros.pesquisarPorAutor("Jane Austen");
    System.out.println(pesquisarPorAutorAusten);

    System.out.println("------Pesquisando livros de J.R.R. Tolkien------");
    List<Livro> pesquisarPorAutorTolkien = listaLivros.pesquisarPorAutor("J.R.R. Tolkien");
    for (Livro livro : pesquisarPorAutorTolkien) {
      System.out.println(livro.getTitulo());
    }

    System.out.println("-------Pesquisa por intervalo de anos-----------------");
    List<Livro> pesquisarPorIntervaloAnos = listaLivros.pesquisarPorIntervaloAnos(1900, 1950);
    System.out.println(pesquisarPorIntervaloAnos);

    System.out.println("-------Pesquisa por TÍTULO-----------------");
    Livro pesquisarPorTitulo = listaLivros.pesquisarPorTitulo("Voo Noturno");
    System.out.println(pesquisarPorTitulo);
  }
}
