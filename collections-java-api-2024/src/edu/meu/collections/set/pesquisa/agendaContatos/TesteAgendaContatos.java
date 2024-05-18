package edu.meu.collections.set.pesquisa.agendaContatos;

import java.util.Set;

public class TesteAgendaContatos {
  public static void main(String[] args) {
    AgendaContatos agenda = new AgendaContatos();
    agenda.exibirContatos();

    System.out.println("----------adicionando contatos com números diferentes-----------");
    agenda.adicionarContato("Maria", 12345);
    agenda.adicionarContato("João", 12350);
    agenda.adicionarContato("João da padaria", 18450);
    agenda.adicionarContato("João do posto", 17460);

    System.out.println("----------Exibindo contatos-----------");
    agenda.exibirContatos();

    System.out.println("----------adicionando mesmo número-----------");
    agenda.adicionarContato("Paulo", 12345);

    System.out.println("----------pesquisando contatos por nome-----------");
    Set<Contato> contatosComMesmoNome = agenda.pesquisarPorNome("João");
    for (Contato contato : contatosComMesmoNome)
      System.out.println(contato);

    System.out.println("----------Atualizando por numero-----------");
    Contato contatoAtualizado = agenda.atualizarNumeroContato("João", 11111);
    System.out.println("Contato atualizado: " + contatoAtualizado);
    agenda.exibirContatos();

  }
}
