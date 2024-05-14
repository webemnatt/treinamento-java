package com.macaMordida;

import com.macaMordida.Apps.AparelhoTelefonico;
import com.macaMordida.Apps.NavegadorInternet;
import com.macaMordida.Apps.ReprodutorMusical;

public class AiFone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    private boolean tocandoMusica;
    private boolean musicaSelecionada;
    private String musicaAtual;
    private boolean emUmaChamada;
    private String numeroChamadaAtual;
    private String enderecoURLAtual;
    private int numeroDeAbas;

    public String getEnderecoURLAtual() {
        return enderecoURLAtual;
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }

    public String getNumeroChamadaAtual() {
        return numeroChamadaAtual;
    }

    @Override
    public void tocar() {
        if (musicaSelecionada) {
            if (!tocandoMusica) {
                tocandoMusica = true;
                System.out.printf("Tocando a música '%s'\n", musicaAtual);
            }
        } else {
            System.out.println("Selecione uma música para tocar.");
        }
    }

    @Override
    public void pausar() {
        if (tocandoMusica) {
            System.out.printf("Pausando a música '%s'\n", musicaAtual);
            tocandoMusica = false;
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        musicaSelecionada = true;
        musicaAtual = musica;
        System.out.printf("Música '%s' selecionada.\n", musicaAtual);
    }

    @Override
    public void exibirPagina(String url) {
        enderecoURLAtual = url.trim();
        numeroDeAbas++;
        System.out.printf("Exibindo página do endereço: %s. Total de abas: %d\n", enderecoURLAtual, numeroDeAbas);
    }

    @Override
    public void adicionarNovaAba() {
        numeroDeAbas++;
        System.out.printf("Nova aba adicionada. Total de abas: %d\n", numeroDeAbas);
    }

    @Override
    public void atualizarPagina() {
        if (enderecoURLAtual != null) {
            System.out.println("Atualizando página: " + enderecoURLAtual);
        }
    }

    @Override
    public void ligar(String numero) {
        if (!emUmaChamada) {
            emUmaChamada = true;
            numeroChamadaAtual = numero;
            System.out.printf("Em uma ligação com o número %s.\n", numeroChamadaAtual);
        }
    }

    @Override
    public void atender() {
        if (!emUmaChamada) {
            emUmaChamada = true;
            System.out.println("Atendendo a chamada...");
        } else {
            System.out.println("Atenção: outro número aguardando atendimento.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (!emUmaChamada) {
            System.out.println("Iniciando correio de voz");
        } else {
            System.out.println("Não é possível iniciar correio de voz durante uma chamada");
        }
    }
}
