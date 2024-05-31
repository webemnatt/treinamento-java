package customizacao;

public abstract class ServicoMsgInstantanea {
  public abstract void enviarMensagem();

  public abstract void receberMensagem();

  protected void verificarConexaoInternet() {
    System.out.println("Conexão com a internet validada.");
  }

  protected void salvarNoHistorico() {
    System.out.println("Mensagem salva no histórico.");
  }
}
