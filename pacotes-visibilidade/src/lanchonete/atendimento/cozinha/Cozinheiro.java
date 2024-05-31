package lanchonete.atendimento.cozinha;

public class Cozinheiro {
  void pedirParaTrocarOGas(Almoxarife amigo) {
    amigo.trocarGas();
  }

  void pedirIngredientes(Almoxarife amigo) {
    amigo.entregarIngredientes();
  }

  private void lavarIngredientes() {
    System.out.println("Lavando os ingredientes");
  }

  private void selecionarIngredientesVitamina() {
    System.out.println("selecioando ingredientes pra vitamina");
  }

  private void baterVitaminaLiquidificador() {
    System.out.println("Batendo vitamina no liquidificador");
  }

  private void prepararVitamina() {
    lavarIngredientes();
    selecionarIngredientesVitamina();
    baterVitaminaLiquidificador();
  }

  private void prepararLanche() {
    System.out.println("Preparando lanche");
  }

  private void prepararCombo() {
    prepararLanche();
    prepararVitamina();
  }

  public void adicionarVitaminaBalcao() {
    prepararVitamina();
  }

  public void adicionarLancheBalcao() {
    prepararLanche();
  }

  public void adicionarComboBalcao() {
    prepararCombo();
  }

}
