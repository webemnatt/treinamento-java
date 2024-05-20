package edu.meu.collections.map.ordenacao.eventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

  Map<LocalDate, Evento> eventosAgendados;

  public AgendaEventos() {
    eventosAgendados = new HashMap<>();
  }

  /**
   * 
   * @param data
   * @param nome
   * @param atracao
   */
  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    eventosAgendados.put(data, new Evento(nome, atracao));
  }

  /**
   * Exibe a agenda de eventos <strong>em ordem</strong>
   */
  public void exibirAgenda() {
    Map<LocalDate, Evento> arvoreEventos = new TreeMap<>(eventosAgendados);
    System.out.println(arvoreEventos);
  }

  /**
   * Método que usa a data atual como referência para encontrar o próximo evento,
   * com base nos eventos ordenados por datas
   * 
   * @return um Map.Entry<LocalDate, Evento>
   */
  public Map.Entry<LocalDate, Evento> obterProximoEvento() {
    Map<LocalDate, Evento> arvoreEventos = new TreeMap<>(eventosAgendados);
    LocalDate dataAtual = LocalDate.now();
    Map.Entry<LocalDate, Evento> proximoEvento = null;
    for (Map.Entry<LocalDate, Evento> entrada : arvoreEventos.entrySet()) {
      if (entrada.getKey().equals(dataAtual) || entrada.getKey().isAfter(dataAtual)) {
        proximoEvento = entrada;
        break;
      }
    }
    return proximoEvento;
  }

}
