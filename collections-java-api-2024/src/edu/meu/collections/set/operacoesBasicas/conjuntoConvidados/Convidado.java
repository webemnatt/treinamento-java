package edu.meu.collections.set.operacoesBasicas.conjuntoConvidados;

/**
 * Classe para criar convidados.
 * Tem como atributos <strong>nome</strong> e <strong>codigoConvite</strong>.
 * Tem um construtor com parâmetros e getters dos atributos.
 * <br>
 * <br>
 * Esta classe implementa o método sobrescrito <strong>hashCode</strong> e
 * <strong>equals</strong> com base no <strong>código do convite</strong>,
 * fazendo com que o código ignore objeto com convite duplicado.
 * Possui também o método sobrescrito <strong>toString</strong> para exibir o
 * objeto, seus atributos e respectivos valores.
 *
 * @author webemnatt
 * @version 1.0.0
 * @since 05/17/24
 */
public class Convidado {
  /**
   * Atributo do tipo String que pode se repetir
   */
  private String nome;
  /**
   * Atributo do tipo int que funciona como uma chave primária no banco de dados
   * porque deve ser único no conjunto
   */
  private int codigoConvite;

  public Convidado(String nome, int codigoConvite) {
    this.nome = nome;
    this.codigoConvite = codigoConvite;
  }

  public String getNome() {
    return nome;
  }

  public int getCodigoConvite() {
    return codigoConvite;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + codigoConvite;
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
    Convidado other = (Convidado) obj;
    if (codigoConvite != other.codigoConvite)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
  }

}
