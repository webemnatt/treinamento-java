package edu.meu.collections.set.hashSet.pesquisa.listaTarefas;

/**
 * Cada tarefa possui um atributo de descrição e um atributo booleano para
 * indicar se a tarefa foi concluída ou não.
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/18/24
 */
public class Tarefa {
  private String descricao;
  private boolean concluida;

  public Tarefa(String descricao) {
    this.descricao = descricao;
    this.concluida = false;
  }

  public String getDescricao() {
    return descricao;
  }

  public boolean isConcluida() {
    return concluida;
  }

  public void setConcluida(boolean concluida) {
    this.concluida = concluida;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Tarefa other = (Tarefa) obj;
    if (descricao == null) {
      if (other.descricao != null)
        return false;
    } else if (!descricao.equals(other.descricao))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Tarefa [descricao=" + descricao + ", concluida=" + concluida + "]";
  }

}
