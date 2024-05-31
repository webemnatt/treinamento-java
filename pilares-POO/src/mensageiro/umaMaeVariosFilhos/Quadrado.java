package mensageiro.umaMaeVariosFilhos;

public class Quadrado extends Quadrilatero{
  private double lado;
  
  public Quadrado(double lado) {
    this.lado = lado;
  }

  @Override
  public double calcularArea() {
    return lado * lado;
  }

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }
  
}
