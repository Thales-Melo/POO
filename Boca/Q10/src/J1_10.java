import java.util.Scanner;

public class J1_10 {
    public static void main(String[] args) throws Exception {

    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    int first_last = 0;
    int second_last = 0;
    
    
    
    if (n>0) {
        System.out.printf("0 ");
        System.out.printf("1 ");
        first_last = 1;
    }

    for (int i=0; i<n-2; i++) {
        int aux = first_last + second_last;
        System.out.printf("%d ", aux);
        second_last = first_last;
        first_last = aux;
    }

    System.out.println();

    input.close();
        
    }
}
