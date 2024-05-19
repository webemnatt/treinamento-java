package edu.meu.collections.map.operacoesBasicas.dicionario;

import java.util.Map;

public class TesteDicionario {
  public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();

    dicionario.removerPalavra("null");
    dicionario.exibirPalavras();
    dicionario.pesquisarPorPalavra("null");

    System.out.println("------------adicionando palavras e suas respectivas definições-------------");
    dicionario.adicionarPalavra("NullPointerException",
        "ocorre ao tenta acessar um objeto nulo, ou seja, não inicializado.");
    dicionario.adicionarPalavra("IllegalArgumentException",
        "ocorre ao tentar adicionar uma chave inválida ou um valor inválido no Map.");
    dicionario.adicionarPalavra("ConcurrentModificationException",
        "ocorrer ao tentar modificar o Map durante uma iteração, sem usar os métodos de iteração adequados.");
    dicionario.adicionarPalavra("ClassCastException",
        "ocorre quando tentamos adicionar um objeto de um tipo diferente do esperado.");
    dicionario.adicionarPalavra("NoSuchElementException",
        "ocorre quando tentamos acessar um objeto que não existe no Map.");
    dicionario.adicionarPalavra("UnsupportedOperationException",
        "ocorre ao tentar chamar um método não suportado pela implementação do Map");
    dicionario.adicionarPalavra("IndexOutOfBoundsException",
        "ocorre ao tentar acessar um índice inválido no Map que suporta acesso por índice (como LinkedHashMap).");

    System.out.println();

    System.out.println(
        "------------exibindo todas as palavras cadastradas do dicionário e suas respectivas definições------------");
    dicionario.exibirPalavras();

    System.out.println("------------adicionando palavra de definição repetida-------------");
    dicionario.adicionarPalavra("chave qualquer",
        "ocorre ao tentar acessar um índice inválido no Map que suporta acesso por índice (como LinkedHashMap).");
    // adicionado com sucesso
    System.out.println("------------adicionando palavra repetida com definição diferente------------");
    dicionario.adicionarPalavra("NoSuchElementException",
        "Pode ocorrer ao tentar acessar um elemento que não existe no Map.");
    // a chave tem seu valor alterado.
    System.out.println(
        "------------exibindo cada palavra do dicionário e sua respectiva definição usando o for------------");
    Map<String, String> dicionarioMAP = dicionario.getMapaDePalavras();
    for (Map.Entry<String, String> entry : dicionarioMAP.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    System.out.println("--------------exibindo quantidade de elementos do dicionario ---------------");
    System.out.println("Quantidade de palavras do dicionário: " + dicionarioMAP.size());

    System.out.println("------------pesquisando palavra que não existe no dicionário------------");
    String definicao01 = dicionario.pesquisarPorPalavra("null");
    System.out.println(definicao01);
    // retorna null
    System.out.println("------------pesquisando palavra que existe no dicionário------------");
    String definicao02 = dicionario.pesquisarPorPalavra("NoSuchElementException");
    System.out.println(definicao02);
    System.out.println("------------removendo palavra que não existe no dicionário------------");
    dicionario.removerPalavra("null");
    System.out.println("------------removendo palavra que existe no dicionário------------");
    dicionario.removerPalavra("chave qualquer");

    System.out
        .println("------------exibindo cada palavra do dicionário e sua respectiva definição usando o for------------");
    for (Map.Entry<String, String> entry : dicionarioMAP.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    System.out.println("--------------exibindo quantidade de elementos do dicionario ---------------");
    System.out.println("Quantidade de palavras do dicionário: " + dicionarioMAP.size());

  }
}
