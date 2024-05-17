package edu.meu.collections.list.ordenacao;

/**
 * Esta classe implementa a interface Comparable e recebe como generics a
 * própria classe Pessoa.
 * O método da interface <strong>compareTo</strong> é sobrescrita, comparando
 * Pessoas <strong>por idade</strong> - em ordem crescente.
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/16/24
 */
public class Pessoa implements Comparable<Pessoa> {
  private String nome;
  private int idade;
  private double altura;

  public Pessoa(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  @Override
  public int compareTo(Pessoa outraPessoa) {
    return Integer.compare(idade, outraPessoa.getIdade());
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public double getAltura() {
    return altura;
  }


  @Override
  public String toString() {
    return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
  }
}
