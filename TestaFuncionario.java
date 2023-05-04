public class TestaFuncionario {
  public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario();
    funcionario1.nomeFunc = "Antonio Ferreira";
    funcionario1.salarioFunc = 3000;
    funcionario1.rgFunc = "12345678-0";
    funcionario1.deptoFunc = "Vendas";
    funcionario1.recebeAumento(20);
    funcionario1.exibeInformacoes();
    double ganhoAnual = funcionario1.calculaGanhoAnual();
    System.out.printf("Ganho Anual = R$ %.2f\n", ganhoAnual);
  }
}
