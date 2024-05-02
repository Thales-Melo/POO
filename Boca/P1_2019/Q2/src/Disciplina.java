import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Disciplina {
    private List<Aluno> turma;
    private int tamanho;
    private int cargaHoraria;
    private String nome;

    public Disciplina (String nome, int cargaHoraria, int tamanho) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.tamanho = tamanho;
        this.turma = new ArrayList<Aluno>();
    }

    public void setTurma(List<Aluno> turma) {
        this.turma = turma;
    }

    public List<Aluno> getTurma() {
        return turma;
    }

    public void addAluno(Aluno aluno) {
        turma.add(aluno);
    }


    public void situacaoTurma () {
        System.out.println(this.nome + " (" + this.cargaHoraria + " horas-aula):");

        for (int i=0; i<this.tamanho; i++) {
            Aluno aluno = turma.get(i);
            double media = aluno.media();
            System.out.printf(Locale.US, "%s %.1f %s\n", aluno.getNome(), media, aluno.situacao(media, this.cargaHoraria));
        }
    }

}
        