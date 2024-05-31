package multifuncao;

public class Multifuncional implements Digitalizadora, Impressora, Fax {

  @Override
  public void enviarFax() {
    System.out.println("Enviando fax");
  }

  @Override
  public void copiar() {
    System.out.println("Copiando");
  }

  @Override
  public void imprimir() {
    System.out.println("Imprimindo");
  }

  @Override
  public void digitalizar() {
    System.out.println("Digitalizando");
  }

}
