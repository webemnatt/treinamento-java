package lanchonete.area.cliente;

public class Cliente {
  private void escolherLanche() {
    System.out.println("Escolhendo no menu o lanche");
  }

  private void escolherBebida() {
    System.out.println("Escolhendo no menu a bebida");
  }

  public void fazerPedido() {
    escolherLanche();
    escolherBebida();
    System.out.println("Chamando o atendente para fazer o pedido");
  }

  public void pagarConta() {
    consultarSaldoApp();
    System.out.println("Pagando o atendente");
  }

  private void consultarSaldoApp() {
    System.out.println("Consultando saldo no app do banco.");
  }

  // estabelecimento tem Atendente para isso.
  // public void pegarPedidoBalcao() {
  // System.out.println();
  // }

}
