import java.util.ArrayList;

import candidatura.ContatoCandidato;
import candidatura.ProcessoSeletivo;

public class App {
    public static void main(String[] args) throws Exception {
        double salarioBase = 2_000.0;
        String[] listaCandidatos = { "Emily", "Michael", "Hannah", "Alex", "Sarah", "William", "Olivia", "James", "Ava",
                "Daniel" };

        ArrayList<String> listaSelecionados = ProcessoSeletivo.selecionarCandidatos(listaCandidatos, salarioBase, 5);
        ProcessoSeletivo.gerarListaCandidatosSelecionados(listaSelecionados);
        ContatoCandidato.ligarParaTodosOsSelecionados(listaSelecionados);
    }

}
