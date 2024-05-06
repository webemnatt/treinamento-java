public class ResultadoEscolar {
  public static void main(String[] args) {
    int notaEduardo = 5;
    int notaPaulo = 8;
    int media = 7;
    String resultadoEduardo = "Calculando a média...";

    if (notaEduardo >= media) {
      resultadoEduardo = "Aprovado";
    } else if (notaEduardo >= 5 && notaEduardo < media) {
      resultadoEduardo = "Recuperação";
    } else {
      resultadoEduardo = "Reprovado";
    }

    System.out.println("Resultado do Eduardo:\t".concat(resultadoEduardo));

    String resultadoPaulo = notaPaulo >= media ? "Aprovado"
        : notaPaulo >= 5 && notaPaulo < media ? "Recuperação" : "Reprovado";

    System.out.println("Resultado do Paulo:\t".concat(resultadoPaulo));

  }
}
