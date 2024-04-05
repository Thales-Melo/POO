import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class J1_06 {
    public static double[][] matrix_Read(Scanner input, int x, int y) {
        double matrix[][] = new double[x][y];
        for (int n = 0; n < x; n++) {
            String[] linha = input.nextLine().split("\\s+");
            for (int m = 0; m < y; m++) {
                matrix[n][m] = Double.parseDouble(linha[m]);
            }
        }
        return matrix;
    }
    

    public static double[][] matrix_Multiply(double[][] matrix_A, double[][] matrix_B) {
        int lines_A = matrix_A.length;
        int colunms_A = matrix_A[0].length;
        int colunms_B = matrix_B[0].length;
        double[][] result = new double[lines_A][colunms_B];

        for (int i = 0; i < lines_A; i++) {
            for (int j = 0; j < colunms_B; j++) {
                for (int k = 0; k < colunms_A; k++) {
                    result[i][j] += matrix_A[i][k] * matrix_B[k][j];
                }
            }
        }

        return result;
    }


    public static void matrix_Print(double[][] matrix) {
        DecimalFormat df = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US));
        for (int n=0; n<matrix.length; n++) {
            for (int m=0; m<matrix[0].length; m++) {
                System.out.print(df.format(matrix[n][m]) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double matrix_A[][] = matrix_Read(input, 5, 4);
        double matrix_B[][] = matrix_Read(input, 4, 6);

        double matrix_result[][] = matrix_Multiply(matrix_A, matrix_B);

        matrix_Print(matrix_result);

        input.close();
    }
}
