package edu.meu.collections.map.ordenacao.livraria;

public class TesteLivrariaOnline {
  public static void main(String[] args) {
    LivrariaOnline livraria = new LivrariaOnline();
    livraria.removerLivro("null");
    livraria.pesquisarLivrosPorAutor("null");
    livraria.obterLivroMaisCaro();
    livraria.exibirLivrosOrdenadosPorPreco();
    System.out.println();
    livraria.adicionarLivro("https://www.null.com/titulo1/autor1", "Titulo 1", "Autor 1", 30.0);
    livraria.adicionarLivro("https://www.null.com/titulo2/autor2", "Titulo 2", "Autor 2", 35.0);
    livraria.adicionarLivro("https://www.null.com/titulo3/autor3", "Titulo 3", "Autor 3", 28.0);
    livraria.adicionarLivro("https://www.null.com/titulo4/autor3", "Titulo 4", "Autor 3", 250.0);
    livraria.adicionarLivro("https://www.null.com/titulo5/autor3", "Titulo 5", "Autor 3", 100.0);

    System.out.println();
    System.out.println("-----exibindo todos os livros em ordem crescente de preço:-----------");
    livraria.exibirLivrosOrdenadosPorPreco();
    System.out.println();
    System.out.println("-----o livro mais caro--------");
    System.out.println(livraria.obterLivroMaisCaro());
    System.out.println();

    System.out.println("-----------pesquisando livros por autor------------");
    System.out.println(livraria.pesquisarLivrosPorAutor("Autor 3"));
    System.out.println();
    System.out.println("----Removendo livro de título existente-----");
    livraria.removerLivro("null");
    System.out.println();
    System.out.println("----Removendo livro de título existente-----");
    livraria.removerLivro("Titulo 4");
    System.out.println();

    System.out.println("-----------pesquisando livros por autor existente------------");
    System.out.println(livraria.pesquisarLivrosPorAutor("Autor 3"));
    System.out.println();

    System.out.println("-----------pesquisando livros por autor inexistente------------");
    System.out.println(livraria.pesquisarLivrosPorAutor("Autor 13"));
    // retorna uma lista vazia de livros.
    System.out.println();

  }
}
