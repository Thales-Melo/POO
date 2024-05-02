import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1_2019_1_Questao02 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String nomeDisciplina = input.nextLine();
        int cargaHoraria = input.nextInt();
        input.nextLine();
        int numMatriculados = input.nextInt();
        input.nextLine();

        Disciplina disciplina = new Disciplina(nomeDisciplina, cargaHoraria, numMatriculados);

        int numAvaliacoes = input.nextInt();
        input.nextLine();

        for (int i=0; i<numMatriculados; i++) {
            List<Double> notas = new ArrayList<Double>();
            int quantidadeFaltas=0;
            String[] dadosAluno = input.nextLine().split("\\s+");
            try {
                quantidadeFaltas = Integer.parseInt(dadosAluno[0]);
            } 
            catch (Exception e) {
                // TODO: handle exception
                System.out.println("Dados invalidos: null");
                input.close();
                return;
            }
            for (int n=1; n<1+numAvaliacoes; n++) {        
                try {
                    notas.add(Double.parseDouble(dadosAluno[n]));
                } 
                catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Dados invalidos: null");
                    input.close();
                    return;
                }        
            }
            String nome = dadosAluno[dadosAluno.length-1];
            Aluno aluno = new Aluno(nome, notas, quantidadeFaltas);
            
            disciplina.addAluno(aluno);
        }
        disciplina.situacaoTurma();
        
        input.close();
    }
}
