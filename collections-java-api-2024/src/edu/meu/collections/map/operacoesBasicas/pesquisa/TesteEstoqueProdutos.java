package edu.meu.collections.map.operacoesBasicas.pesquisa;

public class TesteEstoqueProdutos {
  public static void main(String[] args) {
    EstoqueProdutos estoque = new EstoqueProdutos();
    estoque.obterProdutoMaisCaro();
    estoque.obterProdutoMaisBarato();
    estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    estoque.exibirProdutos();

    estoque.adicionarProduto(12431L, "borracha", 100, .5);
    estoque.adicionarProduto(12432L, "caneta", 100, 1.5);
    estoque.adicionarProduto(12433L, "lapis", 100, 1.0);
    estoque.adicionarProduto(12436L, "papel timbrado", 400, 25.0);
    System.out.println("----------adicionando produtos cujo valor total é igual---------------");
    estoque.adicionarProduto(12435L, "caderno timbrado 100fs pequeno", 100, 10.0);
    estoque.adicionarProduto(12434L, "papel resma", 10, 25.0);

    estoque.exibirProdutos();
    System.out.println();
    Produto produtoMaiorValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    System.out.println("Produto com maior valor total no estoque: " + produtoMaiorValorTotal);

    System.out.println();
    Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
    System.out.println("Produto mais barato: " + produtoMaisBarato);
    System.out.println();

    Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
    System.out.println("Produto mais caro: " + produtoMaisCaro);
    System.out.println();
  }
}
