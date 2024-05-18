package edu.meu.collections.set.hashSet.pesquisa.listaTarefas;

import java.util.Set;

public class TesteListaTarefas {
  public static void main(String[] args) {
    ListaTarefas listaTarefas = new ListaTarefas();

    listaTarefas.exibirTarefas();
    listaTarefas.marcarTarefaConcluida("null");
    listaTarefas.marcarTarefaPendente("null");
    listaTarefas.obterTarefasConcluidas();
    listaTarefas.obterTarefasPendentes();
    listaTarefas.limparListaTarefas();

    System.out.println("---------Contando tarefas----------");
    System.out.println("Total de tarefas cadastradas: " + listaTarefas.contarTarefas());

    System.out.println("---------adicionando tarefas----------");
    listaTarefas.adicionarTarefa("Estudar Java");
    listaTarefas.adicionarTarefa("Estudar C#");
    listaTarefas.adicionarTarefa("Estudar Python");
    listaTarefas.adicionarTarefa("Estudar JavaScript");
    listaTarefas.adicionarTarefa("Estudar PHP");
    listaTarefas.adicionarTarefa("Estudar Ruby");

    System.out.println("---------adicionando tarefa repetida----------");
    listaTarefas.adicionarTarefa("Estudar Python");

    System.out.println("---------Exibindo todas as tarefas----------");
    listaTarefas.exibirTarefas();

    System.out.println("---------Contando tarefas----------");
    System.out.println("Total de tarefas cadastradas: " + listaTarefas.contarTarefas());

    System.out.println("---------Obter tarefas pendentes----------");
    Set<Tarefa> tarefasPendentes = listaTarefas.obterTarefasPendentes();
    for (Tarefa tarefa : tarefasPendentes)
      System.out.println(tarefa);

    System.out.println("---------Obter tarefas Concluídas----------");
    System.out.println("Total tarefas concluídas: " + listaTarefas.obterTarefasConcluidas().size());

    System.out.println("---------Marcar uma tarefa inexistente como concluída----------");
    listaTarefas.marcarTarefaConcluida("null");

    System.out.println("---------Marcar uma tarefa existente como concluída----------");
    listaTarefas.marcarTarefaConcluida("Estudar Java");

    System.out.println("---------Marcar uma tarefa concluída como concluída----------");
    listaTarefas.marcarTarefaConcluida("Estudar Java");

    System.out.println("---------Obter tarefas Concluídas----------");
    System.out.println("Total tarefas concluídas: " + listaTarefas.obterTarefasConcluidas().size());

    System.out.println("---------Obter tarefas Pendentes----------");
    System.out.println("Total tarefas pendentes: " + listaTarefas.obterTarefasPendentes().size());

    System.out.println("---------Marcar uma tarefa inexistente como pendente----------");
    listaTarefas.marcarTarefaPendente("null");

    System.out.println("---------Marcar uma tarefa existente como pendente----------");
    listaTarefas.marcarTarefaPendente("Estudar Java");

    System.out.println("---------Marcar uma tarefa pendente como pendente----------");
    listaTarefas.marcarTarefaPendente("Estudar Java");

    System.out.println("---------Obter tarefas pendentes----------");
    System.out.println("Total tarefas pendentes: " + listaTarefas.obterTarefasPendentes().size());

    System.out.println("---------Contando tarefas----------");
    System.out.println("Total de tarefas cadastradas: " + listaTarefas.contarTarefas());

    System.out.println("---------limpar lista de tarefas----------");
    listaTarefas.limparListaTarefas();

    System.out.println("---------Contando tarefas----------");
    System.out.println("Total de tarefas cadastradas: " + listaTarefas.contarTarefas());
  }
}
