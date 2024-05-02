import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J2_08 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        List <Forma> listaFormas = new ArrayList<Forma>(); 

        int N = input.nextInt();
        input.nextLine();

        for (int i=0; i<N; i++) {
            Forma forma = null;

            String[] entry = input.nextLine().split(",");

            char tipoForma = entry[0].charAt(0);
            switch (tipoForma) {
                case 'R':
                    forma = new Retangulo(Double.parseDouble(entry[1]), Double.parseDouble(entry[2]));
                    break;

                case 'Q':
                    forma = new Quadrado(Double.parseDouble(entry[1]));
                    break;

                case 'C':
                    forma = new Circulo(Double.parseDouble(entry[1]));
                    break;

                default:
                    System.out.println("FORMA INVÁLIDA");
                    input.close();
                    return;
            }

            listaFormas.add(forma);
        }

        for (Forma forma : listaFormas) {
            System.out.println(forma);
        }
        System.out.println();

        input.close();
    }
}
