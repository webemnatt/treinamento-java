package excecoes.excecaoCustomizada;

public class FormatadorCep {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("1234567");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.out.println("O cep não corresponde às regras de negócios.");
    }
  }

  private static String formatarCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8) {
      throw new CepInvalidoException();
    }

    return "12.123-123";
  }
}
