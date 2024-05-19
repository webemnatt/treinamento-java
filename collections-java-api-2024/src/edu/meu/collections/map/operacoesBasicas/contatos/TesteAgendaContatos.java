package edu.meu.collections.map.operacoesBasicas.contatos;

public class TesteAgendaContatos {
  public static void main(String[] args) {
    AgendaContatos agenda = new AgendaContatos();
    agenda.pesquisarPorNome("null");
    agenda.removerContato("null");
    agenda.exibirContatos();

    System.out.println("========adicionando contatos=============");
    agenda.adicionarContato("João", 123456789);
    agenda.adicionarContato("Maria", 987654321);
    agenda.adicionarContato("José", 321654987);

    System.out.println("==========exibindo contatos==============");
    agenda.exibirContatos();

    System.out.println("=====pesquisando por nome inexistente=====");
    agenda.pesquisarPorNome("null");
    System.out.println("=======pesquisando por nome existente========");
    agenda.pesquisarPorNome("Maria");

    System.out.println("========removendo contato inexistente=============");
    agenda.removerContato("null");
    System.out.println("========removendo contato existente=============");
    agenda.removerContato("José");

    System.out.println("==========exibindo contatos==============");
    agenda.exibirContatos();

    System.out.println("========adicionando contatos com telefone repetido=============");
    agenda.adicionarContato("Cristiane", 123456789);

    System.out.println("==========exibindo contatos==============");
    agenda.exibirContatos();
    //permitiu cadastrar telefone repetido

    System.out.println("========adicionando contatos com nome repetido=============");
    agenda.adicionarContato("João", 198456789);

    System.out.println("==========exibindo contatos==============");
    agenda.exibirContatos();
    //substituiu valor da chave "João", ou seja, atualizou o telefone de João

  }
}
