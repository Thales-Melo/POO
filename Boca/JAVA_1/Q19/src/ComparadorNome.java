import java.util.Comparator;

public class ComparadorNome implements Comparator<Pessoa>{
    public int compare (Pessoa pessoa_1, Pessoa pessoa_2) {
        return pessoa_1.getNome().compareTo(pessoa_2.getNome());
    }
}