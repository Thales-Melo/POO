import java.util.ArrayList;
import java.util.List;

public class Primos {
    
    public static List<Integer> decompor_primos(int N) {
        List<Integer> fatoresPrimos = new ArrayList<>();

        while (N % 2 == 0) {
            fatoresPrimos.add(2);
            N /= 2;
        }

        int i = 3;
        while (N != 1) {
            while (N % i == 0) {
                fatoresPrimos.add(i);
                N /= i;
            }
            i += 2;
        }

        if (N > 2) {
            fatoresPrimos.add(N);
        }

        return fatoresPrimos;
    }
}

