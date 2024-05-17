package edu.meu.collections.list.numerosOrdenados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe com métodos <strong>ordenarAscendente</strong> e
 * <strong>ordenarDescendente</strong>. O construtor da classe inicializa a
 * lista de Integers para que ela não retorne null
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/16/24
 */
public class OrdenacaoNumeros {
  List<Integer> listaNumeros;

  public OrdenacaoNumeros() {
    listaNumeros = new ArrayList<>();
  }

  /**
   * Método que adiciona um número do tipo Integer
   * 
   * @param numero espera um valor do tipo Integer
   */
  public void adicionarNumero(Integer numero) {
    listaNumeros.add(numero);
  }

  /**
   * Método que ordena de forma ascendente os números inteiros
   * 
   * @return retorna uma lista de Integers
   */
  public List<Integer> ordenarAscendente() {
    List<Integer> listaAscendente = new ArrayList<>(listaNumeros);
    Collections.sort(listaAscendente);
    return listaAscendente;
  }

  /**
   * Método que ordena de forma descendente os números inteiros
   * 
   * @return retorna uma lista de Integers
   */
  public List<Integer> ordenarDescendente() {
    List<Integer> listaDescendente = new ArrayList<>(listaNumeros);
    Collections.sort(listaDescendente, new OrdenadorOrdemDescendente());
    return listaDescendente;
  }

  /**
   * Getter do atributo desta classe
   * 
   * @return Retorna a lista de números do atributo desta classe
   */
  public List<Integer> getListaNumeros() {
    return listaNumeros;
  }

}
