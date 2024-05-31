package customizacao;

public class FacebookMessenger extends ServicoMsgInstantanea{

  @Override
  public void enviarMensagem() {
    verificarConexaoInternet();
    System.out.println("Mensagem enviada via FacebookMessenger");
    salvarNoHistorico();
  }

  @Override
  public void receberMensagem() {
    verificarConexaoInternet();
    System.out.println("Mensagem recebida via FacebookMessenger");
    salvarNoHistorico();
  }
}
