import java.util.Scanner;

public class J1_03 {
   
    public static int MDC (int x, int y) {
        if (x == y) {
            return x;
        }
        else {
            if (x > y) {
                return MDC(x-y, y);
            }
            else {
                return MDC(x, y-x);
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(MDC(x, y));
    
        input.close();
    }
}

