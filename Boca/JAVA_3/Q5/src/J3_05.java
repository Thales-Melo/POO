import java.util.Scanner;

public class J3_05 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String dir = input.nextLine();
        int sizeFibonacci = input.nextInt();
        
        input.close();
        
        Fibonacci.saveFibonacci(sizeFibonacci, dir);
    }

}