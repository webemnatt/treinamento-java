public class Exemplo {
  public static void main(String[] args) {
    System.out.println("Início do programa no método main");
    try {
      // Simula uma operação que pode lançar uma exceção
      System.out.println("Entrou no try");
      metodoA();
    } catch (Exception e) {
      // Imprime a pilha de chamadas quando uma exceção é lançada
      System.out.println("Exceção capturada no catch:");
      e.printStackTrace();

      // Também podemos chamar diretamente o método dumpStack() aqui
      Thread.dumpStack();
    System.out.println("Fim do catch");

    }
    System.out.println("Fim do programa no método main");

  }

  public static void metodoA() {
    // Simula uma chamada de método que lança uma exceção
    System.out.println("Entrou no métodoA");
    metodoB();
    System.out.println("Finalizou o métodoA");
  }

  public static void metodoB() {
    // Simula uma operação que lança uma exceção
    System.out.println("Entrou o métodoB");
    throw new RuntimeException("Exceção de exemplo em metodoB()");

  }
}
