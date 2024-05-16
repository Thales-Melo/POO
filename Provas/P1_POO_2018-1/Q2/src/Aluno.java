public class Aluno extends Pessoa {
    private String matricula;
    private AOD[] aod;

    public Aluno (String nome, String matricula, AOD[] aod) {
        super(nome);
        this.matricula = matricula;
        this.aod = aod;
    }

    public String getMatricula() {
        return matricula;
    }
}
