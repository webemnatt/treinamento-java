package edu.meu.collections.atribuicoes;

public class TesteListaTarefas {
  public static void main(String[] args) {
    ListaDeTarefas lista = new ListaDeTarefas();

    lista.obterDescricoesTarefas();

    lista.adicionarTarefa("Estudar Java");
    lista.adicionarTarefa("Estudar C#");
    lista.adicionarTarefa("Estudar Python");
    lista.adicionarTarefa("Estudar JavaScript");
    lista.adicionarTarefa("Estudar Python");
    lista.adicionarTarefa("Estudar Python");

    lista.obterDescricoesTarefas();
    int quantidadeTarefas = lista.obterNumeroTotalTarefas();
    System.out.println("Agora você tem " + quantidadeTarefas + " tarefas por fazer.");

    lista.removerTarefa("Estudar Python");
    lista.obterDescricoesTarefas();

  }
}
