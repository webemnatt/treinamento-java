package mensageiro.umaMaeVariosFilhos;

import java.util.Scanner;

public class Usuario {
  public static void main(String[] args) {
    Quadrilatero quadrilatero = null;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o tipo de quadrilátero: ");
    System.out.println("Menu");
    System.out.println("1 - Quadrado\t2 - Losango\t3 - Trapezio");
    int opcao = scanner.nextInt();
    switch (opcao) {
      case 1:
        System.out.println("Digite o lado do quadrado:");
        double lado = scanner.nextDouble();
        quadrilatero = new Quadrado(lado);
        break;
      case 2:
        System.out.println("Digite a base do losango:");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do losango:");
        double altura = scanner.nextDouble();
        quadrilatero = new Losango(base, altura);
        break;
      case 3:
        System.out.println("Digite a altura do trapézio:");
        double alturaTrapezio = scanner.nextDouble();
        System.out.println("Digite a base maior do trapézio:");
        double baseMaior = scanner.nextDouble();
        System.out.println("Digite a base menor do trapézio:");
        double baseMenor = scanner.nextDouble();
        quadrilatero = new Trapezio(alturaTrapezio, baseMaior, baseMenor);
        break;
    }
    scanner.close();

    double area = quadrilatero.calcularArea();
    System.out.printf("A área do quadrilátero é igual a: %.2f\n", area);
  }
}
