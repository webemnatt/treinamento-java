package com.banco.conta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Banco {
  private String nome = "Banco Digital";
  private List<Conta> contas;
  private List<Conta> contasEncerradas;

  public Banco() {
    this.contas = new ArrayList<>();
    this.contasEncerradas = new ArrayList<>();
  }

  public void abrirConta(Conta conta) {
    this.contas.add(conta);
    conta.setDataAbertura(LocalDate.now());
  }

  public List<Conta> pesquisarPorCpf(String cpf) {
    return this.contas.stream()
        .filter(conta -> conta.getTitular().getCPF().equals(cpf))
        .toList();
  }

  public void encerrarConta(int numeroConta) {
    Conta conta = pesquisarContaPorNumero(numeroConta);
    if (conta == null) {
      System.out.println("Conta não encontrada.");
      return;
    }

    if (conta.getSaldo() != 0) {
      System.out.println("Não é possível encerrar a conta, saldo em conta maior que zero.");
      return;
    }

    conta.setDataEncerramento(LocalDate.now());
    this.contasEncerradas.add(conta);
    this.contas.remove(conta);

  }

  private Conta pesquisarContaPorNumero(int numeroConta) {
    Conta conta = this.contas.stream()
        .filter(c -> c.getNumero() == numeroConta)
        .findFirst()
        .orElse(null);
    return conta;
  }

  public double consultarSaldoTesouraria() {
    double saldoTotalBanco = 0;
    if (!contas.isEmpty()) {
      for (Conta conta : contas) {
        saldoTotalBanco += conta.getSaldo();
      }
    }
    return saldoTotalBanco;
  }

  public int consultarTotalContasAbertas() {
    return this.contas.size();
  }

  public int consultarTotalContasEncerradas() {
    return this.contasEncerradas.size();
  }

  public List<Conta> listarContasEncerradas() {
    return this.contasEncerradas;
  }

  public int obterTotalContasCorrente() {
    int totalContasCorrente = 0;
    for (Conta conta : contas) {
      if (conta instanceof ContaCorrente) {
        totalContasCorrente++;
      }
    }
    return totalContasCorrente;
  }

  public int obterTotalContasPoupanca() {
    int totalContasPoupanca = 0;
    for (Conta conta : contas) {
      if (conta instanceof ContaPoupanca) {
        totalContasPoupanca++;
      }
    }
    return totalContasPoupanca;
  }

  public void transferenciaEntreContas(int numeroContaSaida, int numeroContaEntrada, double valor) {
    Conta contaSaida = null;
    Conta contaEntrada = null;
    for (Conta conta : contas) {
      if (conta.getNumero() == numeroContaSaida) {
        contaSaida = conta;
      } else if (conta.getNumero() == numeroContaEntrada) {
        contaEntrada = conta;
      }
    }
    
    if (contaSaida != null && contaEntrada != null) {
      contaSaida.transferir(contaEntrada, valor);
    }
  }

  public String getNome() {
    return nome;
  }

  public List<Conta> getContas() {
    return contas;
  }

}
