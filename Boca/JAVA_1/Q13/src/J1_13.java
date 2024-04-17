import java.util.Scanner;

public class J1_13 {

    public static double[][] matrixRead(int l, int c, Scanner input) {
        double matrix[][] = new double[l][c];

        for (int i=0; i<l; i++) {
            for (int k=0; k<c; k++) {
                matrix[i][k] = input.nextDouble();
            }
        }

        return matrix;
    }


    public static boolean isDiagonal(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isDiagonalSuperior(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isDiagonalInferior(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[0].length-1; j > i; j--) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        double matrix[][] = matrixRead(x, x, input);

        char op = input.next().charAt(0);

        switch (op) {
            case 'i':
                if (isDiagonalInferior(matrix)) {
                    System.out.println("A matriz é diagonal inferior");
                } 
                else {
                    System.out.println("A matriz não é diagonal inferior");
                }
                break;
            
            case 's':
                if (isDiagonalSuperior(matrix)) {
                    System.out.println("A matriz é diagonal superior");
                } 
                else {
                    System.out.println("A matriz não é diagonal superior");
                }
                break;
            
            case 'd':
                if (isDiagonal(matrix)) {
                    System.out.println("A matriz é diagonal");
                } 
                else {
                    System.out.println("A matriz não é diagonal");
                }
                break;

            default:
                break;
        }

        input.close();
    }
}
