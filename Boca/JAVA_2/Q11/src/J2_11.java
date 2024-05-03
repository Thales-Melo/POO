import java.util.Scanner;

public class J2_11 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        EscolaManager escola = new EscolaManager();

        while (true) {
            String line = input.nextLine();
            if (line.isEmpty()) {
                break;
            }

            String[] entry = line.split("\\s+");

            switch (entry[0]) {
                case "A":
                    Aluno aluno = new Aluno();
                    aluno.setNome(entry[1]);
                    aluno.setSobrenome(entry[2]);
                    aluno.setMatricula(Integer.parseInt(entry[3]));
                    escola.add(aluno);     
                    break;
                    
                case "P":
                    Professor professor = new Professor();
                    professor.setNome(entry[1]);
                    professor.setSobrenome(entry[2]);
                    professor.setDisciplina(entry[3]);
                    escola.add(professor);     
                    break;
                    
                default:
                    System.out.println("Tipo nao existe!");
                    break;
            }

        }
        
        escola.print();

        input.close();
    }
}
