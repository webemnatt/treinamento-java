package edu.meu.collections.list.numerosOrdenados;

import java.util.Comparator;
/**
 * Classe auxiliar fazendo uso do <strong>java.util.Comparator</strong>
 */
class OrdenadorOrdemDescendente implements Comparator<Integer> {
  @Override
  public int compare(Integer a, Integer b) {
    return b.compareTo(a);
  }
}
