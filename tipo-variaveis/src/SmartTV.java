/**
 * <h1>SmartTv Intelligent</h1>
 * A SmartTv Intelligent responde aos comandos ligar/desligar, aumentar/reduzir
 * volume, avançar/retroceder canal e escolher canal.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para usufruir de
 * seus recursos
 * </p>
 * 
 * @author webemnatt
 * @version 1.0
 * @since 30/04/2024
 */

public class SmartTV {
    public boolean ligada = false;
    public int canal = 1;
    public int volume = 25;

    /**
     * O método <b>ligar()</b> alterna o estado do atributo ligada, que, por
     * default, é desligada (false)
     * O método não recebe parâmetros e não tem retorno.
     * O método sendo chamado uma vez, liga a tv.
     * Sendo chamado novamente, desliga a tv.
     */
    public void ligar() {
        ligada = !ligada;
        if (ligada == true) {
            System.out.println("iniciando SmartTv Intelligent");
        } else {
            System.out.println("SmartTv Intelligent sendo desligada...");
        }
    }

    /**
     * O método <b>aumetarVolume()</b> faz aumentar o volume de um em um
     * O método não tem parâmetros nem retorno
     * O atributo volume tem valor inicial 25
     * O método dispara uma mensagem informando para quanto foi aumentado o volume.
     */
    public void aumentarVolume() {
        volume++;
        System.out.format("Aumentando volume para %d\n", volume);
    }

    /**
     * O método <b>diminuirVolume()</b> faz diminuir o volume da tv de um em um
     * O método não tem parâmetros nem retorno
     * O atributo volume tem valor inicial 25
     * O método dispara uma mensagem informando para quanto foi diminuído o volume.
     */
    public void diminuirVolume() {
        volume--;
        System.out.format("Diminuindo volume para %d\n", volume);
    }

    /**
     * O método <b>avancarCanal()</b> faz avançar um canal da TV
     * O método não tem parâmetros
     * O atributo canal tem valor inicial 1
     * 
     * @return int o resultado neste método é o canal atual mais um
     */
    public int avancarCanal() {
        return canal++;
    }

    /**
     * O método <b>retrocederCanal()</b> faz retroceder um canal da tv
     * O método não tem parâmetros
     * O atributo canal tem valor inicial 1
     * 
     * @return int o resultado neste método é o canal atual menos um
     */
    public int retrocederCanal() {
        return canal--;
    }

    /**
     * O método <b>escolherCanal()</b> permite escolher um canal da tv
     * O atributo canal é atualizado com o novoCanal
     * O método não retorna um valor
     * O método exibe uma mensagem informando númbero do canal selecionado.
     * Para tanto,
     * 
     * @param novoCanal é o único parâmetro do método, onde o usuário informa o
     *                  canal
     *                  desejado
     */
    public void escolherCanal(int novoCanal) {
        canal = novoCanal;
        System.out.format("Canal selecionado: %d\n", canal);
    }

}
