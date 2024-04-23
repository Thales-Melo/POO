import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J2_04 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        input.nextLine();

        List <Produto> listaProdutos = new ArrayList<Produto>();

        for (int i=0; i<N; i++) {
            String line[] = input.nextLine().split(",");
            String op = line[0];
            
            if (op.equals("L")) {
                Livro livro = new Livro(line[1], Double.parseDouble(line[2]), line[3]);
                listaProdutos.add(livro);
            }

            else if (op.equals("C")) {
                CD CD = new CD(line[1], Double.parseDouble(line[2]), Integer.parseInt(line[3]));
                listaProdutos.add(CD);
            }

            else if (op.equals("D")) {
                DVD DVD = new DVD(line[1], Double.parseDouble(line[2]), Double.parseDouble(line[3]));
                listaProdutos.add(DVD);
            }

        }

        

        input.close();
    
    }
}
