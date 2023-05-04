public class Funcionario {
  // atributos
  String nomeFunc;
  String deptoFunc;
  double salarioFunc;
  String rgFunc;
  
  public void recebeAumento(double percAumento) {
    double reajuste = salarioFunc * (percAumento / 100);
    // salarioFunc = salarioFunc + reajuste;
    salarioFunc += reajuste;
  }

  public double calculaGanhoAnual() {
    return salarioFunc * 12;
  }

  public void exibeInformacoes() {
    System.out.printf("Nome: %s\n", nomeFunc);
    System.out.printf("Departamento: %s\n", deptoFunc);
    System.out.printf("Salário: %.2f\n", salarioFunc);
  }
}