package edu.meu.collections.set.ordenacao.Alunos;

import java.util.Comparator;

/**
 * Classe auxiliar que implementa Comparator e compara objetos do tipo Aluno.
 * A classe implementa o método <strong>compare</strong> e ordena por nota
 */
public class NotasPorOrdemCrescente implements Comparator<Aluno> {

  @Override
  public int compare(Aluno aluno1, Aluno aluno2) {
    if (aluno1.getNota() < aluno2.getNota()) {
      return -1;
    } else if (aluno1.getNota() > aluno2.getNota()) {
      return 1;
    } else {
      return 0;
    }
  }

}
