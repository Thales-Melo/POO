import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> notas;
    private int faltas;

    public Aluno (String nome, List<Double> notas, int faltas) {
        this.nome = nome;
        this.notas = notas;
        // this.notas = notas;
        this.faltas = faltas;
    }

    public int getFaltas () {
        return faltas;
    }

    public String getNome () {
        return nome;
    }

    public List<Double> getNotas () {
        return notas;
    }

    public double media () {
        double media = 0;
        for (int i=0; i<notas.size(); i++) {
            media += notas.get(i);
        }
        media /= notas.size();

        return media;
    }

    public String situacao (double media, int cargaHoraria) {
        if (this.faltas > cargaHoraria*0.25) {
            return "RF";
        }
        else {
            if (media >= 7) {
                return "AP";
            }
            else {
                return "PF";
            }
        }
    }

    public void print () {
        System.out.println(this.nome + " " + this.faltas + " faltas");
    }
}