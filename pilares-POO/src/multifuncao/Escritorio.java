package multifuncao;

public class Escritorio {
  public static void main(String[] args) {
    Multifuncional multifuncional = new Multifuncional();
    multifuncional.copiar();
    multifuncional.digitalizar();
    multifuncional.imprimir();
    multifuncional.enviarFax();

    Digitalizadora digitalizadora = multifuncional;
    digitalizadora.digitalizar();
  }
}
