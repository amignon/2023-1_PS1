public class TestaTurma {
  public static void main(String[] args) {
     Aluno a1 = new Aluno("Ale", 4.5, 8.0);
     Aluno a2 = new Aluno("Bia", 6.0, 9.5);
     Turma turma = new Turma();
     turma.adicionaAluno(a1);
     turma.adicionaAluno(a2);
     turma.adicionaAluno(new Aluno("Ana", 8.0, 7.0));
     double mediaTurma = turma.calculaMediaTurma();
     System.out.printf("Média da turma: %.1f\n", mediaTurma);
     int acimaMedia = turma.quantidadeAlunosAcimaMedia();
     System.out.printf("Quantidade de Alunos Acima da Média = %d\n", acimaMedia);
  }
}
