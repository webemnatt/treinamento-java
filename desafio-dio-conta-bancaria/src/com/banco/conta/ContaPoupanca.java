package com.banco.conta;

import com.banco.cliente.Cliente;

public class ContaPoupanca extends Conta {

  public ContaPoupanca(Cliente cliente) {
    super(cliente);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("====Extrato Poupança===");
    super.imprimirInformacoes();

  }

  @Override
  public String toString() {
    return "ContaPoupança [ Titular: " + getTitular().getNome() + ", cpf: " + getTitular().getCPF() + ", Agência: "
        + getAgencia() + ", conta: "
        + getNumero() + ", data de abertura: " + getDataAbertura() + ", data de Encerramento: "
        + (getDataEncerramento() == null ? "" : getDataEncerramento()) + ", Saldo: " + getSaldo() + " ]";

  }

}
