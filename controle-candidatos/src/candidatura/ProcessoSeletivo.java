package candidatura;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

  public static ArrayList<String> selecionarCandidatos(String[] candidatos, double salarioBase,
      int quantidadeSelecionados) {
    int candidatosSelecionados = 0;
    int indiceCandidato = 0;
    ArrayList<String> listaSelecionados = new ArrayList<>();

    while (candidatosSelecionados < quantidadeSelecionados && indiceCandidato < candidatos.length) {
      String candidato = candidatos[indiceCandidato];
      double salarioPretendido = gerarSalarioAleatorio();

      System.out.printf("indice: %d\t", indiceCandidato);
      System.out.printf("O candidato %s tem a pretensão salarial de %.2f\t\t", candidato, salarioPretendido);
      if (salarioBase >= salarioPretendido) {
        System.out.printf("Candidato selecionado para a vaga: %s\n", candidato);
        listaSelecionados.add(candidato);
        candidatosSelecionados++;
      } else {
        System.out.println("Candidato não selecionado");
      }
      indiceCandidato++;
    }
    return listaSelecionados;
  }

  private static double gerarSalarioAleatorio() {
    return ThreadLocalRandom.current().nextDouble(1100, 2200);
  }

  public static void gerarListaCandidatosSelecionados(ArrayList<String> listaSelecionados) {
    System.out.println("Lista de candidatos selecionados:");
    int indice = 1;
    for (String selecionado : listaSelecionados) {
      System.out.printf("%d.  %s\n", indice, selecionado);
      indice++;
    }
  }
}
