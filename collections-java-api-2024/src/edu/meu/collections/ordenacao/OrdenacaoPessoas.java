package edu.meu.collections.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.meu.collections.ordenacao.comparator.ComparadorPessoasAltura;

/**
 * Esta classe possui três métodos:
 * <strong>adicionarPessoa</strong>,<strong>ordenarPorIdade</strong> e
 * <strong>ordenarPorAltura</strong>
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/16/24
 */
public class OrdenacaoPessoas {

  private List<Pessoa> listaPessoas;

  public OrdenacaoPessoas() {
    listaPessoas = new ArrayList<>();
  }

  /**
   * Adiciona um objeto do tipo Pessoa à lista desta classe
   * 
   * @param nome   espera receber uma String como valor
   * @param idade  espera receber um int como valor
   * @param altura espera receber double como valor
   */
  public void adicionarPessoa(String nome, int idade, double altura) {
    listaPessoas.add(new Pessoa(nome, idade, altura));
  }

  /**
   * O método vazio ordena as pessoas da lista por idade usando a interface
   * Comparable.
   * Uma nova lista que contém os mesmos elementos do atributo desta classe é
   * criada.
   * Então é usado o método <strong>.sort()</strong> de java.util.Collections para
   * ordenar esta nova lista, sem alterar a lista original.
   * Observe que a ordenação de pessoas é possível porque a própria classe Pessoa
   * implementa o Comparable e sobrescreveu o método compareTo por idade.
   */
  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> listaPorIdade = new ArrayList<>(listaPessoas);
    Collections.sort(listaPorIdade);
    return listaPorIdade;
  }

  /**
   * Ordena as pessoas da lista por altura usando um Comparator personalizado: o
   * ComparadorPessoaAltura, que é inicializado no parâmetro justamente para usar
   * o método sobrescrito da interface .
   * O método faz uma nova lista com os mesmos elementos do atributo desta
   * OrdenacaoPessoas
   * O método <strong>sort</strong> do java.util.Collections será usado como
   * primeiro parâmetro
   */
  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> listaPorAltura = new ArrayList<>(listaPessoas);
    Collections.sort(listaPorAltura, new ComparadorPessoasAltura());
    return listaPorAltura;
  }

  public List<Pessoa> getListaPessoas() {
    return listaPessoas;
  }

  @Override
  public String toString() {
    return "OrdenacaoPessoas [listaPessoas=" + listaPessoas + "]";
  }

}
