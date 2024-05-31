package livro;

public class Livro implements Comparable<Livro> {
  private String titulo;
  private String autor;
  private int ano;

  // Construtor
  public Livro(String ti, String au, int an) {
    this.titulo = ti;
    this.autor = au;
    this.ano = an;
  }

  @Override
  public int compareTo(Livro outro) {
    // Lógica de comparação entre dois objetos Livro
    if (this.ano < outro.ano) {
      return -1; // coloque numa posição anterior
    } else if (this.ano > outro.ano) {
      return 1; // deixe na posição em que está
    } else {
      return this.titulo.compareTo(outro.titulo); // se ambos forem do mesmo ano, retorne a posição do outro livro em
                                                  // relação ao livro atual
    }
  }

  // Métodos getters para acessar os dados privados
  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getAno() {
    return ano;
  }

  @Override
  public String toString() {
    return "Livro [ano=" + ano + ", autor=" + autor + ", titulo=" + titulo + "]";
  }
}
