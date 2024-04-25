import java.util.Comparator;

public class ComparadorIdade implements Comparator<Pessoa>{
    public int compare (Pessoa pessoa_1, Pessoa pessoa_2) {
        return pessoa_2.getIdade() - pessoa_1.getIdade();
    }
}
