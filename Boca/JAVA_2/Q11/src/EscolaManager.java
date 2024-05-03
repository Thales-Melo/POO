import java.util.ArrayList;
import java.util.List;

public class EscolaManager {
    private List<Pessoa> listaPessoas;

    public EscolaManager () {
        this.listaPessoas = new ArrayList<Pessoa>();
    }

    public void print () {
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa instanceof Aluno) {
                Aluno aluno = (Aluno)pessoa;
                System.out.printf("Aluno %d %s %s\n", aluno.getMatricula(), aluno.getNome(), aluno.getSobrenome());
            }
            else if (pessoa instanceof Professor) {
                Professor professor = (Professor)pessoa;
                System.out.printf("Professor %s %s %s\n", professor.getDisciplina(), professor.getNome(), professor.getSobrenome());

            }
        }
    }

    public void add (Pessoa pessoa) {
        if (pessoa != null) {
            this.listaPessoas.add(pessoa);
        }
    }

}
