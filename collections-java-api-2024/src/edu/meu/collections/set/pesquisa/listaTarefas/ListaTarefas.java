package edu.meu.collections.set.pesquisa.listaTarefas;

import java.util.HashSet;
import java.util.Set;

/**
 * Esta classe possui um conjunto de objetos do tipo <strong>Tarefa</strong>
 * como atributo.
 * Possui os métodos <strong>adicionarTarefa</strong>,
 * <strong>removerTarefa</strong>, <strong>exibirTarefas</strong>,
 * <strong>contarTarefas</strong>, <strong>obterTarefasConcluidas</strong>,
 * <strong>obterTarefasPendentes</strong>,
 * <strong>marcarTarefaConcluida</strong>,
 * <strong>marcarTarefaPendente</strong> e <strong>limparListaTarefas</strong>
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/18/24
 */
public class ListaTarefas {
  private Set<Tarefa> conjuntoDeTarefas;

  public ListaTarefas() {
    conjuntoDeTarefas = new HashSet<Tarefa>();
  }

  /**
   * Método que adiciona uma nova tarefa ao Set.
   * Se a tarefa já existe no conjunto, exibe uma mensagem e a tarefa não é
   * adicionada.
   * 
   * @param descricao do tipo String
   */
  public void adicionarTarefa(String descricao) {
    if (!conjuntoDeTarefas.isEmpty()) {
      for (Tarefa tarefa : conjuntoDeTarefas) {
        if (tarefa.getDescricao().equals(descricao)) {
          System.out.println("Tarefa já existente");
        }
      }
    }
    conjuntoDeTarefas.add(new Tarefa(descricao));
  }

  /**
   * Método vazio que remove uma tarefa do Set de acordo com a descrição, se
   * estiver presente.
   * A descrição deve ser exata, do contrário, será considerada não encontrada,
   * uma mensagem é exibida.
   * 
   * @param descricao do tipo String
   */
  public void removerTarefa(String descricao) {
    boolean encontrou = false;
    if (!conjuntoDeTarefas.isEmpty()) {
      for (Tarefa tarefa : conjuntoDeTarefas) {
        if (tarefa.getDescricao().equals(descricao)) {
          conjuntoDeTarefas.remove(tarefa);
          encontrou = true;
          break;
        }
      }
      if (!encontrou) {
        System.out.println("Tarefa não encontrada");
      }
    }
  }

  /**
   * Método vazio que exibe todas as tarefas da lista de tarefas
   * Se o conjunto estiver vazio, exibe uma lista vazia.
   */
  public void exibirTarefas() {
    System.out.println(conjuntoDeTarefas);
  }

  /**
   * Método que conta o número total de tarefas na lista de tarefas.
   * 
   * @return um int
   */
  public int contarTarefas() {
    return conjuntoDeTarefas.size();
  }

  /**
   * Método que obtém todas as tarefas concluídas.
   * 
   * @return Retorna um novo Set do tipo Tarefa.
   */
  public Set<Tarefa> obterTarefasConcluidas() {
    Set<Tarefa> tarefasConcluidas = new HashSet<>();
    for (Tarefa tarefa : conjuntoDeTarefas) {
      if (tarefa.isConcluida()) {
        tarefasConcluidas.add(tarefa);
      }
    }
    return tarefasConcluidas;
  }

  /**
   * Método que obtém todas as tarefas pendentes
   * 
   * @return Retorna um novo Set do tipo Tarefa.
   */
  public Set<Tarefa> obterTarefasPendentes() {
    Set<Tarefa> tarefasPendentes = new HashSet<>();
    for (Tarefa tarefa : conjuntoDeTarefas) {
      if (!tarefa.isConcluida()) {
        tarefasPendentes.add(tarefa);
      }
    }
    return tarefasPendentes;
  }

  /**
   * Marca uma tarefa como concluída de acordo com a descrição, apenas de um
   * conjunto com tarefas cadastradas.
   * Uma mensagem será exibida se a tarefa não for encontrada.
   * 
   * @param descricao do tipo String
   */
  public void marcarTarefaConcluida(String descricao) {
    boolean encontrou = false;
    if (!conjuntoDeTarefas.isEmpty()) {
      for (Tarefa tarefa : conjuntoDeTarefas) {
        if (tarefa.getDescricao().equals(descricao)) {
          encontrou = true;
          tarefa.setConcluida(true);
          break;
        }
      }
      if (!encontrou) {
        System.out.println("Tarefa não encontrada");
      }
    }
  }

  /**
   * Marca uma tarefa como pendente de acordo com a descrição num conjunto com
   * tarefas cadastradas.
   * Uma mensagem será exibida se a tarefa não for encontrada.
   * 
   * @param descricao do tipo String
   */
  public void marcarTarefaPendente(String descricao) {
    boolean encontrou = false;
    if (!conjuntoDeTarefas.isEmpty()) {
      for (Tarefa tarefa : conjuntoDeTarefas) {
        if (tarefa.getDescricao().equals(descricao)) {
          encontrou = true;
          tarefa.setConcluida(false);
          break;
        }
      }
      if (!encontrou) {
        System.out.println("Tarefa não encontrada");
      }
    }
  }

  /**
   * Remove todas as tarefas da lista de tarefas.
   */
  public void limparListaTarefas() {
    if (!conjuntoDeTarefas.isEmpty())
      conjuntoDeTarefas.clear();
  }

}
