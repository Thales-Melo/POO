import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PPG {
    List<Artigo> listaArtigos;

    public PPG () {
        listaArtigos = new ArrayList<Artigo>();
    }

    public void addArtigo (Artigo artigo) {
        this.listaArtigos.add(artigo);
    }

    public void print () {
        for (Artigo artigo : listaArtigos) {
            artigo.print();
            System.out.println();
        }
    }

    public int totalPaginas () {
        int total = 0;
        for (Artigo artigo : listaArtigos) {
            
            int pagFinal = artigo.getPaginaFinal();
            int pagInicial = artigo.getPaginaInicial(); 
            int diferenca = pagFinal - pagInicial + 1;
            if (diferenca > 0 && diferenca <= 50) {
                total += diferenca;
            }
            else {
                System.out.println("Artigo " + artigo.getNome() + "informa dados de paginas inicial-final incorretos: "
                + pagInicial + "-" + pagFinal);
            }
        }   
        return total;
    }

    public double mediaTipo (String tipo) {
        double media = 0;
        int countArtigos = 0;

        for (Artigo artigo : listaArtigos) {

            if (artigo.getTipoArtigo().contains(tipo)) {
                int diferenca = artigo.getPaginaFinal() - artigo.getPaginaInicial() + 1;

                if (diferenca > 0 && diferenca <= 50) {
                    media += diferenca;
                    countArtigos++;
                }

            }
        }

        return media/countArtigos;
    }

    public int countQualis (String qualis) {
        int countQualis = 0;
        for (Artigo artigo : listaArtigos) {
            if (!(artigo.getTipoArtigo().contains("resumo"))) {
                if (artigo.getIndiceQualis().equals(qualis)) {
                    countQualis++;
                }
            }
        }

        return countQualis;
    }

    public void relatorio () {
        System.out.println("Total de paginas produzidas: " + totalPaginas());
        System.out.printf(Locale.US, "Media por tipo: curto %.2f / longo %.2f / periodico %.2f\n", 
        mediaTipo("resumo"), mediaTipo("trabalhoCompletoEmCongresso"), mediaTipo("artigoEmPeriodico"));
        System.out.printf("Publicacoes por Qualis: %d x A1; %d x A2; %d x B1; %d x B2; %d x B3; %d x B4; %d x B5; %d x C;\n",
        countQualis("A1"), countQualis("A2"), countQualis("B1"), countQualis("B2"), countQualis("B3"),
        countQualis("B4"), countQualis("B5"), countQualis("C"));
    }

}
