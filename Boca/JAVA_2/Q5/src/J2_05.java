import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J2_05 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        input.nextLine();

        List <Produto> listaProdutos = new ArrayList<Produto>();
        
        
        for (int i=0; i<=N; i++) {
            String line[] = input.nextLine().split(",");
            String op = line[0];
            Produto produto = null;

            if (op.equals("L")) {
                produto = new Livro(Integer.parseInt(line[1]), line[2], Double.parseDouble(line[3]), line[4]);
            }
            
            else if (op.equals("C")) {
                produto = new CD(Integer.parseInt(line[1]), line[2], Double.parseDouble(line[3]), Integer.parseInt(line[4]));
            }
            
            else if (op.equals("D")) {
                produto = new DVD(Integer.parseInt(line[1]), line[2], Double.parseDouble(line[3]), Integer.parseInt(line[4]));
            }  

            if (i != N) {
                listaProdutos.add(produto);
            }

            else {
                int find = -1;
                for (int k=0; k<N; k++) {
                    if (listaProdutos.get(k).equals(produto) == true) {
                        find = k;
                        break;
                    }
                }
                if (find == -1) {
                    System.out.println("Produto nao encontrado.");
                }
                else {
                    System.out.println(find);
                }
            }

        }

        input.close();
    }

}