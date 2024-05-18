package edu.meu.collections.set.ordenacao.Alunos;

/**
 * Esta classe cria um Aluno com atributos privados nome, matricula e nota.
 * Não permite a duplicação de aluno de mesma matrícula.
 * Implementa interface Comparable que compara Aluno com Aluno e sobrescreve o
 * método <strong>compareTo</strong> comparando por nome do aluno.
 */

public class Aluno implements Comparable<Aluno> {
  // nome, matrícula e nota
  private String nome;
  private long matricula;
  private double nota;

  public Aluno(String nome, long matricula, double nota) {
    this.nome = nome;
    this.matricula = matricula;
    this.nota = nota;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (matricula ^ (matricula >>> 32));
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
    Aluno other = (Aluno) obj;
    if (matricula != other.matricula)
      return false;
    return true;
  }

  @Override
  public int compareTo(Aluno aluno) {
    return this.nome.compareToIgnoreCase(aluno.getNome());
  }

  
  @Override
  public String toString() {
    return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
  }

  public String getNome() {
    return nome;
  }

  public long getMatricula() {
    return matricula;
  }

  public double getNota() {
    return nota;
  }
 
}
