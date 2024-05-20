package edu.meu.collections.map.ordenacao.eventos;

import java.time.LocalDate;

public class TesteAgendaEventos {
  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();
    agendaEventos.exibirAgenda();
    agendaEventos.obterProximoEvento();

    agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 1), "Evento dezembro", "Descrição do evento 1");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 2), "Evento junho", "Descrição do evento 2");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 3), "Evento setembro", "Descrição do evento 3");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 11, 4), "Evento novembro", "Descrição do evento 4");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 1, 5), "Evento janeiro", "Descrição do evento 5");
    agendaEventos.adicionarEvento(LocalDate.now(), "Evento hoje", "Descrição do evento 6");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 5, 21), "Evento amanhã", "Descrição do evento 7");
    System.out.println();
    System.out.println("-----prox evento------------");
    System.out.println(agendaEventos.obterProximoEvento());
    ;
    System.out.println();
    agendaEventos.exibirAgenda();

  }
}
