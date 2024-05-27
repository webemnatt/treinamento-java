package com.banco.cliente;

public class Cliente {

  private static final int CPF_LENGTH = 11;

  private String nome;
  private String cpf;
  // private String endereco;
  // private String telefone;
  // private String email;

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Cliente other = (Cliente) obj;
    if (cpf == null) {
      if (other.cpf != null)
        return false;
    } else if (!cpf.equals(other.cpf))
      return false;
    return true;
  }

}
