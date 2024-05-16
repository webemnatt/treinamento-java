package edu.meu.collections.ordenacao.comparator;

import java.util.Comparator;

import edu.meu.collections.ordenacao.Pessoa;

/**
 * Esta classe é uma classe complementar à classe Pessoa, uma vez que não é
 * possível mais de um compareTo por classe.
 * Ela implementa a interface <strong>java.util.Comparator</strong> e recebe
 * como generics
 * a classe Pessoa.
 * O único método existente é a da interface: <strong>compare</strong>, onde
 * compara pessoas por <strong>altura</strong> em ordem crescente.
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/16/24
 */
public class ComparadorPessoasAltura implements Comparator<Pessoa> {

  @Override
  public int compare(Pessoa pessoa01, Pessoa pessoa02) {
    Double valor01EmDouble = (Double) pessoa01.getAltura();
    Double valor02EmDouble = (Double) pessoa02.getAltura();
    int comparador = Double.compare(valor01EmDouble, valor02EmDouble);
    return comparador;
  }

}
