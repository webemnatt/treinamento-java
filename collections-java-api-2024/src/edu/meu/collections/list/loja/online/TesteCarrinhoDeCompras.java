package edu.meu.collections.list.loja.online;

public class TesteCarrinhoDeCompras {
  public static void main(String[] args) {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    double valorTotal = carrinho.calcularValorTotal();
    System.out.println("valor total do carrinho:" + valorTotal);
    carrinho.exibirItens();

    System.out.println("-----------Adicionando itens----------------");
    carrinho.adicionarItem("Camiseta", 20.0, 3);
    carrinho.adicionarItem("Calça", 30.0, 2);
    carrinho.adicionarItem("Camiseta manga longa", 15.0, 1);
    carrinho.adicionarItem("Camiseta manga longa", 15.0, 1);
    carrinho.adicionarItem("Camiseta manga longa", 15.0, 1);

    double valorTotal1 = carrinho.calcularValorTotal();
    System.out.printf("valor total do carrinho: R$ %.2f\n", valorTotal1);

    System.out.println("-----------Removendo itens----------------");
    carrinho.exibirItens();
    carrinho.removerItem("Camiseta");
    carrinho.removerItem("Camiseta");
    carrinho.exibirItens();
    carrinho.removerItem("Camiseta manga longa");
    carrinho.removerItem("Camiseta manga longa");
    carrinho.removerItem("Camiseta manga longa");
    carrinho.removerItem("Calça");

    double total2 = carrinho.calcularValorTotal();
    System.out.printf("valor total do carrinho: R$ %.2f\n", total2);
    carrinho.exibirItens();

  }
}
