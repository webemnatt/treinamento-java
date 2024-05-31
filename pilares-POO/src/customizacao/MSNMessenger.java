package customizacao;

public class MSNMessenger extends ServicoMsgInstantanea {

  @Override
  public void enviarMensagem() {
    verificarConexaoInternet();
    System.out.println("Mensagem enviada via MSNMessenger");
    salvarNoHistorico();
  }

  @Override
  public void receberMensagem() {
    verificarConexaoInternet();
    System.out.println("Mensagem recebida via MSNMessenger");
    salvarNoHistorico();
  }

}
