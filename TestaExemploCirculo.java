public class TestaExemploCirculo {
  public static void main(String[] args) {
    Ponto p = new Ponto(3, 5);
    Circunferencia c = new Circunferencia(p, 7.5);
    Ponto p1 = new Ponto(4, 6);
    boolean contido = c.estaContido(p1);
    System.out.println(contido);
  } 
}
