package mensageiro.reutilizacao;

public class Veiculo {
  public void ligar() {
    checarCombustivel();
    checarCambio();
    System.out.println("Veículo ligado.");
  }

  private void checarCombustivel() {
    System.out.println("Combustível checado");
  }

  private void checarCambio() {
    System.out.println("Câmbio checado");
  }
}
