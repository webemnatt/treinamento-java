package edu.meu.collections.set.treeSet.ordenacao.alunos;

public class TesteAdicionarAluno {
  public static void main(String[] args) {
    GerenciadorAlunos alunosMatriculados = new GerenciadorAlunos();
    alunosMatriculados.exibirAlunosPorNome();
    alunosMatriculados.exibirAlunosPorNota();

    System.out.println("-------Adicionando novos alunos---------------");
    alunosMatriculados.adicionarAluno("João", 1234L, 8.0);
    alunosMatriculados.adicionarAluno("Maria", 1235L, 9.0);
    alunosMatriculados.adicionarAluno("Pedro", 1236L, 7.0);
    alunosMatriculados.adicionarAluno("Joana", 1237L, 6.0);
    alunosMatriculados.adicionarAluno("José", 1238L, 5.0);
    alunosMatriculados.adicionarAluno("Ana", 1239L, 4.0);
    alunosMatriculados.adicionarAluno("Carlos", 1240L, 3.0);

    System.out.println("-------Adicionando alunos com mesma matrícula---------------");
    alunosMatriculados.adicionarAluno("Pedro da Silva", 1236L, 7.0);

    System.out.println("-------Ordenando alunos por ordem alfabética---------------");
    alunosMatriculados.exibirAlunosPorNome();

    System.out.println("-------Ordenando alunos por ordem crescente de nota---------------");
    alunosMatriculados.exibirAlunosPorNota();

    System.out.println("-------Removendo aluno de matrícula inexistente---------------");
    alunosMatriculados.removerAluno(0);

    System.out.println("-------Removendo aluno de matrícula existente---------------");
    alunosMatriculados.removerAluno(1236L);

    System.out.println("-------Removendo mais de uma vez a mesma matrícula---------------");
    alunosMatriculados.removerAluno(1236L);

  }
}
