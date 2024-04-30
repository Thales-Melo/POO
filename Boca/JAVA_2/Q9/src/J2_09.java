import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J2_09 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        input.nextLine();

        List <Produto> listaProdutos = new ArrayList<Produto>();
        
        for (int i=0; i<N; i++) {
            String line[] = input.nextLine().split(",");
            String op = line[0];
            Produto produto = null;

            if (op.equals("L")) {
                produto = new Livro(line[1], Double.parseDouble(line[2]), line[3]);
            }
            
            else if (op.equals("C")) {
                produto = new CD(line[1], Double.parseDouble(line[2]), Integer.parseInt(line[3]));
            }
            
            else if (op.equals("D")) {
                produto = new DVD(line[1], Double.parseDouble(line[2]), Integer.parseInt(line[3]));
            }  

            if (i != N) {
                listaProdutos.add(produto);
            }
        }

        Collections.sort(listaProdutos);

        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        input.close();
    }
}
