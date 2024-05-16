package edu.meu.collections.numerosOrdenados;

import java.util.List;

public class TesteNumerosOrdenados {
  public static void main(String[] args) {
    OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();
    listaNumeros.adicionarNumero(15);
    listaNumeros.adicionarNumero(51);
    listaNumeros.adicionarNumero(2);
    listaNumeros.adicionarNumero(14);
    for (Integer numero : listaNumeros.getListaNumeros()) {
      System.out.println(numero);
    }
    
    System.out.println("------ordenar de frente para trás--------------");
    List<Integer> ordenarAscendente = listaNumeros.ordenarAscendente();
    for (Integer numero : ordenarAscendente) {
      System.out.println(numero);
    }

    System.out.println("------ordenar de trás para frente--------------");
    List<Integer> ordenarDescendente = listaNumeros.ordenarDescendente();
    for (Integer numero : ordenarDescendente) {
      System.out.println(numero);
    }

  }
}
