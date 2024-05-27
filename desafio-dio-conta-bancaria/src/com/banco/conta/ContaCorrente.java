package com.banco.conta;

import com.banco.cliente.Cliente;

public class ContaCorrente extends Conta {

  public ContaCorrente(Cliente cliente) {
    super(cliente);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("====Extrato Corrente===");
    super.imprimirInformacoes();
  }

  @Override
  public String toString() {
    return "ContaCorrente [ Titular: " + getTitular().getNome() + ", cpf: " + getTitular().getCPF() + ", Agência: "
        + getAgencia() + ", conta: "
        + getNumero() + ", data de abertura: " + getDataAbertura() + ", data de Encerramento: "
        + (getDataEncerramento() == null ? "" : getDataEncerramento()) + ", Saldo: " + getSaldo() + " ]";
  }

}
