package edu.meu.collections.list.atribuicoes;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe possuiu como atributo uma lista de tarefas que recebe como
 * generics uma classe Tarefa, e um construtor vazio
 * que o inicializa.
 * Seus métodos são <strong>adicionarTarefa</strong>,
 * <strong>removerTarefa</strong>, <strong>obterNumeroTotalTarefas</strong> e
 * <strong>obterDescricoesTarefas</strong>
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/16/24
 */

public class ListaDeTarefas {
  // Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como
  // atributo.
  List<Tarefa> listaTarefas;

  /**
   * Construtor sem parâmetros que apenas inicializa a declaração da lista para
   * que possa retornar uma lista vazia caso nenhuma tarefa tenha sido adicionada
   */
  public ListaDeTarefas() {
    this.listaTarefas = new ArrayList<>();
  }

  /**
   * Este método adiciona uma nova tarefa à lista com a descrição fornecida.
   */
  public void adicionarTarefa(String descricao) {
    listaTarefas.add(new Tarefa(descricao));
  }

  /**
   * Este método remove TODAS as tarefas que correspondam à mesma descrição.
   * Para remover, é necessário que a lista não esteja vazia.
   * Se estiver, uma mensagem informa que não há tarefas a serem removidas.
   * 
   * @param descricao espera uma string com a descrição da tarefa
   */
  public void removerTarefa(String descricao) {
    List<Tarefa> listaTarefasRemovidas = new ArrayList<>();
    if (!listaTarefas.isEmpty()) {
      for (Tarefa tarefa : listaTarefas) {
        if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
          listaTarefasRemovidas.add(tarefa);
        }
      }
      listaTarefas.removeAll(listaTarefasRemovidas);
    } else {
      System.out.println("Lista de tarefas vazia. Nenhuma tarefa a remover.");
    }
  }

  /**
   * Este método retorna um int com número total de tarefas na lista.
   */
  public int obterNumeroTotalTarefas() {
    return listaTarefas.size();
  }

  /**
   * Este método exibe a descrição de cada tarefa que há na lista de tarefas.
   * O método faz uma verificação se há tarefas na lista antes de exibir as
   * descrições.
   * Se não há, uma mensagem informa que está vazia.
   */
  public void obterDescricoesTarefas() {
    if (!listaTarefas.isEmpty()) {
      for (Tarefa tarefa : listaTarefas) {
        System.out.println(tarefa.getDescricao());
      }
    } else {
      System.out.println("Lista vazia. Não há descrições a serem exibidas.");
    }
  }

}
