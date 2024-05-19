package edu.meu.collections.map.operacoesBasicas.contatos;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe que cria uma agenda de contatos
 * Tem os métodos <strong>adicionarContato</strong>,
 * <strong>removerContato</strong>, <strong>exibirContatos</strong> e
 * <strong>pesquisarPorNome</strong>.
 */
public class AgendaContatos {
  /**
   * Atributo privado do tipo Map com chave do tipo String e valor do tipo integer
   * A chave será o nome e o valor será o telefone.
   */
  private Map<String, Integer> mapaContatos;

  /**
   * Construtor que declara o atributo como HashMap
   */
  public AgendaContatos() {
    mapaContatos = new HashMap<>();
  }

  /**
   * Adiciona novo contato E atualiza contato existente à agenda, associando o
   * nome do contato ao
   * número de telefone correspondente.
   * Se nome repetido, terá seu valor (telefone) atualizado.
   * 
   * @param nome     do tipo String
   * @param telefone do tipo Integer
   */
  public void adicionarContato(String nome, Integer telefone) {
    mapaContatos.put(nome, telefone);
  }

  /**
   * Remove um contato da agenda, dado o nome do contato.
   * Não foi preciso iterar porque a pesquisa é pela chave.
   * Quando encontra a chave, só tem esse elemento.
   * 
   * @param nome do tipo String
   */
  public void removerContato(String nome) {
    if (!mapaContatos.isEmpty()) {
      mapaContatos.remove(nome);
    }
  }

  /**
   * Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de
   * cada contato.
   */
  public void exibirContatos() {
    System.out.println(mapaContatos);
  }

  /**
   * Pesquisa um contato pelo nome (chave) e retorna o número de telefone (valor) correspondente.
   */
  public Integer pesquisarPorNome(String nome) {
    Integer numeroTelefone = 0;
    if (!mapaContatos.isEmpty()) {
      numeroTelefone = mapaContatos.get(nome);
    }
    return numeroTelefone;

  }

}
