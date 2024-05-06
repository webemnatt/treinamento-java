public class PlanoCelular {
  public static void main(String[] args) {
    char planoMaria = 'M';
    char planoCris = 'T';

    System.out.println("Maria tem direito a: ");

    if (planoMaria == 'B') {
      System.out.println("* 100 minutos em ligações");
    } else if (planoMaria == 'M') {
      System.out.println("* 100 minutos em ligações");
      System.out.println("* WhatsApp e Instagram grátis");
    } else if (planoMaria == 'T') {
      System.out.println("* 100 minutos em ligações");
      System.out.println("* WhatsApp e Instagram grátis");
      System.out.println("* 5GB para assistir Youtube");
    }

    System.out.println();

    System.out.println("Cris tem direito a: ");
    switch (planoCris) {
      case 'T':
        System.out.println("* 5GB para assistir Youtube");
      case 'M':
        System.out.println("* WhatsApp e Instagram grátis");
      case 'B':
        System.out.println("* 100 minutos em ligações");
      default:
        break;
    }
  }
}
