package edu.meu.collections.set.hashSet.operacoesBasicas.conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe que cria um conjunto de convidados.
 * Tem como atributo um Set e uma classe Convidado como generic.
 * Possui métodos <strong>adicionarConvidado</strong>,
 * <strong>removerConvidadoPorCodigoConvite</strong>,
 * <strong>contarConvidados</strong>,
 * <strong>exibirConvidados</strong>.
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 05/18/24
 */
public class ConjuntoDeConvidados {
  Set<Convidado> conjuntoConvidados;

  public ConjuntoDeConvidados() {
    this.conjuntoConvidados = new HashSet<>();
  }

  /**
   * Método que adiciona um convidado ao conjunto.
   * 
   * @param nome          do tipo String
   * @param codigoConvite do tipo int
   */
  public void adicionarConvidado(String nome, int codigoConvite) {
    Convidado convidado = new Convidado(nome, codigoConvite);
    this.conjuntoConvidados.add(convidado);
  }

  /**
   * Remove um convidado do conjunto com base no código do convite.
   * 
   * @param codigoConvite do tipo int
   */
  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    if (!conjuntoConvidados.isEmpty()) {
      // solução 01
      // this.conjuntoConvidados.removeIf(convidado -> convidado.getCodigoConvite() ==
      // codigoConvite);

      // solução 02
      // for (Convidado convidado : this.conjuntoConvidados) {
      // if (convidado.getCodigoConvite() == codigoConvite) {
      // this.conjuntoConvidados.remove(convidado);
      // break;
      // }
      // }

      // solução 03
      Convidado convidadoARemover = null;
      boolean encontrado = false;
      for (Convidado cadaConvidado : conjuntoConvidados) {
        if (cadaConvidado.getCodigoConvite() == codigoConvite) {
          convidadoARemover = cadaConvidado;
          conjuntoConvidados.remove(convidadoARemover);
          encontrado = true;
          System.out.println("Convidado removido: " + codigoConvite);
          break;
        }
      }
      if (!encontrado) {
        System.out.println("Convidado não encontrado: " + codigoConvite);
      }

    } else {
      System.out.println("Conjunto de convidados vazio");
    }
  }

  /**
   * Conta o número total de convidados no Set.
   * 
   * @return um int com a quantidade de convidados
   */
  public int contarConvidados() {
    return this.conjuntoConvidados.size();
  }

  /**
   * Exibe TODOS os convidados do conjunto.
   * Se o conjunto set estiver vazio, exibe a mensagem de que não há convidados
   * cadastrados
   */
  public void exibirConvidados() {
    if (!conjuntoConvidados.isEmpty()) {
      System.out.println(conjuntoConvidados);
    } else {
      System.out.println("Não há convidados cadastrados.");
    }
  }

}
