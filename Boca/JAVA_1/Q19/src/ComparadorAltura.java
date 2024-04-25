import java.util.Comparator;

public class ComparadorAltura implements Comparator<Pessoa>{
    public int compare (Pessoa pessoa_1, Pessoa pessoa_2) {
        double altura_1 = pessoa_1.getAltura();
        double altura_2 = pessoa_2.getAltura();
    
        if (altura_1 > altura_2) {
            return 1;
        }
        else if (altura_2 > altura_1) {
            return -1;
        }
        else {
            return 0;
        }
    }
}