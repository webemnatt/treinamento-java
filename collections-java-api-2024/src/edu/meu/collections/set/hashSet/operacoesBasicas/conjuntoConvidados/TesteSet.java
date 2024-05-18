package edu.meu.collections.set.hashSet.operacoesBasicas.conjuntoConvidados;

public class TesteSet {

  public static void main(String[] args) {
    ConjuntoDeConvidados conjunto = new ConjuntoDeConvidados();
    conjunto.exibirConvidados();
    conjunto.removerConvidadoPorCodigoConvite(0);
    System.out.printf("Quantos convidados há no conjunto? %d\n", conjunto.contarConvidados());

    System.out.println("--------------adicionar convidados----------");
    conjunto.adicionarConvidado("João", 1234);
    conjunto.adicionarConvidado("Maria", 1230);
    conjunto.adicionarConvidado("Pedro", 1235);
    conjunto.adicionarConvidado("Patricia", 1235);
    conjunto.adicionarConvidado("João", 1200);

    System.out.println("------------exibir convidados----------");
    conjunto.exibirConvidados();

    System.out.println("------------contar convidados----------");
    System.out.printf("Quantos convidados há no conjunto? %d\n", conjunto.contarConvidados());

    System.out.println("------------Remover convidados----------");
    conjunto.removerConvidadoPorCodigoConvite(1230);
    conjunto.exibirConvidados();
    System.out.printf("Quantos convidados há no conjunto? %d\n", conjunto.contarConvidados());

    conjunto.removerConvidadoPorCodigoConvite(1230);
    System.out.printf("Quantos convidados há no conjunto? %d\n", conjunto.contarConvidados());

  }
}
