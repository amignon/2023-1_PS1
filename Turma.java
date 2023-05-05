import java.util.ArrayList;
public class Turma {
  private ArrayList<Aluno> alunos;

  public Turma() {
    alunos = new ArrayList<Aluno>();
  }

  public void adicionaAluno(Aluno a) {
    alunos.add(a);
  }

  public double calculaMediaTurma() {
    double soma = 0.0;
    for (Aluno aluno : alunos) {
      soma += aluno.calculaMedia();
    }
    return soma / alunos.size();
  }

  public int quantidadeAlunosAcimaMedia() {
    double mediaTurma = this.calculaMediaTurma();
    int cont = 0;
    for (Aluno aluno : alunos) {
      if (aluno.calculaMedia() > mediaTurma) {
        cont++;
      }
    }
    return cont;
  }
}
