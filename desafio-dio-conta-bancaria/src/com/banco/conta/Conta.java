package com.banco.conta;

import java.time.LocalDate;
import com.banco.cliente.*;
import com.banco.conta.modelo.*;

public abstract class Conta implements IConta {

  private static final int AGENCIA_PADRAO = 1;

  private static int SEQUENCIAL = 1;

  private int agencia;
  private int numero;
  private double saldo;
  private Cliente titular;
  private LocalDate dataAbertura;
  private LocalDate dataEncerramento;

  public Conta(Cliente cliente) {
    this.agencia = AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.titular = cliente;
  }

  @Override
  public void sacar(double valor) {
    this.saldo -= valor;

  }

  @Override
  public void depositar(double valor) {
    this.saldo += valor;
  }

  @Override
  public void transferir(Conta contaDestino, double valor) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public Cliente getTitular() {
    return titular;
  }

  public LocalDate getDataAbertura() {
    return dataAbertura;
  }

  public LocalDate getDataEncerramento() {
    return dataEncerramento;
  }

  protected void setDataEncerramento(LocalDate dataEncerramento) {
    this.dataEncerramento = dataEncerramento;
  }

  protected void setDataAbertura(LocalDate dataAbertura) {
    this.dataAbertura = dataAbertura;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  protected void imprimirInformacoes() {
    System.out.println(String.format("Titular: %s", this.titular.getNome()));

    System.out.println(String.format("Agência: %d", this.agencia));
    System.out.println(String.format("Número: %d", this.numero));
    System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
  }
}
