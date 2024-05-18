package edu.meu.collections.set.hashSet.pesquisa.agendaContatos;

/**
 * Cada contato possui atributos como nome e número de telefone.
 * Contato com o <strong>número já existente</strong> não será cadastrado.
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/18/24
 */
public class Contato {
  private String nome;
  private int telefone;

  public Contato(String nome, int telefone) {
    this.nome = nome;
    this.telefone = telefone;
  }

  public String getNome() {
    return nome;
  }

  public int getTelefone() {
    return telefone;
  }

  public void setTelefone(int telefone) {
    this.telefone = telefone;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + telefone;
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
    Contato other = (Contato) obj;
    if (telefone != other.telefone)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Contato [nome=" + nome + ", telefone=" + telefone + "]";
  }

}
