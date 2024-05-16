package edu.meu.collections.ordenacao;

public class TesteOrdenaçãoPessoas {
  public static void main(String[] args) {
    OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();
    System.out.println("-----------Testando Métodos com a lista vazia--------------");
    listaPessoas.ordenarPorAltura();
    listaPessoas.ordenarPorIdade();

    System.out.println("--------------------adicionando Pessoas-----------------");
    listaPessoas.adicionarPessoa("João", 60, 1.8);
    listaPessoas.adicionarPessoa("Maria", 50, 1.7);
    listaPessoas.adicionarPessoa("José", 70, 1.9);
    listaPessoas.adicionarPessoa("Ana", 40, 1.6);
    listaPessoas.adicionarPessoa("Pedro", 80, 1.8);

    System.out.println("------------------Exibindo a lista atual-----------------");
    System.out.println(listaPessoas.getListaPessoas());

    System.out.println("--------------------Ordenando a lista por idade-----------------");
    listaPessoas.ordenarPorIdade();
    for (Pessoa pessoa : listaPessoas.getListaPessoas())
      System.out.println(pessoa);

    System.out.println("--------------------Ordenando a lista por Altura-----------------");
    listaPessoas.ordenarPorAltura();
    for (Pessoa pessoa : listaPessoas.getListaPessoas())
      System.out.println(pessoa);
  }

}
