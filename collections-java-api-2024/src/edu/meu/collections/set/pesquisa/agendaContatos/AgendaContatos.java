package edu.meu.collections.set.pesquisa.agendaContatos;

import java.util.HashSet;
import java.util.Set;

/**
 * Esta classe recebe um conjunto de contatos.
 * Tem como único atributo um Set do tipo Contato.
 * Possui os métodos públicos
 * <strong>adicionarContato</strong>, <strong>exibirContatos</strong>,
 * <strong>pesquisarPorNome</strong> e <strong>atualizarNumeroContato</strong>
 */
public class AgendaContatos {
  private Set<Contato> conjuntoContatos;

  public AgendaContatos() {
    conjuntoContatos = new java.util.HashSet<Contato>();
  }

  /**
   * Adiciona um contato à agenda.
   * Se o número já existe, exibe uma mensagem e o contato não é cadastrado.
   * 
   * @param nome   do tipo String
   * @param numero do tipo int
   */
  public void adicionarContato(String nome, int numero) {
    pesquisarPorNumero(numero, "Número já cadastrado");
    conjuntoContatos.add(new Contato(nome, numero));
  }

  /**
   * Método auxiliar privado que pesquisa por um número e retorna o contato
   * 
   * @param numero   do tipo int
   * @param mensagem do tipo String customizado
   */
  private void pesquisarPorNumero(int numero, String mensagem) {
    if (!conjuntoContatos.isEmpty()) {
      for (Contato contato : conjuntoContatos) {
        if (contato.getTelefone() == numero) {
          System.out.println(mensagem + contato);
        }
      }
    }
  }

  /**
   * Exibe todos os contatos da agenda
   */
  public void exibirContatos() {
    System.out.println(conjuntoContatos);
  }

  /**
   * Método que retorna uma lista de contatos que começa com o mesmo nome
   * 
   * @param nome do tipo String
   * @return um conjunto de objetos do tipo Contato
   */
  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosDeMesmoNome = new HashSet<>();
    boolean encontrou = false;
    for (Contato contato : conjuntoContatos) {
      if (contato.getNome().startsWith(nome)) {
        contatosDeMesmoNome.add(contato);
        encontrou = true;
      }
    }
    if (!encontrou) {
      System.out.println("Nenhum contato encontrado");
    }
    return contatosDeMesmoNome;
  }

  /**
   * 
   * Atualiza o número de telefone de um contato específico.
   * O método faz a busca pelo nome e permite atualizar o seu número
   * 
   * @param nome do tipo String
   * @param novoNumero do tipo int
   * @return o contato atualizado.
   */
  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    if (!conjuntoContatos.isEmpty()) {
      for (Contato contato : conjuntoContatos) {
        if (contato.getNome().equalsIgnoreCase(nome)) {
          contato.setTelefone(novoNumero);
          contatoAtualizado = contato;
          break;
        }
      }
    }
    return contatoAtualizado;
  }
}
