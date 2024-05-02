import java.util.List;

public class J1_17 {
    public static void main(String[] args) throws Exception {
        int N = 120;
        List<Integer> fatoresPrimos = Primos.decompor_primos(N);
        
        System.out.printf("[");
        for(int i = 0; i < fatoresPrimos.size(); i++) {
            if (i == fatoresPrimos.size() - 1) {
                System.out.printf("%d",fatoresPrimos.get(i));
            }
            else {
                System.out.printf("%d, ",fatoresPrimos.get(i));
            }
        }
        System.out.printf("]");
    }
}
