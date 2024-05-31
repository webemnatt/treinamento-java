package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.fazerPedido();
        cliente.pagarConta();

        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adicionarComboBalcao();
        cozinheiro.adicionarLancheBalcao();
        cozinheiro.adicionarVitaminaBalcao();

        Atendente atendente = new Atendente();
        atendente.servirMesa();
        atendente.receberPagamento(cliente);

    }
}
