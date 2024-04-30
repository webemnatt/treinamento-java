package edu.meu.semana02;

public class AboutMe {
  public static void main(String[] args) {

    if (args.length > 0) {
      String nome = args[0];
      String sobrenome = args[1];
      int idade = Integer.valueOf(args[2]);
      double altura = Double.valueOf(args[3]);
      System.out.format("Olá, meu nome é %s %s, tenho %d anos, %.2f de altura\n",
          nome, sobrenome, idade, altura);
    } else {
      System.out.println("Informe os dados ao rodar o java na pasta bin");
    }

  }

}
