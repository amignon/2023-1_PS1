public class Circunferencia {
  // atributos
  private double raio;
  private Ponto pontoDeOrigem;

  public Circunferencia(Ponto ponto, double raio) {
    this.pontoDeOrigem = ponto;
    this.raio = raio;
  }

  public boolean estaContido(Ponto p) {
    double distancia = this.pontoDeOrigem.distancia(p);
    return raio >= distancia;
  }
}
