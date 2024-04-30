public class App {
  public static void main(String[] args) {
    SmartTV tv = new SmartTV();
    System.out.format("Está ligada? %b\n", tv.ligada);
    System.out.format("Qual canal? %d\n", tv.canal);
    System.out.format("Qual volume? %d\n", tv.volume);
    tv.ligar();
    System.out.format("Está ligada? %b\n", tv.ligada);
    tv.ligar();
    System.out.format("Está ligada? %b\n", tv.ligada);

    tv.aumentarVolume();
    tv.aumentarVolume();
    tv.aumentarVolume();
    tv.diminuirVolume();

    tv.avancarCanal();
    System.out.format("Qual canal? %d\n", tv.canal);

    tv.retrocederCanal();
    System.out.format("Qual canal? %d\n", tv.canal);

    tv.escolherCanal(58);
    System.out.format("Qual canal? %d\n", tv.canal);

  }
}
