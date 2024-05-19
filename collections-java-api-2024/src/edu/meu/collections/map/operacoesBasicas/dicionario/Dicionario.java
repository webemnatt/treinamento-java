package edu.meu.collections.map.operacoesBasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe que utiliza um Map para armazenar palavras e suas respectivas
 * definições.
 * Possui os métodos <strong>adicionarPalavra</strong>,
 * <strong>removerPalavra</strong>, <strong>exibirPalavras</strong> e
 * <strong>pesquisarPorPalavra</strong>.
 */
public class Dicionario {
  /**
   * O atributo privado armazena a palavra como chave e a definição como valor.
   */
  private Map<String, String> mapaDePalavras;

  /**
   * Construtor inicializa o atributo privado para prevenir o null ao exibir os
   * pares chave-valors
   */
  public Dicionario() {
    mapaDePalavras = new HashMap<>();
  }

  /**
   * Método que <strong>adiciona</strong> uma nova palavra e sua respectiva
   * definição se a chave não existe, e <strong>atualiza</strong> o valor para
   * chave existente.
   * Chaves diferentes com o mesmo valor serão adicionados ao dicionário.
   * 
   * @param palavra   do tipo String
   * @param definicao do tipo String
   */
  public void adicionarPalavra(String palavra, String definicao) {
    mapaDePalavras.put(palavra, definicao);
  }

  /**
   * Método que remove a chave-valor do Map, dada a chave (palavra) fornecida pelo
   * usuário.
   * Dispensa iteração porque uma vez encontrada a chave, só haverá um par
   * chave-valor.
   * 
   * @param palavra do tipo String
   */
  public void removerPalavra(String palavra) {
    mapaDePalavras.remove(palavra);
  }

  /**
   * Exibe todas as palavras cadastradas no dicionário.
   * Classe String utilizada como chave já possui o método customizado toString(),
   * por isso a coleção é exibida.
   * Se vazia, exibe um <strong>{}</strong>
   */
  public void exibirPalavras() {
    System.out.println(mapaDePalavras);
  }

  /**
   * Método que retorna a definição (valor) da palavra (chave) pesquisada.
   * Retorna valor null se pesquisa palavra (chave) inexistente
   * @param palavra do tipo String
   * @return do tipo String
   */
  public String pesquisarPorPalavra(String palavra) {
    return mapaDePalavras.get(palavra);
  }

  /**
   * Getter do atributo para que possa o atributo ser iterável
   * 
   * @return
   */
  public Map<String, String> getMapaDePalavras() {
    return mapaDePalavras;
  }

}
