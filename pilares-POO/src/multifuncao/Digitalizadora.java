package multifuncao;

/**
 * Interface Digitalizadora com método abstrato, default e estático
 */
public interface Digitalizadora {
  /**
   * Método que deve ser implementado por quem implementa a interface
   * Digitalizadora
   */
  public void digitalizar();

  /**
   * Método default que pode ser chamado após a instanciação da classe que
   * implementa esta interface - podendo ser sobrescrita por ela.
   */
  default void iniciarDigitalizacao() {
    System.out.println("Iniciando digitalização");
  }

  /**
   * Método estático que pode ser chamado diretamente da interface
   */
  static void redigitalizar() {
    System.out.println("Redigitalizando");
  }
}
