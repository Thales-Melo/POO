import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class MatrixUtils {

    private MatrixUtils() {
    }


    public static double[][] read(int l, int c, Scanner input) {
        double matrix[][] = new double[l][c];

        for (int i = 0; i < l; i++) {
            for (int k = 0; k < c; k++) {
                matrix[i][k] = input.nextDouble();
            }
        }

        return matrix;
    }


    public static void print(double matrix[][]) {
        DecimalFormat df = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US));
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < columns; k++) {
                if (k != columns - 1) {
                    System.out.print(df.format(matrix[i][k]) + " ");
                } else {
                    System.out.println(df.format(matrix[i][k]) + " ");
                }
            }
        }
    }


    public static double[][] multiply(double[][] matrix_A, double[][] matrix_B) {
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


    public static double[][] sum(double matrix_A[][], double matrix_B[][]) {
        int rows = matrix_A.length;
        int columns = matrix_A[0].length;
        double matrix_result[][] = new double[rows][columns];
        
        for (int i=0; i<rows; i++) {
            for (int k=0; k<columns; k++) {
                matrix_result[i][k] = matrix_A[i][k] + matrix_B[i][k];
            }
        }

        return matrix_result;
    }
}