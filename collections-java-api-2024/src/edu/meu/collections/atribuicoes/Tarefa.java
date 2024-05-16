package edu.meu.collections.atribuicoes;

/**
 * A classe Tarefa possui apenas um atributo chamado <strong>descricao</strong>
 * do tipo String.
 * Possui um construtor, getters e setters e sobrescreve o método toString()
 * para que exiba a tarefa com sua respectiva descrição
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/16/24
 */
public class Tarefa {
  /**
   * Atributo privado do tipo String
   */
  private String descricao;

  /**
   * Construtor da classe que atribuiu o valor do parâmetro ao seu atributo privado
   * @param descricao
   */
  public Tarefa(String descricao) {
    this.descricao = descricao;
  }

  /**
   * busca o valor armazenado no atributo privado
   * @return a String armazenada no atributo privado
   */
  public String getDescricao() {
    return descricao;
  }

  /**
   * Declara ou redefine o valor do atributo privado
   * @param descricao
   */
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  /**
   * Método sobrescrito para exibir o conteúdo de cada objeto desta classe
   */
  @Override
  public String toString() {
    return "Tarefa [descricao=" + descricao + "]";
  }

}
