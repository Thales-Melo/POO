import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class J1_14 {

    public static double[][] matrixRead(int l, int c, Scanner input) {
        double matrix[][] = new double[l][c];

        for (int i=0; i<l; i++) {
            for (int k=0; k<c; k++) {
                matrix[i][k] = input.nextDouble();
            }
        }

        return matrix;
    }

    public static void matrixPrint(double matrix[][]) {
        DecimalFormat df = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US));
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        for (int i=0; i<rows; i++) {
            for (int k=0; k<columns; k++) {
                if (k != columns-1) {
                System.out.print(df.format(matrix[i][k]) + " ");
                }
                else {
                    System.out.println(df.format(matrix[i][k]) + " ");
                }
            }
        }
    }

    public static double[][] matrixSum(double matrix_1[][], double matrix_2[][]) {
        int rows = matrix_1.length;
        int columns = matrix_1[0].length;
        double matrix_result[][] = new double[rows][columns];
        
        for (int i=0; i<rows; i++) {
            for (int k=0; k<columns; k++) {
                matrix_result[i][k] = matrix_1[i][k] + matrix_2[i][k];
            }
        }

        return matrix_result;
    }

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
        double matrix_1[][] = matrixRead(l_1, c_1, input);

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
        double matrix_2[][] = matrixRead(l_2, c_2, input);
        
        if (l_1 != l_2 || c_1 != c_2) {
            System.out.println("Dimensões não compatíveis");
            input.close();
            return;
        }

        matrixPrint(matrixSum(matrix_1, matrix_2));

        input.close();
    }
}

