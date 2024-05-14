public class Professor extends Pessoa {
    private boolean ehChefe;
    private String RT;
    private Departamento departamento;
    private Atividade[] listaAtividades;


    public Professor (String nome, boolean ehChefe, String RT, Departamento departamento, Atividade[] atividades) {
        super(nome);
        this.ehChefe = ehChefe;
        this.RT = RT;
        this.departamento = departamento;
        this.listaAtividades = atividades;
    }


    public boolean getehChefe () {
        return this.ehChefe;
    }


    public String getRT() {
        return RT;
    }


    public String getDepartamento() {
        return departamento;
    }
 
    
}
