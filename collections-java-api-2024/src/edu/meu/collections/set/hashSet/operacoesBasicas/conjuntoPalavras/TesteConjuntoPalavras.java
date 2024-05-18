package edu.meu.collections.set.hashSet.operacoesBasicas.conjuntoPalavras;

public class TesteConjuntoPalavras {
  public static void main(String[] args) {
    ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

    conjunto.exibirPalavrasUnicas();
    conjunto.verificarPalavra("null");
    conjunto.removerPalavra("null");

    System.out.println("------adicionando palavras-------");
    conjunto.adicionarPalavra("abacate");
    conjunto.adicionarPalavra("abobora");
    conjunto.adicionarPalavra("abacaxi");
    conjunto.adicionarPalavra("ameixa");

    System.out.println("------adicionando palavras repetidas-------");
    conjunto.adicionarPalavra("null");
    conjunto.adicionarPalavra("null");

    System.out.println("------removendo palavra inexiste-------");
    conjunto.removerPalavra("berinjela");

    System.out.println("------removendo palavra existe-------");
    conjunto.removerPalavra("abacaxi");

  }
}
