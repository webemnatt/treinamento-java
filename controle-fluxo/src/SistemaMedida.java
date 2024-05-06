public class SistemaMedida {
  public static void main(String[] args) {
    String sigla1 = "A";
    String sigla2 = "XL";

    if (sigla1 == "S") {
      System.out.println("Pequeno");
    } else if (sigla1 == "M") {
      System.out.println("Médio");
    } else if (sigla1 == "L") {
      System.out.println("Grande");
    } else if (sigla1 == "XL") {
      System.out.println("Extra grande");
    } else {
      System.out.println("Tamanho indefinido");
    }

    switch (sigla2) {
      case "S":
        System.out.println("Pequeno");
        break;
      case "M":
        System.out.println("Médio");
        break;
      case "L":
        System.out.println("Grande");
        break;
      case "XL":
        System.out.println("Extra grande");
        break;
      default:
        System.out.println("Tamanho indefinido");
        break;
    }

  }
}
