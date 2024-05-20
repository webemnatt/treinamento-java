package edu.meu.collections.map.operacoesBasicas.pesquisa.palavras;

public class TesteContagemPalavras {
  public static void main(String[] args) {
    ContagemPalavras palavrasMap = new ContagemPalavras();
    palavrasMap.exibirContagemPalavras();
    System.out.println(palavrasMap.encontrarPalavraMaisFrequente());
    palavrasMap.adicionarPalavra("amigo", 3);
    palavrasMap.adicionarPalavra("criança", 2);
    palavrasMap.adicionarPalavra("felicidade", 100);
    palavrasMap.adicionarPalavra("felicidade", 5);

    System.out.println();
    palavrasMap.exibirContagemPalavras();
    System.out.println();

    System.out.println(palavrasMap.encontrarPalavraMaisFrequente());
    palavrasMap.removerPalavra("bravo");
    palavrasMap.removerPalavra("amigo");
    palavrasMap.exibirContagemPalavras();

  }
}
