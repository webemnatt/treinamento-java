package candidatura;

import java.util.ArrayList;
import java.util.Random;

public class ContatoCandidato {

  private static boolean atender() {
    boolean atendeu = new Random().nextInt(3) == 1;
    return atendeu;
  }

  private static void entrandoEmContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;

    do {
      atendeu = atender();
      continuarTentando = !atendeu;
      if (continuarTentando) {
        tentativasRealizadas++;
      } else {
        System.out.println();

        System.out.print("Contato realizado com sucesso!\t");
      }
    } while (continuarTentando && tentativasRealizadas < 3);

    if (atendeu) {
      System.out.printf("Conseguimos contanto com %s após %d tentativas\n", candidato, tentativasRealizadas);
    } else {
      System.out.println();
      System.out.printf("Não conseguimos contato com %s após %d tentativas\n", candidato, tentativasRealizadas);
    }
  }

  public static void ligarParaTodosOsSelecionados(ArrayList<String> listaSelecionados) {
    System.out.println("---------Ligando para cada um dos selecionados----------");
    for (String selecionado : listaSelecionados) {
      entrandoEmContato(selecionado);
    }
    System.out.println("---------Fim----------");
  }
}
