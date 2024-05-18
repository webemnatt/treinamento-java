package edu.meu.collections.set.ordenacao.produtos;

public class TesteCadastroProdutos {
  public static void main(String[] args) {
    CadastroProdutos catalogoProdutos = new CadastroProdutos();
    catalogoProdutos.exibirProdutosPorPreco();
    catalogoProdutos.exibirProdutosPorNome();

    System.out.println("-----Adicionando produtos-------");

    catalogoProdutos.adicionarProduto(1234, "Calça skinning", 200.0, 100);
    catalogoProdutos.adicionarProduto(1235, "Camisa manga longa", 140.0, 100);
    catalogoProdutos.adicionarProduto(1236, "Camisa manga curta", 120.0, 100);
    catalogoProdutos.adicionarProduto(1237, "Calça jeans", 150.0, 100);

    System.out.println("-----Adicionando produto repetido-------");
    catalogoProdutos.adicionarProduto(1235, "Camisa repetida", 140.0, 100);

    System.out.println("-----produto por ordem crescente de preço-------");
    catalogoProdutos.exibirProdutosPorPreco();

    System.out.println("-----produto por ordem alfabetica de nome-------");
    catalogoProdutos.exibirProdutosPorNome();

  }
}
