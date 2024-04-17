import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class J1_12 {
    public static double[][] matrix_read(int l, int c, Scanner input) {
        double matrix[][] = new double[l][c];

        for (int i=0; i<l; i++) {
            for (int k=0; k<c; k++) {
                matrix[i][k] = input.nextDouble();
            }
        }

        return matrix;
    }

    public static void matrix_print(double matrix[][], int l, int c) {
        DecimalFormat df = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US));
        for (int i=0; i<l; i++) {
            for (int k=0; k<c; k++) {
                if (k != c-1) {
                System.out.print(df.format(matrix[i][k]) + " ");
                }
                else {
                    System.out.println(df.format(matrix[i][k]) + " ");
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        
        int l = input.nextInt();
        int c = input.nextInt();

        double matrix[][] = matrix_read(l, c, input);

        matrix_print(matrix, l, c);

        input.close();
    }
}
