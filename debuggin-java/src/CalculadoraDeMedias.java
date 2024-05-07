import java.util.Scanner;

public class CalculadoraDeMedias {
  public static void main(String[] args) {
    String alunos[] = { "Marcia", "Alice", "Fernanda", "Eduardo"};
    Scanner scanner = new Scanner(System.in);

    double mediaDaTurma = calculaMediaTurma(alunos, scanner);
    System.out.printf("A média desta turma foi: %.1f\n", mediaDaTurma);
  }

  public static double calculaMediaTurma(String alunos[], Scanner scanner) {
    double soma = 0;
    for (String aluno : alunos) {
      System.out.printf("Nota do aluno %s:\t", aluno);
      double nota = scanner.nextDouble();
      soma += nota;
    }
    double mediaturma = soma / alunos.length;
    return mediaturma;
  }

}
