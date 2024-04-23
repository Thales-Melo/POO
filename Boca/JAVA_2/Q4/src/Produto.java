import java.util.Locale;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString () {
        return String.format(Locale.US, "%s (R$ %.2f)", nome, preco);
    }


}
