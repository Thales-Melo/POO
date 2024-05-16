import java.util.Scanner;

public class P1_2019_1_Questao03 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine();

        PPG ppg = new PPG();

        for (int i=0; i<N; i++) {
            String tipoArtigo = input.nextLine();
            String titulo = input.nextLine();
            String[] tamLivro = input.nextLine().split("-");
            int pagInicial = Integer.parseInt(tamLivro[0]);
            int pagFinal = Integer.parseInt(tamLivro[1]);
            String nomeVeiculo = input.nextLine();
            String idxQualis = input.nextLine();
            
            Artigo artigo = new Artigo(titulo, tipoArtigo, nomeVeiculo, idxQualis, pagInicial, pagFinal);
            ppg.addArtigo(artigo);

        }

        ppg.relatorio();

        input.close();
        
    }
}
