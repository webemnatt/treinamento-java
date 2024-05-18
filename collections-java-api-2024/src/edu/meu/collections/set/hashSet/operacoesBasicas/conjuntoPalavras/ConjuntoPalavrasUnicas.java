package edu.meu.collections.set.hashSet.operacoesBasicas.conjuntoPalavras;

import java.util.Set;

/**
 * Classe que cria um conjunto de palavras únicas.
 * Tem como único atributo privado um Set com generics do tipo String.
 * Possui métodos <strong>adicionarPalavra</strong>,
 * <strong>removerPalavra</strong>,
 * <strong>verificarPalavra</strong>,
 * <strong>exibirPalavrasUnicas</strong>.
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/17/24
 */
public class ConjuntoPalavrasUnicas {
  Set<String> palavrasUnicasSet;

  public ConjuntoPalavrasUnicas() {
    palavrasUnicasSet = new java.util.HashSet<String>();
  }

  /**
   * Método void que adiciona uma palavra ao conjunto.
   * Caso a palavra já existe, nada faz.
   * Caso seja uma palavra nova, ela é adicionada ao conjunto.
   * Exibe mensagem quando consegue adicionar ou não uma palavra.
   * 
   * @param palavra do tipo String
   */
  public void adicionarPalavra(String palavra) {
    boolean existe = verificarPalavra(palavra);
    if (existe) {
      for (String cadaPalavra : palavrasUnicasSet) {
        if (cadaPalavra.equals(palavra)) {
          System.out.println("Palavra não adicionada: " + palavra);
          return;
        }
      }
    } else {
      palavrasUnicasSet.add(palavra);
      System.out.printf("Palavra '%s' adicionada com sucesso.\n", palavra);
    }
  }

  /**
   * 
   * Método vazio que remove uma palavra do conjunto com base no input do usuário.
   * Se o conjunto está vazio, exibe mensagem.
   * Se a palavra é encontra ou não, exibe uma mensagem.
   * 
   * @param palavra do tipo String
   */
  public void removerPalavra(String palavra) {
    boolean encontrou = verificarPalavra(palavra);
    if (!palavrasUnicasSet.isEmpty()) {
      if (encontrou) {
        for (String cadaPalavra : palavrasUnicasSet) {
          if (cadaPalavra.equals(palavra)) {
            palavrasUnicasSet.remove(palavra);
            System.out.printf("Palavra '%s' removida com sucesso.\n", palavra);
            break;
          }
        }
      } else {
        System.out.println("Não foi possível remover palavra: " + palavra);
      }
    } else {
      System.out.println("Conjunto de palavras únicas vazio");
    }
  }

  /**
   * Verifica se uma palavra está presente no conjunto com base no input fornecido
   * pelo usuário.
   * Exibe a mensagem quando encontra e quando não encontra palavra.
   * 
   * @param palavra do tipo string
   * @return um boolean
   */
  public boolean verificarPalavra(String palavra) {
    boolean encontrou = false;
    if (!palavrasUnicasSet.isEmpty()) {
      for (String cadaPalavra : palavrasUnicasSet) {
        if (cadaPalavra.equals(palavra)) {
          encontrou = true;
          System.out.println("Palavra encontrada: " + palavra);
          break;
        }
      }
    }
    if (!encontrou) {
      System.out.println("Palavra inexistente: " + palavra);
    }
    return encontrou;
  }

  /**
   * Método void que exibe todas as palavras únicas do conjunto.
   * Exibe mensagem quando o conjunto está vazio.
   */
  public void exibirPalavrasUnicas() {
    if (!palavrasUnicasSet.isEmpty()) {
      System.out.println(palavrasUnicasSet);
    } else {
      System.out.println("Conjunto de palavras únicas vazio.");
    }
  }
}
