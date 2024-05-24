import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fibonacci {
    public static String geraFibonacci(int n) {
        StringBuilder fibonacci = new StringBuilder();
        int first_last = 0;
        int second_last = 0;

        if (n > 0) {
            fibonacci.append("0 ");
            if (n > 1) {
                fibonacci.append("1 ");
                first_last = 1;
            }
        }

        for (int i = 0; i < n - 2; i++) {
            int aux = first_last + second_last;
            fibonacci.append(aux).append(" ");
            second_last = first_last;
            first_last = aux;
        }

        return fibonacci.toString();
    }


    public static void saveFibonacci (int n, String dir) {
        try {
            if (dir.startsWith("/")) {
                dir = dir.substring(1);
            }
            FileWriter file = new FileWriter(dir + "/" + java.util.UUID.randomUUID().toString());
            PrintWriter saveFile = new PrintWriter(file);
            String fibonacci = geraFibonacci(n);
            saveFile.println(fibonacci);
            System.out.println(fibonacci.length());
            saveFile.close();
        }
        catch (IOException e) {
            System.out.println("Diretorio nao existe: " + dir);
        }
    }



}
