package lanchonete.atendimento;

import lanchonete.area.cliente.Cliente;

public class Atendente {
  public void servirMesa() {
    pegarLancheCozinha();
    System.out.println("Servindo a mesa");
  }

  private void pegarLancheCozinha() {
    System.out.println("pegando lanche da cozinha");
  }
  // comentado porque não está sendo usado.
  // private void pegarPedidoBalcao() {
  // System.out.println("pegando pedido no balcao");
  // }

  public void receberPagamento(Cliente cliente) {
    cliente.pagarConta();
    System.out.println("recebendo pagamento do cliente");
  }

}
