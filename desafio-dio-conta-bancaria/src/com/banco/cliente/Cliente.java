package com.banco.cliente;

public class Cliente {

  private static final int CPF_LENGTH = 11;

  private String nome;
  private String cpf;

  public Cliente(String nome, String cpf) {
    this.nome = nome;
    setCPF(cpf);
  }

  private boolean eCPFValido(String cpf) {
    cpf = cpf.replaceAll("[^0-9]", "");
    if (cpf.length() != CPF_LENGTH) {
      return false;
    }
    return true;
  }

  private String normalizarCPF(String cpf) {
    cpf = cpf.replaceAll("[^0-9]", "");

    return String.format("%s.%s.%s-%s", cpf.substring(0, 3), cpf.substring(3, 6), cpf.substring(6, 9),
        cpf.substring(9));
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCPF() {
    return cpf;
  }

  public void setCPF(String cpf) {
    if (cpf == null || cpf.trim().isEmpty()) {
      throw new IllegalArgumentException("CPF não pode ser nulo ou vazio.");
    }

    if (eCPFValido(cpf)) {
      this.cpf = normalizarCPF(cpf);
    } else {
      throw new IllegalArgumentException("CPF inválido.");
    }
  }

}
