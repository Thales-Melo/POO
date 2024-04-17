import java.util.Locale;
import java.util.Scanner;

public class J1_15 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        
        

        int l_1 = input.nextInt();
        if (!(l_1 > 0)) {
            System.out.println("Dimensão inválida");
            input.close();
            return;
        }
        int c_1 = input.nextInt();
        if (!(c_1 > 0)) {
            System.out.println("Dimensão inválida");
            input.close();
            return;
        }
        double matrix_1[][] = MatrixUtils.read(l_1, c_1, input);

        int l_2 = input.nextInt();
        if (!(l_2 > 0)) {
            System.out.println("Dimensão inválida");
            input.close();
            return;
        }
        
        int c_2 = input.nextInt();
        if (!(c_1 > 0)) {
            System.out.println("Dimensão inválida");
            input.close();
            return;
        }
        double matrix_2[][] = MatrixUtils.read(l_2, c_2, input);
        
        if (l_1 != l_2 || c_1 != c_2) {
            System.out.println("Dimensões não compatíveis");
            input.close();
            return;
        }

        MatrixUtils.print(MatrixUtils.multiply(matrix_1, matrix_2));

        input.close();
    }
}

