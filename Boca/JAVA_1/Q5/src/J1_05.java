import java.util.Scanner;

public class J1_05 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        int vec[] = new int[10];
        int PA = 1;
        int diff = 0;
        
        for (int i=0; i<10; i++) {
            vec[i] = input.nextInt();
            if (i==1) {
                diff = vec[1]-vec[0];
            }
            if (i>0) {
                if (vec[i]-vec[i-1] != diff) {
                    PA = 0;
                    break;
                }
            }
        }

        if (PA == 1) {
            System.out.println("Sim" + " " + vec[0] + " " + diff);
        }
        else {
            System.out.println("Nao");
        }

        input.close();

    }
}
