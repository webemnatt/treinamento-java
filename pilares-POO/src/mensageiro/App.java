package mensageiro;

import customizacao.FacebookMessenger;
import customizacao.MSNMessenger;
import customizacao.ServicoMsgInstantanea;
import mensageiro.reutilizacao.Carro;
import mensageiro.reutilizacao.Moto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----carro-------");
        Carro carro = new Carro();
        carro.ligar();

        System.out.println("----moto-------");
        Moto moto = new Moto();
        moto.ligar();

        System.out.println("----msn-------");

        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();

        System.out.println("----Facebook-------");

        ServicoMsgInstantanea coringa = new FacebookMessenger();
        coringa.enviarMensagem();
    }
}
