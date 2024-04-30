import java.util.Locale;
import java.util.Scanner;

public class AboutAnyone {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Digite o nome:\t");
    String nome = scanner.next();

    System.out.print("Digite o sobrenome:\t");
    String sobrenome = scanner.next();

    System.out.print("Digite a altura:\t");
    double altura = scanner.nextDouble();

    System.out.print("Digite a idade:\t");
    int idade = scanner.nextInt();

    System.out.format("O nome da pessoa é %s %s, tem %d anos e %.2f de altura.\n",
        nome, sobrenome, idade, altura);
  }
}
