package com.user;

import com.macaMordida.AiFone;

public class Usuario {
  public static void main(String[] args) throws Exception {
    AiFone aifone = new AiFone();

    aifone.adicionarNovaAba();
    aifone.atualizarPagina();
    aifone.exibirPagina("www.apple.com.br");
    aifone.atualizarPagina();

    aifone.atender();
    aifone.ligar("+55 (71)98702-5891");
    aifone.atender();
    aifone.iniciarCorreioVoz();

    aifone.tocar();
    aifone.selecionarMusica("Amanhã");
    aifone.tocar();
    aifone.pausar();
    aifone.pausar();


  }
}
