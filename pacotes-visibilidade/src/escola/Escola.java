package escola;

import java.lang.reflect.Field;

import edu.meu.enums.EstadosBrasileiros;

public class Escola {
  public static void main(String[] args) {
    Estudante felipe = new Estudante();

    try {
      // Usando reflexão para acessar as variáveis de instância
      Field nomeField = felipe.getClass().getDeclaredField("nome");
      nomeField.setAccessible(true);
      nomeField.set(felipe, "Felipe");

      Field idadeField = felipe.getClass().getDeclaredField("idade");
      idadeField.setAccessible(true);
      idadeField.set(felipe, 8);

      System.out.println(String.format("O aluno %s tem %d", felipe.nome, felipe.idade));
    } catch (NoSuchFieldException e) {
      System.out.println("Erro: campo não encontrado na classe Aluno.");
    } catch (IllegalAccessException e) {
      System.out.println("Erro: não foi possível acessar o campo.");
    }

    // com getters e setters
    Aluno ana = new Aluno();
    ana.setNome("Ana");
    ana.setIdade(7);
    System.out.println(String.format("A aluna %s tem %d", ana.getNome(), ana.getIdade()));

    // com construtor
    Matriculado jose = new Matriculado("José", 8);
    jose.setEndereco("Rua dos desenvolvedores, 100");

    // enums

    EstadosBrasileiros sp = EstadosBrasileiros.SAO_PAULO;

    System.out.printf("A sigla %s é do estado de %s\n", sp.getSigla(), sp.getNome());
    System.out.println(sp.getNomeCaixaAlta());

    System.out.println("Listando todos os estados brasileiros e distrito federal: ");

    //iterando a lista toda de objetos enum
    EstadosBrasileiros[] estados = EstadosBrasileiros.values();
    for (EstadosBrasileiros estado : estados) {
      System.out.println(estado.getNome().concat(" - ").concat(estado.getSigla()));
    }

  }

}
