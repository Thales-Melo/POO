import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PessoaManager {
    List<Pessoa> lista;

    public PessoaManager () {
        this.lista = new ArrayList<>();
    }

    public void add (Pessoa pessoa) {
        this.lista.add(pessoa);
    }

    public void sort (int op) {
        switch (op) {
            // 1 = NOME
            case 1:
                Collections.sort(this.lista, new ComparadorNome());
                break;
    
            // 2 = IDADE
            case 2:
                Collections.sort(this.lista, new ComparadorIdade());
                break;
    
            // 3 = ALTURA
            case 3:
                Collections.sort(this.lista, new ComparadorAltura());
                break;
    
            default:
                break;
        }
    }

    public void print (int op) {
        sort(op);

        for (Pessoa pessoa : lista) {
            System.out.println(pessoa);
        }
    }

}
