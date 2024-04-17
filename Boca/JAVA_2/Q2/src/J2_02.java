import java.util.Scanner;

public class J2_02 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        long seed = input.nextLong();
        Aleatorio rand = new Aleatorio(100, seed);
        for (int i=0; i<10; i++) {
            System.out.printf("%d ", rand.getNumGenerated());
            rand.renovar();
        }

        input.close();
    }
}
