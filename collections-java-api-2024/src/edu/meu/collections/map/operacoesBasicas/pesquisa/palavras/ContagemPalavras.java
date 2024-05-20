package edu.meu.collections.map.operacoesBasicas.pesquisa.palavras;

import java.util.*;

/**
 * Map para armazenar as palavras e a <strong>quantidade de vezes</strong> que
 * cada palavra aparece em um texto.
 * Possui os métodos:
 * <strong>adicionarPalavra</strong>,
 * <strong>removerPalavra</strong>,
 * <strong>exibirContagemPalavras</strong> e
 * <strong>encontrarPalavraMaisFrequente</strong>.
 */
public class ContagemPalavras {
  Map<String, Integer> palavras;

  public ContagemPalavras() {
    palavras = new java.util.HashMap<>();
  }

  /**
   * Adiciona uma palavra à contagem.
   * Se a chave (palavra) já existe, pega a contagem atual e soma ele com a
   * contagem atual.
   * Senão, adiciona elemento com a palavra e a contagem.
   * A tentativa de adicionar chave já existente de valores diferentes fará com
   * que atualize o seu valor.
   * 
   * @param palavra  do tipo String
   * @param contagem do tipo Integer
   */
  public void adicionarPalavra(String palavra, Integer contagem) {
    palavras.put(palavra, contagem);
  }

  /**
   * Remove uma palavra da contagem, se estiver presente.
   * 
   * @param palavra do tipo String
   */
  public void removerPalavra(String palavraARemover) {
    boolean achou = false;
    if (!palavras.isEmpty()) {
      if (palavras.containsKey(palavraARemover)) {
        palavras.remove(palavraARemover);
        achou = true;
      }
      // for (Map.Entry<String, Integer> entrada : palavras.entrySet()) {
      // if (entrada.getKey().equals(palavraARemover)) {
      // palavras.remove(palavraARemover);
      // achou = true;
      // }
      // }
    }
    if (!achou) {
      System.out.println("Palavra não encontrada: " + palavraARemover);
    }
  }

  public void exibirContagemPalavras() {
    System.out.println(palavras);
  }

  /**
   * Método que varre pela coleção de palavras e retorna <strong>a
   * palavra</strong> com maior contagem (valor)
   * 
   * @return
   */
  public Map.Entry<String, Integer> encontrarPalavraMaisFrequente() {
    Map.Entry<String, Integer> palavraMaisFrequente = null;

    if (!palavras.isEmpty()) {
      for (Map.Entry<String, Integer> entrada : palavras.entrySet()) {
        if (palavraMaisFrequente == null || entrada.getValue() > palavraMaisFrequente.getValue()) {
          palavraMaisFrequente = entrada;
        }
      }
    }
    return palavraMaisFrequente;
  }

}
