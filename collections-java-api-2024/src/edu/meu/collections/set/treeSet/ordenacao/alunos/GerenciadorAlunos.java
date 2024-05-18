package edu.meu.collections.set.treeSet.ordenacao.alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Classe responsável por gerenciar um conjunto de alunos.
 * Possui os métodos <strong>adicionarAluno</strong>, <strong>removerAluno</strong>,
 * <strong>exibirAlunosPorNome</strong>, e <strong>exibirAlunosPorNota</strong>,
 * <strong>exibirAlunos</strong>
 * 
 */
public class GerenciadorAlunos {
  /**
   * Atributo privado do tipo Set com generics do tipo Aluno
   */
  Set<Aluno> conjuntoAlunos;

  /**
   * Construtor sem parâmetros que inicializa o Set de alunos como HashSet
   */
  public GerenciadorAlunos() {
    conjuntoAlunos = new HashSet<>();
  }

  /**
   * Adiciona um aluno ao conjunto.
   * 
   * @param nome      do tipo String
   * @param matricula do tipo Long
   * @param media     do tipo double
   */
  public void adicionarAluno(String nome, Long matricula, double media) {
    if (!conjuntoAlunos.isEmpty()) {
      for (Aluno aluno : conjuntoAlunos) {
        if (aluno.getMatricula() == matricula) {
          System.out.println("Matrícula já existente.");
        }
      }
    }
    conjuntoAlunos.add(new Aluno(nome, matricula, media));
  }

  /**
   * Remove um aluno ao conjunto a partir da matricula, se estiver presente.
   * Exibe mensagem se o conjunto estiver vazio ou se não encontrar a matrícula
   * que deseja remover.
   * 
   * @param matricula do tipo long
   */
  public void removerAluno(long matricula) {
    boolean encontrou = false;
    if (conjuntoAlunos.isEmpty()) {
      System.out.println("Conjunto de alunos vazio.");
    }

    for (Aluno aluno : conjuntoAlunos) {
      if (aluno.getMatricula() == matricula) {
        conjuntoAlunos.remove(aluno);
        encontrou = true;
        break;
      }
    }
    if (!encontrou) {
      System.out.printf("Matrícula %d não encontrado.\n", matricula);
    }
  }

  /**
   * Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
   * Inicializa um tipo TreeSet e recebe como parâmetro o atributo desta classe.
   * 
   * @return um novo Set<Aluno>
   */
  public void exibirAlunosPorNome() {
    Set<Aluno> alunosPorOrdemAlfabetica = new TreeSet<>(conjuntoAlunos);
    System.out.println(alunosPorOrdemAlfabetica);
  }

  /**
   * Exibe todos os alunos do conjunto em ordem crescente de nota.
   * Inicializa um tipo TreeSet e recebe como parâmetro a criação de um novo
   * objeto da classe NotasPorOrdemCrescente.
   * Somente então pede-se para ordenar o conjunto atributo desta classe
   * 
   * @return um novo Set<Aluno>
   */
  public void exibirAlunosPorNota() {
    Set<Aluno> alunosPorOrdemCrescenteDeNota = new TreeSet<>(new NotasPorOrdemCrescente());
    alunosPorOrdemCrescenteDeNota.addAll(conjuntoAlunos);
    System.out.println(alunosPorOrdemCrescenteDeNota);
  }

}
